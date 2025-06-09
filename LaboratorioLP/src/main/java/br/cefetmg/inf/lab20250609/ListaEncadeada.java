package br.cefetmg.inf.lab20250609;
class No {
    int valor;
    No proximo;
    No(int valor){
        this.valor = valor;
    }
}
public class ListaEncadeada {
    No primeiro;
    No ultimo;
    int qtdElementos;
    ListaEncadeada(){
        primeiro = null;
        ultimo = null;
        qtdElementos = 0;
    }
    void inserirInicio(int valor){
        No novoNo = new No(valor);
        qtdElementos++;
        if(estaVazia()){
            primeiro = novoNo;
            ultimo = novoNo;
        }
        else{
            novoNo.proximo = primeiro;
            primeiro = novoNo;
        }
        
    }
    void inserirFim(int valor){
        No novoNo = new No(valor);
        qtdElementos++;
        if(estaVazia()){
            primeiro = novoNo;
            ultimo = novoNo;
        }
        else{
            novoNo.proximo = ultimo;
            ultimo = novoNo;       
        }
    }
    void inserirPosicao(int valor, int posicao){
        No novoNo = new No(valor);
        qtdElementos++;
        if(estaVazia()){
            primeiro = novoNo;
            ultimo = novoNo;
        }
        else {
            No aux = primeiro;
            No anterior = null;

            for(int i = 0; i < posicao; i++){
                anterior = aux;
                aux = aux.proximo;
            }   
            if(anterior != null){ 
                aux.proximo = anterior.proximo;
                anterior.proximo = novoNo;
                
            }
            else {
                novoNo.proximo = primeiro;
                primeiro = novoNo;
            }
        }
        
    }
    Integer removerInicio(){
        if(estaVazia()){
            return null;
        }
        No aux = primeiro;
        Integer returno = primeiro.valor;
        primeiro = aux.proximo;
        aux.proximo = null;
        return returno;
    }
    Integer removerFim(){
        if(estaVazia()){
            return null;
        }
        else{
            return removerPosicao(qtdElementos - 1);
        }
    }
    Integer removerPosicao(int posicao){
        if(estaVazia()){
            return null;
        }
        No aux = primeiro;
        No anterior = null;
        int returno;
        for(int i = 0; i < posicao; i++){
            anterior = aux;
            aux = aux.proximo;
        }
        if(anterior != null) anterior.proximo = aux.proximo;
        else {
            primeiro = aux.proximo;
            aux.proximo = null;
        }
        qtdElementos--;
        returno = aux.valor;
        return returno;
    }
    Integer obterInicio(){
        return obterPosicao(0);
        
    }
    int obterFim(){
        return obterPosicao(qtdElementos - 1);
    }
    Integer obterPosicao(int posicao){
        if(estaVazia()){
            return null;
        }
        No aux = primeiro;
        int returno;
        for(int i = 0; i < posicao; i++){
            aux = aux.proximo;
        }
        returno = aux.valor;
        return returno;
    }
    int tamanho(){
        return qtdElementos;
    }
    boolean estaVazia(){
        return qtdElementos == 0;
    }
    Integer pesquisar(int valor){
        if(estaVazia()){
            return null;
        }
        No aux = primeiro;
        for(int i = 0; i < qtdElementos; i++){
            if(aux.valor == valor){
                return i;
            }
            aux = aux.proximo;
        }
        return null;
    }
}
