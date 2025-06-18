package br.cefetmg.inf.lab20250616;
class No {
    int item;
    No proximo;

    No(int item) {
        this.item = item;
        this.proximo = null;
    }
}
public class FilaEncadeada implements Fila{
    No inicio;
    No fim;
    int tam;
    FilaEncadeada() {
        inicio = null;
        fim = null;
    }

    public void enfileirar(int item) {
        No novoNo = new No(item);
        if (estaVazia()) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
        tam++;
    }
    public Integer desenfileirar() {
        if (estaVazia()) {
            return null;
        }
        int item = inicio.item;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        tam--;
        return item;
    }

    public Integer obterNoInicio() {
        if (estaVazia()) {
            return null;
        }
        return inicio.item;
    }
    public int tamanho(){
        return tam;
    }
    public boolean estaVazia() {
        return inicio == null;
    }
}