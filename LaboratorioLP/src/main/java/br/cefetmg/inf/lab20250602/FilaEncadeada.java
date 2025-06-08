package br.cefetmg.inf.lab20250602;
class No {
    int valor;
    No proximo;

    No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}
public class FilaEncadeada {
    No inicio;
    No fim;

    FilaEncadeada() {
        inicio = null;
        fim = null;
    }

    void enfileirar(int valor) {
        No novoNo = new No(valor);
        if (estaVazia()) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }
    Integer desenfileirar() {
        if (estaVazia()) {
            return null;
        }
        int valor = inicio.valor;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return valor;
    }

    int valorInicial() {
        if (estaVazia()) {
            throw new RuntimeException("Fila vazia.");
        }
        return inicio.valor;
    }
    
    boolean estaVazia() {
        return inicio == null;
    }
}