package br.cefetmg.inf.lab20250616;
class No2 {
    int valor;
    No2 proximo;
    No2 anterior;

    No2(int valor) {
        this.valor = valor;
    }
}
public class DequeEncadeado implements Deque {
    private No2 inicio;
    private No2 fim;
    private int tam;
    
    DequeEncadeado() {
        inicio = null;
        fim = null;
        tam = 0;
    }
    
    public void inserirNoInicio(int item) {
        No2 novo = new No2(item);
        if(estaVazia()) {            
            inicio = novo;
            fim = novo;
        }
        else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tam++;
    }
    public void inserirNoFim(int item) {
        No2 novo = new No2(item);
        if(estaVazia()) {
            inicio = novo;
            fim = novo;
        }
        else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tam++;
    }

    public Integer removerPrimeiro() {
        if (estaVazia()) return null;
        int valor = inicio.valor;
        if(inicio == fim) {
            inicio = null;
            fim = null;
        }
        else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tam--;
        return valor;
    }

    public Integer removerUltimo() {
        if (estaVazia()) return null;
        int valor = fim.valor;
        if(inicio == fim) {
            inicio = null;
            fim = null;
        }
        else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tam--;
        return valor;
    }
    
    public Integer obterPrimeiro() {
        if (estaVazia()) return null;
        int valor = inicio.valor;
        return valor;
    }
    public Integer obterUltimo() {
        if (estaVazia()) return null;
        int valor = fim.valor;
        return valor;
    }

    public boolean estaVazia() {
        return tam == 0;
    }
    
    public int tamanho() {
        return tam;
    }
    
}