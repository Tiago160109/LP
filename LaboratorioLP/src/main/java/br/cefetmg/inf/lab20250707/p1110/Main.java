package br.cefetmg.inf.lab20250707.p1110;
import java.io.IOException;
import java.util.Scanner;
class Baralho {
    private Carta inicio;
    private Carta fim;
    private int tam;
    
    Baralho() {
        inicio = null;
        fim = null;
        tam = 0;
    }
    class Carta {
        int valor;
        Carta proximo;
        Carta anterior;

        Carta(int valor) {
            this.valor = valor;
        }
    }
    public void inserirNoInicio(int item) {
        Carta novo = new Carta(item);
        if(estaVazia()) {            
            inicio = novo;
            fim = novo;
        }
        else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tam++;
    }
    public void inserirNoFim(int item) {
        Carta novo = new Carta(item);
        if(estaVazia()) {
            inicio = novo;
            fim = novo;
        }
        else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tam++;
    }

    public Integer removerPrimeiro() {
        if (estaVazia()) return null;
        int valor = inicio.valor;
        if(inicio == fim) {
            inicio = null;
            fim = null;
        }
        else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tam--;
        return valor;
    }

    public Integer removerUltimo() {
        if (estaVazia()) return null;
        int valor = fim.valor;
        if(inicio == fim) {
            inicio = null;
            fim = null;
        }
        else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tam--;
        return valor;
    }
    
    public Integer obterPrimeiro() {
        if (estaVazia()) return null;
        int valor = inicio.valor;
        return valor;
    }
    public Integer obterUltimo() {
        if (estaVazia()) return null;
        int valor = fim.valor;
        return valor;
    }

    public boolean estaVazia() {
        return tam == 0;
    }
    
    public int tamanho() {
        return tam;
    }
    Baralho(int totalDeCartas){
        inicio = null;
        fim = null;
        for(int i = 0; i < totalDeCartas; i++){
            if(totalDeCartas != 50){
                inserirNoFim(i);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        Baralho barai = new Baralho();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while(barai.tamanho() > 1){
            barai.removerPrimeiro();
            int retiro = removerPrimeiro();
        }
        
    }
}