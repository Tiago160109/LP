package br.cefetmg.inf.lab20250714;

public abstract class AbstractFila implements Fila{
    int tamanho;
    public AbstractFila(){
        tamanho=0;
    }
    @Override
        public boolean estaVazia(){
        return tamanho == 0;
    }
    @Override
    public int tamanho(){
        return tamanho;
    }
}