package br.cefetmg.inf.lab20250901;

public class ListaEncadeada implements Lista {
    class Laco {
        Object item;
        Laco proximo;

        Laco(Object item) {
            this.item = item;
        }
    }

    Laco primeiro;
    Laco ultimo;
    int qtdElementos;

    ListaEncadeada() {
        primeiro = null;
        ultimo = null;
        qtdElementos = 0;
    }

    @Override
    public void inserirInicio(Object item) {
        try {
            if (item == null) throw new NullPointerException("Item não pode ser nulo");
            Laco novoLaco = new Laco(item);
            if (estaVazia()) {
                primeiro = ultimo = novoLaco;
            } else {
                novoLaco.proximo = primeiro;
                primeiro = novoLaco;
            }
            qtdElementos++;
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    @Override
    public void inserirFim(Object item) {
        try {
            if (item == null) throw new NullPointerException("Item não pode ser nulo");
            Laco novoLaco = new Laco(item);
            if (estaVazia()) {
                primeiro = ultimo = novoLaco;
            } else {
                ultimo.proximo = novoLaco;
                ultimo = novoLaco;
            }
            qtdElementos++;
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    @Override
    public void inserirPosicao(int posicao, Object item) {
        try {
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
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    @Override
    public Object removerInicio() {
        try {
            if (estaVazia()) throw new IllegalStateException("Lista vazia");
            Object item = primeiro.item;
            primeiro = primeiro.proximo;
            qtdElementos--;

            if (primeiro == null) ultimo = null;

            return item;
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return null;
        }
    }

    @Override
    public Object removerFim() {
        return removerPosicao(qtdElementos - 1);
    }

    @Override
    public Object removerPosicao(int posicao) {
        try {
            if (estaVazia()) throw new IllegalStateException("Lista vazia");
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
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return null;
        }
    }

    @Override
    public Object obterInicio() {
        try {
            if (estaVazia()) throw new IllegalStateException("Lista vazia");
            return primeiro.item;
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return null;
        }
    }

    @Override
    public Object obterFim() {
        try {
            if (estaVazia()) throw new IllegalStateException("Lista vazia");
            return ultimo.item;
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return null;
        }
    }

    @Override
    public Object obterPosicao(int posicao) {
        try {
            if (estaVazia()) throw new IllegalStateException("Lista vazia");
            if (posicao < 0 || posicao >= qtdElementos) {
                throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
            }

            Laco aux = primeiro;
            for (int i = 0; i < posicao; i++) {
                aux = aux.proximo;
            }
            return aux.item;
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return null;
        }
    }

    @Override
    public int tamanho() {
        return qtdElementos;
    }

    @Override
    public boolean estaVazia() {
        return qtdElementos == 0;
    }

    @Override
    public int pesquisar(Object item) {
        try {
            if (item == null) throw new NullPointerException("Item não pode ser nulo");
            Laco aux = primeiro;
            for (int i = 0; i < qtdElementos; i++) {
                if (item.equals(aux.item)) return i;
                aux = aux.proximo;
            }
            return -1;
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return -1;
        }
    }
}
