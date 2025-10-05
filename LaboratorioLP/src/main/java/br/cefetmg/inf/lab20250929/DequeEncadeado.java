package br.cefetmg.inf.lab20250929;

public class DequeEncadeado<T> implements Deque<T> {

    private No<T> inicio;
    private No<T> fim;
    private int tam;

    private static class No<T> {

        T valor;
        No<T> proximo;
        No<T> anterior;

        No(T valor) {
            this.valor = valor;
        }
    }

    DequeEncadeado() {
        inicio = null;
        fim = null;
        tam = 0;
    }

    @Override
    public void inserirNoInicio(T item) {
        No<T> novo = new No<>(item);
        if (estaVazia()) {
            inicio = novo;
            fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tam++;
    }

    @Override
    public void inserirNoFim(T item) {
        No<T> novo = new No<>(item);
        if (estaVazia()) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tam++;
    }

    @Override
    public T removerPrimeiro() throws EmptyDequeException{
        
        if (estaVazia()) {
            throw new EmptyDequeException("Deque Vazio");
        }
        T valor = inicio.valor;
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tam--;
        return valor;
    }

    @Override
    public T removerUltimo() throws EmptyDequeException{
        if (estaVazia()) {
            throw new EmptyDequeException("Deque Vazio");
        }
        T valor = fim.valor;
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tam--;
        return valor;
    }

    @Override
    public T obterPrimeiro() throws EmptyDequeException{
        if (estaVazia()) {
            throw new EmptyDequeException("Deque Vazio");
        }
        T valor = inicio.valor;
        return valor;
    }

    @Override
    public T obterUltimo() throws EmptyDequeException{
        if (estaVazia()) {
            throw new EmptyDequeException("Deque Vazio");
        }
        T valor = fim.valor;
        return valor;
    }

    @Override
    public boolean estaVazia() {
        return tam == 0;
    }

    @Override
    public int tamanho() {
        return tam;
    }
    public Object[] toArray() {
        Object[] array = new Object[tam];
        No<T> atual = inicio;
        int i = 0;
        while (atual != null) {
            array[i++] = atual.valor;
            atual = atual.proximo;
        }
        return array;
    }
}