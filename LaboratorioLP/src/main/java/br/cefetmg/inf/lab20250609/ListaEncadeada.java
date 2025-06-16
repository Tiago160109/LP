package br.cefetmg.inf.lab20250609;
class Laco {
    int valor;
    Laco proximo;

    Laco(int valor) {
        this.valor = valor;
    }
}
public class ListaEncadeada {
    Laco primeiro;
    Laco ultimo;
    int qtdElementos;
    
    ListaEncadeada() {
        primeiro = null;
        ultimo = null;
        qtdElementos = 0;
    }

    void inserirInicio(int valor) {
        Laco novoLaco = new Laco(valor);
        if (estaVazia()) {
            primeiro = ultimo = novoLaco;
        } else {
            novoLaco.proximo = primeiro;
            primeiro = novoLaco;
        }
        qtdElementos++;
    }

    void inserirFim(int valor) {
        Laco novoLaco = new Laco(valor);
        if (estaVazia()) {
            primeiro = ultimo = novoLaco;
        } else {
            ultimo.proximo = novoLaco;
            ultimo = novoLaco;
        }
        qtdElementos++;
    }

    void inserirPosicao(int valor, int posicao) {
        if (posicao < 0 || posicao > qtdElementos) return;

        Laco novoLaco = new Laco(valor);
        if (posicao == 0) {
            inserirInicio(valor);
        } else if (posicao == qtdElementos) {
            inserirFim(valor);
        } else {
            Laco aux = primeiro;
            Laco anterior = null;
            for (int i = 0; i < posicao; i++) {
                anterior = aux;
                aux = aux.proximo;
            }
            anterior.proximo = novoLaco;
            novoLaco.proximo = aux;
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

        Laco aux = primeiro;
        Laco anterior = null;

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

        Laco aux = primeiro;
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
        Laco aux = primeiro;
        for (int i = 0; i < qtdElementos; i++) {
            if (aux.valor == valor) return i;
            aux = aux.proximo;
        }
        return null;
    }
}