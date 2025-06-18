package br.cefetmg.inf.lab20250616;

public class PilhaArray implements Pilha {
    private int[] itens;
    private int topo; 

    public PilhaArray() {
        itens = new int[10];
        topo = -1; 
    }

    public void empilhar(int item) {
        aumentarCapacidade();
        itens[++topo] = item;
    }

    public Integer desempilhar() {
        if (estaVazia()) return null;
        return itens[topo--];
    }

    public Integer obterNoTopo() {
        if (estaVazia()) return null;
        return itens[topo];
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public int tamanho() {
        return topo + 1;
    }

    private void aumentarCapacidade() {
        if (topo + 1 == itens.length) {
            int[] novo = new int[itens.length * 2];
            for (int i = 0; i < itens.length; i++) {
                novo[i] = itens[i];
            }
            itens = novo;
        }
    }
}
