package br.cefetmg.inf.lab20250609;
class No {
    int valor;
    No anterior;
    No proximo;

    No(int valor) {
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }
}

public class ListaDuplamenteEncadeada {
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

    public void inserirNoInicio(int valor) {
        No novo = new No(valor);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tamanho++;
    }

    public void inserirNoFim(int valor) {
        No novo = new No(valor);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tamanho++;
    }

    public boolean inserirNaPosicao(int posicao, int valor) {
        if (posicao < 0 || posicao > tamanho) return false;
        if (posicao == 0) {
            inserirNoInicio(valor);
        } else if (posicao == tamanho) {
            inserirNoFim(valor);
        } else {
            No novo = new No(valor);
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

    public Integer removerDoInicio() {
        if (estaVazia()) return null;
        int valor = inicio.valor;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
        return valor;
    }

    public Integer removerDoFim() {
        if (estaVazia()) return null;
        int valor = fim.valor;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
        return valor;
    }

    public Integer removerDaPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        if (posicao == 0) return removerDoInicio();
        if (posicao == tamanho - 1) return removerDoFim();

        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        int valor = atual.valor;
        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;
        tamanho--;
        return valor;
    }

    public Integer obterInicio() {
        if (estaVazia()) {
            return null;
        } else {
            return inicio.valor;
        }
    }

    public Integer obterFim() {
        if (estaVazia()) {
            return null;
        } else {
            return fim.valor;
        }
    }

    public Integer obterPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual.valor;
    }

    public int pesquisar(int valor) {
        No atual = inicio;
        int posicao = 0;
        while (atual != null) {
            if (atual.valor == valor) return posicao;
            atual = atual.proximo;
            posicao++;
        }
        return -1;
    }

    public void imprimir() {
        No atual = inicio;
        while (atual != null) {
            System.out.printf("%d ", atual.valor);
            atual = atual.proximo;
        }
        System.out.println();
    }
}