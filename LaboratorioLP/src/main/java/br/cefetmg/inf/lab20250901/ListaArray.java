package br.cefetmg.inf.lab20250901;

public class ListaArray implements Lista {
    Object[] elementos;
    int tamanho;

    ListaArray() {
        elementos = new Object[10];
        tamanho = 0;
    }

    @Override
    public void inserirInicio(Object item) {
        try {
            if (item == null) throw new NullPointerException("Item não pode ser nulo");
            aumentarTamanho();
            for (int i = tamanho; i > 0; i--) {
                elementos[i] = elementos[i - 1];
            }
            elementos[0] = item;
            tamanho++;
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    @Override
    public void inserirFim(Object item) {
        try {
            if (item == null) throw new NullPointerException("Item não pode ser nulo");
            aumentarTamanho();
            elementos[tamanho++] = item;
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    @Override
    public void inserirPosicao(int posicao, Object item) {
        try {
            if (item == null) throw new NullPointerException("Item não pode ser nulo");
            if (posicao < 0 || posicao > tamanho) {
                throw new IndexOutOfBoundsException("Posição inválida");
            }
            aumentarTamanho();
            for (int i = tamanho; i > posicao; i--) {
                elementos[i] = elementos[i - 1];
            }
            elementos[posicao] = item;
            tamanho++;
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    @Override
    public Object removerInicio() {
        try {
            if (estaVazia()) throw new IllegalStateException("Lista vazia");
            Object removido = elementos[0];
            for (int i = 0; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--;
            return removido;
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return null;
        }
    }

    @Override
    public Object removerFim() {
        try {
            if (estaVazia()) throw new IllegalStateException("Lista vazia");
            return elementos[--tamanho];
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return null;
        }
    }

    @Override
    public Object removerPosicao(int posicao) {
        try {
            if (estaVazia()) throw new IllegalStateException("Lista vazia");
            if (posicao < 0 || posicao >= tamanho) {
                throw new IndexOutOfBoundsException("Posição inválida");
            }
            Object removido = elementos[posicao];
            for (int i = posicao; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--;
            return removido;
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return null;
        }
    }

    @Override
    public Object obterInicio() {
        try {
            if (estaVazia()) throw new IllegalStateException("Lista vazia");
            return elementos[0];
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return null;
        }
    }

    @Override
    public Object obterFim() {
        try {
            if (estaVazia()) throw new IllegalStateException("Lista vazia");
            return elementos[tamanho - 1];
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return null;
        }
    }

    @Override
    public Object obterPosicao(int posicao) {
        try {
            if (estaVazia()) throw new IllegalStateException("Lista vazia");
            if (posicao < 0 || posicao >= tamanho) {
                throw new IndexOutOfBoundsException("Posição inválida" );
            }
            return elementos[posicao];
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return null;
        }
    }

    @Override
    public int pesquisar(Object item) {
        try {
            if (item == null) throw new NullPointerException("Item não pode ser nulo");
            for (int i = 0; i < tamanho; i++) {
                if (item.equals(elementos[i])) return i;
            }
            return -1;
        } catch (Exception e) {
            System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            return -1;
        }
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    void aumentarTamanho() {
        if (tamanho == elementos.length) {
            Object[] novo = new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novo[i] = elementos[i];
            }
            elementos = novo;
        }
    }
}
