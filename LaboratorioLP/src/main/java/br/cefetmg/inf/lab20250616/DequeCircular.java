package br.cefetmg.inf.lab20250616;

public class DequeCircular implements Deque {
    private int[] itens;
    private int inicio;   
    private int fim;      
    private int tamanho;

    public DequeCircular() {
        itens = new int[10];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void inserirNoInicio(int item) {
        aumentarCapacidade();
        inicio = (inicio - 1 + itens.length) % itens.length;
        itens[inicio] = item;
        tamanho++;
    }

    public void inserirNoFim(int item) {
        aumentarCapacidade();
        itens[fim] = item;
        fim = (fim + 1) % itens.length;
        tamanho++;
    }

    public Integer removerPrimeiro() {
        if (estaVazia()) return null;
        int removido = itens[inicio];
        inicio = (inicio + 1) % itens.length;
        tamanho--;
        return removido;
    }

    public Integer removerUltimo() {
        if (estaVazia()) return null;
        fim = (fim - 1 + itens.length) % itens.length;
        int removido = itens[fim];
        tamanho--;
        return removido;
    }

    public Integer obterPrimeiro() {
        if (estaVazia()) return null;
        return itens[inicio];
    }

    public Integer obterUltimo() {
        if (estaVazia()) return null;
        int ultimoIndice = (fim - 1 + itens.length) % itens.length;
        return itens[ultimoIndice];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    private void aumentarCapacidade() {
        if (tamanho == itens.length) {
            int novoTamanho = itens.length * 2;
            int[] novo = new int[novoTamanho];
            for (int i = 0; i < tamanho; i++) {
                novo[i] = itens[(inicio + i) % itens.length];
            }
            itens = novo;
            inicio = 0;
            fim = tamanho;
        }
    }
}