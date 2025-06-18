package br.cefetmg.inf.lab20250616;
class Laco {
    int item;
    Laco proximo;

    Laco(int item) {
        this.item = item;
        this.proximo = null;
    }
}
public class FilaCircular implements Fila{
    Laco inicio;
    Laco fim;

    FilaCircular() {
        inicio = null;
        fim = null;
    }

    public void enfileirar(int item) {
        Laco novoNo = new Laco(item);

        if (estaVazia()) {
            inicio = fim = novoNo;
            fim.proximo = inicio;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
            fim.proximo = inicio;
        }
    }

    public Integer desenfileirar() {
        if (estaVazia()) {
            return null;
        }

        int item = inicio.item;

        if (inicio == fim) { 
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            fim.proximo = inicio; 
        }

        return item;
    }
    public int tamanho() {
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
    public Integer obterNoInicio() {
        if (estaVazia()) {
            return null;
        }
        return inicio.item;
    }

    public boolean estaVazia() {
        return inicio == null;
    }
}