package br.cefetmg.inf.lab20250714;

public class FilaCircular extends AbstractFila{
    Laco inicio;
    Laco fim;

    private class Laco {
        Object item;
        Laco proximo;

        Laco(Object item) {
            this.item = item;
            this.proximo = null;
        }
    }
    @Override
    public void enfileirar(Object item) {
        Laco novoNo = new Laco(item);

        if (estaVazia()) {
            inicio = fim = novoNo;
            fim.proximo = inicio;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
            fim.proximo = inicio;
        }
        tamanho++;
    }

    @Override
    public Object desenfileirar() {
        if (estaVazia()) {
            return null;
        }

        Object item = inicio.item;

        if (inicio == fim) { 
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            fim.proximo = inicio; 
        }
        tamanho--;
        return item;
    }
    @Override
    public Object obterNoInicio() {
        if (estaVazia()) {
            return null;
        }
        return inicio.item;
    }
}