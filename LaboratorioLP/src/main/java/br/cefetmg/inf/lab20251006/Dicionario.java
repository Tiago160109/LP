package br.cefetmg.inf.lab20251006;

public class Dicionario<T> {
    ListaEncadeada<T> lista;

    public Dicionario() {
        this.lista = new ListaEncadeada<>();
    }

    public void inserir(T item) {
        for (int i = 0; i < lista.tamanho(); i++) {
            if (lista.obterPosicao(i).equals(item)) {
                return;
            }
        }
        lista.inserirFim(item);
    }

    public T remover(T item) throws Exception {
        if (lista.estaVazia()) {
            throw new DicionarioVazioException("Dicionário vazio");
        }
        
        int p = lista.pesquisar(item);
        if (p == -1) {
            throw new ItemNaoEncontradoException("Item não encontrado no dicionário");
        }
        
        return lista.removerPosicao(p);
    }

    public T obter(T item) throws Exception {
        if (lista.estaVazia()) {
            throw new DicionarioVazioException("Dicionário vazio");
        }

        int p = lista.pesquisar(item);
        if (p == -1) {
            throw new ItemNaoEncontradoException("Item não encontrado no dicionário");
        }

        return lista.obterPosicao(p);
    }
}


