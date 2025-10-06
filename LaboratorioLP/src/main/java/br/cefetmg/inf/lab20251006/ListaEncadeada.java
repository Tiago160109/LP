package br.cefetmg.inf.lab20251006;

public class ListaEncadeada<T> {
    class Laco {
        T item;
        Laco proximo;

        Laco(T item) {
            this.item = item;
        }
    }

    private Laco primeiro;
    private Laco ultimo;
    private int qtdElementos;

    public ListaEncadeada() {
        primeiro = null;
        ultimo = null;
        qtdElementos = 0;
    }

    public void inserirInicio(T item) {
        if (item == null) throw new NullPointerException("Item não pode ser nulo");
        Laco novoLaco = new Laco(item);
        if (estaVazia()) {
            primeiro = ultimo = novoLaco;
        } else {
            novoLaco.proximo = primeiro;
            primeiro = novoLaco;
        }
        qtdElementos++;
    }

    public void inserirFim(T item) {
        if (item == null) throw new NullPointerException("Item não pode ser nulo");
        Laco novoLaco = new Laco(item);
        if (estaVazia()) {
            primeiro = ultimo = novoLaco;
        } else {
            ultimo.proximo = novoLaco;
            ultimo = novoLaco;
        }
        qtdElementos++;
    }


    public void inserirPosicao(int posicao, T item) {
        if (item == null) throw new NullPointerException("Item não pode ser nulo");
        if (posicao < 0 || posicao > qtdElementos) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }

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
            Laco novoLaco = new Laco(item);
            anterior.proximo = novoLaco;
            novoLaco.proximo = aux;
            qtdElementos++;
        }
    }

    public T removerInicio() {
        if (estaVazia()) throw new EmptyListaException("Lista vazia, não é possível remover.");
        T item = primeiro.item;
        primeiro = primeiro.proximo;
        qtdElementos--;

        if (primeiro == null) ultimo = null;
        return item;
    }

    public T removerFim() {
        return removerPosicao(qtdElementos - 1);
    }

    public T removerPosicao(int posicao) {
        if (estaVazia()) throw new EmptyListaException("Lista vazia, não é possível remover.");
        if (posicao < 0 || posicao >= qtdElementos) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }

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

    public T obterInicio() {
        if (estaVazia()) throw new EmptyListaException("Lista vazia, não é possível obter.");
        return primeiro.item;
    }

    public T obterFim() {
        if (estaVazia()) throw new EmptyListaException("Lista vazia, não é possível obter.");
        return ultimo.item;
    }

    public T obterPosicao(int posicao) {
        if (estaVazia()) throw new EmptyListaException("Lista vazia, não é possível obter.");
        if (posicao < 0 || posicao >= qtdElementos) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }

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

    public int pesquisar(T item) {
        if (item == null) throw new NullPointerException("Item não pode ser nulo");
        Laco aux = primeiro;
        for (int i = 0; i < qtdElementos; i++) {
            if (item.equals(aux.item)) return i;
            aux = aux.proximo;
        }
        return -1;
    }
}
