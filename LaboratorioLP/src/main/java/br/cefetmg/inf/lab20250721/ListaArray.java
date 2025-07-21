package br.cefetmg.inf.lab20250721;

public class ListaArray implements Lista{
    String[] elementos;
    int tamanho;

    ListaArray(int x) {
        elementos = new String[x];
        tamanho = 0;
    }

    public void inserirInicio(String item) {
        aumentarTamanho();
        for (int i = tamanho; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[0] = item;
        tamanho++;
    }

    public void inserirFim(String item) {
        aumentarTamanho();
        elementos[tamanho++] = item;
    }

    public boolean inserirPosicao(int posicao, String item) {
        if (posicao < 0 || posicao > tamanho) return false;
        aumentarTamanho();
        for (int i = tamanho; i > posicao; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[posicao] = item;
        tamanho++;
        return true;
    }

    public String removerInicio() {
        if (estaVazia()) return null;
        String removido = elementos[0];
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return removido;
    }

    public String removerFim() {
        if (estaVazia()) return null;
        return elementos[--tamanho];
    }

    public String removerPosicao(int posicao) {
        if (estaVazia() || posicao < 0 || posicao >= tamanho) return null;
        String removido = elementos[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return removido;
    }

    public String obterInicio() {
        return estaVazia() ? null : elementos[0];
    }

    public String obterFim() {
        return estaVazia() ? null : elementos[tamanho - 1];
    }

    public String obterPosicao(int posicao) {
        if (estaVazia() || posicao < 0 || posicao >= tamanho) return null;
        return elementos[posicao];
    }

    public int pesquisar(String item) {
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
            String[] novo = new String[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novo[i] = elementos[i];
            }
            elementos = novo;
        }
    }
}

