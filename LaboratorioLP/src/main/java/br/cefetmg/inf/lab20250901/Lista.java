package br.cefetmg.inf.lab20250901;

public interface Lista {
    /**
     * Insere um elemento no início da lista.
     * 
     * @param item o elemento que será adicionado.
     */
    public void inserirInicio(Object item);

    /**
     * Insere um elemento no final da lista.
     * 
     * @param item o elemento que será adicionado.
     */
    public void inserirFim(Object item);
    
    /** Insere um elemento numa posição indicada.
     * 
     * @param posicao a posição na qual o elemento será adicionado.
     * @param item o elemento que será adicionado.
     */
    public void inserirPosicao(int posicao, Object item);

    /**
     * Remove o primeiro elemento da lista.
     * 
     * @return o primeiro elemento da lista.
     */
    public Object removerInicio();
    
    /**
     * Remove o último elemento da lista.
     * 
     * @return o último elemento da lista.
     */
    public Object removerFim();
    
    /**
     * Remove o elemento na posição indicada.
     * 
     * @param posicao a posição/índice do elemento que será removido.
     * @return o elemento na posição {@code posicao}.
     */
    public Object removerPosicao(int posicao);

    /**
     * Retorna, sem remover, o primeiro elemento da lista.
     * 
     * @return o primeiro elemento da lista.
     */    
    public Object obterInicio();

    /**
     * Retorna, sem remover, o último item da lista.
     * 
     * @return o último elemento da lista.
     */
    public Object obterFim();
    
    /**
     * Retorna, sem remover, o elemento na posição indicada.
     * 
     * @param posicao a posição/índice do elemento que será retornado.
     * @return o elemento na posição {@code posicao}.
     */
    public Object obterPosicao(int posicao);
    
    /** 
     * @return {@code false} se a lista possuir elementos.
     */
    public boolean estaVazia();
    
    /**
     * Retorna a posição do elemento indicado.
     * 
     * @param item o elemento que será procurado na lista.
     * @return a posição do {@code item} na lista ou -1 se o item não for localizado.
     */
    public int pesquisar(Object item);
    
    /** 
     * @return o número de elementos presentes na lista.
     */
    public int tamanho();
}