package br.cefetmg.inf.lab20250616;

public class PilhaEncadeada implements Pilha {

    private static class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private No topo;
    private int tamanho;

    public PilhaEncadeada() {
        topo = null;
        tamanho = 0;
    }

    public void empilhar(int item) {
        No novoNo = new No(item);
        novoNo.proximo = topo;
        topo = novoNo;
        tamanho++;
    }

    public Integer desempilhar() {
        if (estaVazia()) return null;
        int valor = topo.valor;
        topo = topo.proximo;
        tamanho--;
        return valor;
    }

    public Integer obterNoTopo() {
        if (estaVazia()) return null;
        return topo.valor;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}
