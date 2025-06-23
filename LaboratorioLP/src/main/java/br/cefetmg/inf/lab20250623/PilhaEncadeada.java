package br.cefetmg.inf.lab20250623;

public class PilhaEncadeada implements Pilha {
    
    private Nodo topo;
    private int tamanho;
    
    static class Nodo {
        Integer valor;
        Nodo proximo;
        
        Nodo() {
            this(null, null);
        }
        
        Nodo (Integer valor, Nodo proximo) {
            this.valor = valor;
            this.proximo = proximo;
        }
    }

    public PilhaEncadeada() {
        topo = null;
        tamanho = 0;
    }
    
    public void empilhar(int item) {
        topo = new Nodo(item, topo);
        tamanho++;
    }
    
    public Integer desempilhar() {
        if (estaVazia())
            return null;
        
        Nodo aux = topo;
        topo = topo.proximo;
        aux.proximo = null;
        tamanho--;
        
        return aux.valor;
    }

    public Integer obterNoTopo() {
        if (estaVazia())
            return null;
        
        return topo.valor;
    }

    public boolean estaVazia() {
        return tamanho() == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}
