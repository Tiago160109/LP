package br.cefetmg.inf.lab20250609;

public interface Lista {
    /**
     * Insere um elemento no início da lista.
     * 
     * @param item o elemento que será adicionado.
     */
    public void inserirInicio(int item);

    /**
     * Insere um elemento no final da lista.
     * 
     * @param item o elemento que será adicionado.
     */
    public void inserirFim(int item);
    
    /** Insere um elemento numa posição indicada.
     * 
     * @param posicao posição na qual o elemento será adicionado.
     * @param item elemento que será adicionado.
     * @return {@code false} se a posição não for válida.
     */
    public boolean inserirPosicao(int posicao, int item);

    /**
     * Remove o primeiro elemento da lista.
     * 
     * @return o primeiro elemento da lista.  Retorna {@code null} se a lista 
     * estiver vazia.
     */
    public Integer removerInicio();
    
    /**
     * Remove o último elemento da lista.
     * 
     * @return o último elemento da lista. Retorna {@code null} se a lista 
     * estiver vazia.
     */
    public Integer removerFim();
    
    /**
     * Remove o elemento na posição indicada.
     * 
     * @param posicao posição/índice do elemento que será removido.
     * @return o elemento na posição {@code posicao}. Retorna {@code null} se a 
     * posição não for válida.
     */
    public Integer removerPosicao(int posicao);

    /**
     * Retorna, sem remover, o primeiro elemento da lista.
     * 
     * @return o primeiro elemento da lista. Retorna {@code null} se a lista
     * estiver vazia.
     */    
    public Integer obterInicio();

    /**
     * Retorna, sem remover, o último da lista.
     * 
     * @return o último elemento da lista. Retorna {@code null} se a 
     * lista estiver vazia.
     */
    public Integer obterFim();
    
    /**
     * Retorna, sem remover, o elemento na posição indicada.
     * 
     * @param posicao posição/índice do elemento que será retornado.
     * @return o elemento na posição {@code posicao}. Retorna {@code null} se a 
     * posição não for válida.
     */
    public Integer obterPosicao(int posicao);
    
    /** Retorna {@code false} se a lista possuir elementos. */
    public boolean estaVazia();
    
    /**
     * Retorna a posição do elemento indicado.
     * @param item elemento que será 
     * @return posição do {@code item} na lista. -1 se o item não estiver.
     */
    public int pesquisar(int item);
    
    /** Retorna o número de elementos presentes na lista. */
    public int tamanho();

}