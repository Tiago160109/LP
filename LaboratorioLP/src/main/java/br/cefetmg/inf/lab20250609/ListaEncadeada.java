package br.cefetmg.inf.lab20250609;
class Laco {
    int item;
    Laco proximo;

    Laco(int item) {
        this.item = item;
    }
}
public class ListaEncadeada implements Lista{
    Laco primeiro;
    Laco ultimo;
    int qtdElementos;
    
    ListaEncadeada() {
        primeiro = null;
        ultimo = null;
        qtdElementos = 0;
    }

    public void inserirInicio(int item) {
        Laco novoLaco = new Laco(item);
        if (estaVazia()) {
            primeiro = ultimo = novoLaco;
        } else {
            novoLaco.proximo = primeiro;
            primeiro = novoLaco;
        }
        qtdElementos++;
    }

    public void inserirFim(int item) {
        Laco novoLaco = new Laco(item);
        if (estaVazia()) {
            primeiro = ultimo = novoLaco;
        } else {
            ultimo.proximo = novoLaco;
            ultimo = novoLaco;
        }
        qtdElementos++;
    }

    public boolean inserirPosicao(int posicao, int item) {
        if (posicao < 0 || posicao > qtdElementos) return false;

        Laco novoLaco = new Laco(item);
        if (posicao == 0) {
            inserirInicio(item);
        } else if (posicao == qtdElementos) {
            inserirFim(item);
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
        return true;
    }

    public Integer removerInicio() {
        if (estaVazia()) return null;

        int item = primeiro.item;
        primeiro = primeiro.proximo;
        qtdElementos--;

        if (primeiro == null) ultimo = null;

        return item;
    }

    public Integer removerFim() {
        return removerPosicao(qtdElementos - 1);
    }

    public Integer removerPosicao(int posicao) {
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
        return aux.item;
    }

    public Integer obterInicio() {
        if (estaVazia()) {
            return null;
        } else {
            return primeiro.item;
        }
    }

    public Integer obterFim() {
        if (estaVazia()) {
            return null;
        } else {
            return ultimo.item;
        }
    }

    public Integer obterPosicao(int posicao) {
        if (posicao < 0 || posicao >= qtdElementos || estaVazia()) return null;

        Laco aux = primeiro;
        for (int i = 0; i < posicao; i++) {
            aux = aux.proximo;
        }
        return aux.item;
    }

    public int tamanho() {
        return qtdElementos;
    }

    public boolean estaVazia() {
        return qtdElementos == 0;
    }

    public int pesquisar(int item) {
        Laco aux = primeiro;
        for (int i = 0; i < qtdElementos; i++) {
            if (aux.item == item) return i;
            aux = aux.proximo;
        }
        return -1;
    }
}