package br.cefetmg.inf.lab20250623;

public interface Pilha {
    /**
     * Insere um elemento no topo da pilha.
     * 
     * @param item o elemento que será adicionado.
     */
    public void empilhar(int item);

    /**
     * Remove o elemento no topo da pilha.
     * 
     * @return o elemento no topo da pilha ou {@code null} se a pilha 
     * estiver vazia.
     */
    public Integer desempilhar();
    
    /**
     * Retorna, sem remover, o elemento no topo da pilha.
     * 
     * @return o elemento no topo da pilha ou {@code null} se a pilha
     * estiver vazia.
     */
    public Integer obterNoTopo();
    
    /** 
     * @return {@code false} se a pilha possuir elementos.
     */
    public boolean estaVazia();
    
    /** 
     * @return o número de elementos presentes na pilha.
     */
    public int tamanho();
}
