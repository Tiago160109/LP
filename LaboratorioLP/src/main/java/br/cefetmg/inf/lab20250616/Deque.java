package br.cefetmg.inf.lab20250616;

public interface Deque {

    /**
     * Insere um elemento no inicio da deque.
     * 
     * @param item o elemento que será adicionado.
     */
    public void inserirNoInicio(int item);

    /**
     * Insere um elemento no final da deque.
     * 
     * @param item o elemento que será adicionado.
     */
    public void inserirNoFim(int item);
    
    /**
     * Remove o elemento no início da deque.
     * 
     * @return o elemento no início da deque ou {@code null} se a deque
     * estiver vazia.
     */
    public Integer removerPrimeiro();
    
    /**
     * Remove o elemento no final da deque.
     * 
     * @return o elemento no final da deque ou {@code null} se a deque
     * estiver vazia.
     */
    public Integer removerUltimo();
    
    /**
     * Retorna, sem remover, o elemento no início da deque.
     * 
     * @return o primeiro elemento da deque ou {@code null} se a deque
     * estiver vazia.
     */    
    public Integer obterPrimeiro();

    /**
     * Retorna, sem remover, o elemento no final da deque.
     * 
     * @return o último elemento da deque ou {@code null} se a deque
     * estiver vazia.
     */    
    public Integer obterUltimo();
    
    /** 
     * @return {@code false} se a deque possuir elementos.
     */
    public boolean estaVazia();
    
    /** 
     * @return o número de elementos presentes na deque.
     */
    public int tamanho();
}
