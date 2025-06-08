package br.cefetmg.inf.lab20250602;
class Laco {
    int valor;
    Laco proximo;

    Laco(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}
public class FilaCircular {
    Laco inicio;
    Laco fim;

    FilaCircular() {
        inicio = null;
        fim = null;
    }

    void enfileirar(int valor) {
        Laco novoNo = new Laco(valor);

        if (estaVazia()) {
            inicio = fim = novoNo;
            fim.proximo = inicio;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
            fim.proximo = inicio;
        }
    }

    Integer desenfileirar() {
        if (estaVazia()) {
            return null;
        }

        int valor = inicio.valor;

        if (inicio == fim) { 
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            fim.proximo = inicio; 
        }

        return valor;
    }
    int tamanho() {
    if (estaVazia()) {
        return 0;
    }

    int contador = 1;
    Laco atual = inicio;

    while (atual != fim) {
        contador++;
        atual = atual.proximo;
    }

    return contador;
    }
    Integer ultimo() {
    if (estaVazia()) {
        return null;
    }
    return fim.valor;
    }
    Integer primeiro() {
        if (estaVazia()) {
            return null;
        }
        return inicio.valor;
    }

    boolean estaVazia() {
        return inicio == null;
    }
}