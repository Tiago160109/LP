package br.cefetmg.inf.lab20250609;
class No {
    int item;
    No anterior;
    No proximo;

    No(int item) {
        this.item = item;
        this.anterior = null;
        this.proximo = null;
    }
}

public class ListaDuplamenteEncadeada implements Lista{
    private No inicio;
    private No fim;
    private int tamanho;

    ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public void inserirInicio(int item) {
        No novo = new No(item);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tamanho++;
    }

    public void inserirFim(int item) {
        No novo = new No(item);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tamanho++;
    }

    public boolean inserirPosicao(int posicao, int item) {
        if (posicao < 0 || posicao > tamanho) return false;
        if (posicao == 0) {
            inserirInicio(item);
        } else if (posicao == tamanho) {
            inserirFim(item);
        } else {
            No novo = new No(item);
            No atual = inicio;
            for (int i = 0; i < posicao; i++) {
                atual = atual.proximo;
            }
            novo.anterior = atual.anterior;
            novo.proximo = atual;
            atual.anterior.proximo = novo;
            atual.anterior = novo;
            tamanho++;
        }
        return true;
    }

    public Integer removerInicio() {
        if (estaVazia()) return null;
        int item = inicio.item;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
        return item;
    }

    public Integer removerFim() {
        if (estaVazia()) return null;
        int item = fim.item;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
        return item;
    }

    public Integer removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        if (posicao == 0) return removerInicio();
        if (posicao == tamanho - 1) return removerFim();

        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        int item = atual.item;
        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;
        tamanho--;
        return item;
    }

    public Integer obterInicio() {
        if (estaVazia()) {
            return null;
        } else {
            return inicio.item;
        }
    }

    public Integer obterFim() {
        if (estaVazia()) {
            return null;
        } else {
            return fim.item;
        }
    }

    public Integer obterPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual.item;
    }

    public int pesquisar(int item) {
        No atual = inicio;
        int posicao = 0;
        while (atual != null) {
            if (atual.item == item) return posicao;
            atual = atual.proximo;
            posicao++;
        }
        return -1;
    }

    public void imprimir() {
        No atual = inicio;
        while (atual != null) {
            System.out.printf("%d ", atual.item);
            atual = atual.proximo;
        }
        System.out.println();
    }
}