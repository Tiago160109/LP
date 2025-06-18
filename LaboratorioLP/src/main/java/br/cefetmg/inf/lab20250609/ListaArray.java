package br.cefetmg.inf.lab20250609;

public class ListaArray implements Lista{
    int[] elementos;
    int tamanho;

    ListaArray() {
        elementos = new int[10];
        tamanho = 0;
    }

    public void inserirInicio(int item) {
        aumentarTamanho();
        for (int i = tamanho; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[0] = item;
        tamanho++;
    }

    public void inserirFim(int item) {
        aumentarTamanho();
        elementos[tamanho++] = item;
    }

    public boolean inserirPosicao(int posicao, int item) {
        if (posicao < 0 || posicao > tamanho) return false;
        aumentarTamanho();
        for (int i = tamanho; i > posicao; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[posicao] = item;
        tamanho++;
        return true;
    }

    public Integer removerInicio() {
        if (estaVazia()) return null;
        int removido = elementos[0];
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return removido;
    }

    public Integer removerFim() {
        if (estaVazia()) return null;
        return elementos[--tamanho];
    }

    public Integer removerPosicao(int posicao) {
        if (estaVazia() || posicao < 0 || posicao >= tamanho) return null;
        int removido = elementos[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return removido;
    }

    public Integer obterInicio() {
        return estaVazia() ? null : elementos[0];
    }

    public Integer obterFim() {
        return estaVazia() ? null : elementos[tamanho - 1];
    }

    public Integer obterPosicao(int posicao) {
        if (estaVazia() || posicao < 0 || posicao >= tamanho) return null;
        return elementos[posicao];
    }

    public int pesquisar(int item) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == item) return i;
        }
        return -1;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    void aumentarTamanho() {
        if (tamanho == elementos.length) {
            int[] novo = new int[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novo[i] = elementos[i];
            }
            elementos = novo;
        }
    }
}

