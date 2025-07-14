package br.cefetmg.inf.lab20250714;

public class FilaEncadeada extends AbstractFila{
    No inicio;
    No fim;
    int tam;
    private class No {
        Object item;
        No proximo;

        No(Object item) {
            this.item = item;
            this.proximo = null;
        }
    }
    @Override
    public void enfileirar(Object item) {
        No novoNo = new No(item);
        if (estaVazia()) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
        tam++;
    }
    @Override
    public Object desenfileirar() {
        if (estaVazia()) {
            return null;
        }
        Object item = inicio.item;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        tam--;
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