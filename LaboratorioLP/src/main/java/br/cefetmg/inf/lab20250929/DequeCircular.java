package br.cefetmg.inf.lab20250929;

public class DequeCircular<T> implements Deque<T> {
    private T[] itens;
    private int inicio;
    private int fim;
    private int tamanho;

    public DequeCircular() {
        itens = (T[]) new Object[10]; 
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    @Override
    public void inserirNoInicio(T item) {
        aumentarCapacidade();
        inicio = (inicio - 1 + itens.length) % itens.length;
        itens[inicio] = item;
        tamanho++;
    }

    @Override
    public void inserirNoFim(T item) {
        aumentarCapacidade();
        itens[fim] = item;
        fim = (fim + 1) % itens.length;
        tamanho++;
    }

    @Override
    public T removerPrimeiro() throws EmptyDequeException {
        if (estaVazia()) {
            throw new EmptyDequeException("Deque Vazio");
        }
        T removido = itens[inicio];
        inicio = (inicio + 1) % itens.length;
        tamanho--;
        return removido;
    }

    @Override
    public T removerUltimo() throws EmptyDequeException {
        if (estaVazia()) {
            throw new EmptyDequeException("Deque Vazio");
        }
        fim = (fim - 1 + itens.length) % itens.length;
        T removido = itens[fim];
        tamanho--;
        return removido;
    }

    @Override
    public T obterPrimeiro() throws EmptyDequeException {
        if (estaVazia()) {
            throw new EmptyDequeException("Deque Vazio");
        }
        return itens[inicio];
    }

    @Override
    public T obterUltimo() throws EmptyDequeException {
        if (estaVazia()) {
            throw new EmptyDequeException("Deque Vazio");
        }
        int ultimoIndice = (fim - 1 + itens.length) % itens.length;
        return itens[ultimoIndice];
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    private void aumentarCapacidade() {
        if (tamanho == itens.length) {
            T[] novo = (T[]) new Object[itens.length * 2];
            for (int i = 0; i < tamanho; i++) {
                novo[i] = itens[(inicio + i) % itens.length];
            }
            itens = novo;
            inicio = 0;
            fim = tamanho;
        }
    }
      public Object[] toArray() throws EmptyDequeException {
        if (estaVazia()) {
            throw new EmptyDequeException("Deque Vazia");
        }
        Object[] array = new Object[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = itens[(inicio + i) % itens.length];
        }
        return array;
    }
      
}