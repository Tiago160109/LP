package br.cefetmg.inf.lab20250929;
public class DequeArray<T> implements Deque<T> {
    private T[] itens;
    private int inicio;
    private int fim;
    private int tamanho;

    public DequeArray() {
        itens = (T[]) new Object[10];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    @Override
    public void inserirNoInicio(T item) {
        aumentarCapacidade();
        if (inicio > 0) {
            inicio--;
        } else {
            for (int i = tamanho; i > 0; i--) {
                itens[i] = itens[i - 1];
            }
            fim++;
        }
        itens[inicio] = item;
        tamanho++;
    }

    @Override
    public void inserirNoFim(T item) {
        aumentarCapacidade();
        itens[fim] = item;
        fim++;
        tamanho++;
    }

    @Override
    public T removerPrimeiro() throws EmptyDequeException {
        if (estaVazia()) throw new EmptyDequeException("Deque Vazia");
        T removido = itens[inicio];
        itens[inicio] = null;
        inicio++;
        tamanho--;
        return removido;
    }

    @Override
    public T removerUltimo() throws EmptyDequeException {
        if (estaVazia()) throw new EmptyDequeException("Deque Vazia");
        fim--;
        T removido = itens[fim];
        itens[fim] = null;
        tamanho--;
        return removido;
    }

    @Override
    public T obterPrimeiro() throws EmptyDequeException {
        if (estaVazia()) throw new EmptyDequeException("Deque Vazia");
        return itens[inicio];
    }

    @Override
    public T obterUltimo() throws EmptyDequeException {
        if (estaVazia()) throw new EmptyDequeException("Deque Vazia");
        return itens[fim - 1];
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
        if (fim == itens.length) {
            T[] novo = (T[]) new Object[itens.length * 2];
            int j = 0;
            for (int i = inicio; i < fim; i++) {
                novo[j++] = itens[i];
            }
            itens = novo;
            fim = tamanho;
            inicio = 0;
        }
    }

    public Object[] toArray() throws EmptyDequeException {
        if (estaVazia()) throw new EmptyDequeException("Deque Vazia");
        Object[] array = new Object[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = itens[inicio + i];
        }
        return array;
    }
}