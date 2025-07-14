package br.cefetmg.inf.lab20250714;

public interface Fila {
    /**
     * Insere um elemento no final da fila.
     * 
     * @param item o elemento que será adicionado.
     */
    public void enfileirar(Object item);
    /**
     * Remove o elemento no início da fila.
     * 
     * @return o elemento no início da fila ou {@code null} se a fila
     * estiver vazia.
     */
    public Object desenfileirar();
    /**
     * Retorna, sem remover, o elemento no início da fila.
     * 
     * @return o primeiro elemento da fila ou {@code null} se a fila
     * estiver vazia.
     */    
    public Object obterNoInicio();
    
    /** 
     * @return {@code false} se a fila possuir elementos.
     */
    public boolean estaVazia();
    
    /** 
     * @return o número de elementos presentes na fila.
     */
    public int tamanho();
}
