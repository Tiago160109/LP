package br.cefetmg.inf.lab20250609;
class No {
    int valor;
    No proximo;

    No(int valor) {
        this.valor = valor;
    }
}
public class ListaEncadeada {
    No primeiro;
    No ultimo;
    int qtdElementos;
    
    ListaEncadeada() {
        primeiro = null;
        ultimo = null;
        qtdElementos = 0;
    }

    void inserirInicio(int valor) {
        No novoNo = new No(valor);
        if (estaVazia()) {
            primeiro = ultimo = novoNo;
        } else {
            novoNo.proximo = primeiro;
            primeiro = novoNo;
        }
        qtdElementos++;
    }

    void inserirFim(int valor) {
        No novoNo = new No(valor);
        if (estaVazia()) {
            primeiro = ultimo = novoNo;
        } else {
            ultimo.proximo = novoNo;
            ultimo = novoNo;
        }
        qtdElementos++;
    }

    void inserirPosicao(int valor, int posicao) {
        if (posicao < 0 || posicao > qtdElementos) return;

        No novoNo = new No(valor);
        if (posicao == 0) {
            inserirInicio(valor);
        } else if (posicao == qtdElementos) {
            inserirFim(valor);
        } else {
            No aux = primeiro;
            No anterior = null;
            for (int i = 0; i < posicao; i++) {
                anterior = aux;
                aux = aux.proximo;
            }
            anterior.proximo = novoNo;
            novoNo.proximo = aux;
            qtdElementos++;
        }
    }

    Integer removerInicio() {
        if (estaVazia()) return null;

        int valor = primeiro.valor;
        primeiro = primeiro.proximo;
        qtdElementos--;

        if (primeiro == null) ultimo = null;

        return valor;
    }

    Integer removerFim() {
        return removerPosicao(qtdElementos - 1);
    }

    Integer removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= qtdElementos || estaVazia()) return null;

        No aux = primeiro;
        No anterior = null;

        for (int i = 0; i < posicao; i++) {
            anterior = aux;
            aux = aux.proximo;
        }

        if (anterior == null) {
            primeiro = aux.proximo;
            if (primeiro == null) ultimo = null;
        } else {
            anterior.proximo = aux.proximo;
            if (anterior.proximo == null) ultimo = anterior;
        }

        qtdElementos--;
        return aux.valor;
    }

    Integer obterInicio() {
        if (estaVazia()) {
            return null;
        } else {
            return primeiro.valor;
        }
    }

    Integer obterFim() {
        if (estaVazia()) {
            return null;
        } else {
            return ultimo.valor;
        }
    }

    Integer obterPosicao(int posicao) {
        if (posicao < 0 || posicao >= qtdElementos || estaVazia()) return null;

        No aux = primeiro;
        for (int i = 0; i < posicao; i++) {
            aux = aux.proximo;
        }
        return aux.valor;
    }

    int tamanho() {
        return qtdElementos;
    }

    boolean estaVazia() {
        return qtdElementos == 0;
    }

    Integer pesquisar(int valor) {
        No aux = primeiro;
        for (int i = 0; i < qtdElementos; i++) {
            if (aux.valor == valor) return i;
            aux = aux.proximo;
        }
        return null;
    }
}