package br.cefetmg.inf.lab20250609;

public class ListaArray {
    int[] elementos;
    int tamanho;

    ListaArray() {
        elementos = new int[10];
        tamanho = 0;
    }

    void inserirInicio(int valor) {
        aumentarTamanho();
        for (int i = tamanho; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[0] = valor;
        tamanho++;
    }

    void inserirFim(int valor) {
        aumentarTamanho();
        elementos[tamanho++] = valor;
    }

    void inserirPosicao(int valor, int posicao) {
        if (posicao < 0 || posicao > tamanho) return;
        aumentarTamanho();
        for (int i = tamanho; i > posicao; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[posicao] = valor;
        tamanho++;
    }

    Integer removerInicio() {
        if (estaVazia()) return null;
        int removido = elementos[0];
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return removido;
    }

    Integer removerFim() {
        if (estaVazia()) return null;
        return elementos[--tamanho];
    }

    Integer removerPosicao(int posicao) {
        if (estaVazia() || posicao < 0 || posicao >= tamanho) return null;
        int removido = elementos[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return removido;
    }

    Integer obterInicio() {
        return estaVazia() ? null : elementos[0];
    }

    Integer obterFim() {
        return estaVazia() ? null : elementos[tamanho - 1];
    }

    Integer obterPosicao(int posicao) {
        if (estaVazia() || posicao < 0 || posicao >= tamanho) return null;
        return elementos[posicao];
    }

    Integer pesquisar(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == valor) return i;
        }
        return null;
    }

    int tamanho() {
        return tamanho;
    }

    boolean estaVazia() {
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

