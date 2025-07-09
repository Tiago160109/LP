package br.cefetmg.inf.lab20250707.p1110;
import java.io.IOException;
import java.util.*;
class DequeEncadeado {
    private No inicio;
    private No fim;
    private int tam;
    
    private class No {
        int valor;
        No proximo;
        No anterior;

        No(int valor) {
            this.valor = valor;
        }
    }
    
    DequeEncadeado() {
        inicio = null;
        fim = null;
        tam = 0;
    }
    
    public void inserirNoInicio(int item) {
        No novo = new No(item);
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
        No novo = new No(item);
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
    
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            Baralho simulador = new Baralho(n);
            simulador.simular();
            System.out.println(simulador.pegaCartasDescartadas());
            System.out.println(simulador.pegaCartaRestante());
        }
    }
}
class Baralho {
    private final int n;
    private final DequeEncadeado deque;
    private final DequeEncadeado descartadas;

    public Baralho(int n) {
        this.n = n;
        this.deque = new DequeEncadeado();
        this.descartadas = new DequeEncadeado();
    }
    public void simular() {
        for (int i = 1; i <= n; i++) {
            deque.inserirNoFim(i);
        }
        while (deque.tamanho() > 1) {
            int cartaDescartada = deque.removerPrimeiro();
            descartadas.inserirNoFim(cartaDescartada); 

            int cartaMover = deque.removerPrimeiro();
            deque.inserirNoFim(cartaMover);
        }
    }
    public String pegaCartasDescartadas() {
    String saida = "Discarded cards:";

    if (descartadas.estaVazia()) {
        return saida;
    }
    saida += " ";
    while (!descartadas.estaVazia()) {
        saida += descartadas.removerPrimeiro();
        if (!descartadas.estaVazia()) {
            saida += ", ";
        }
    }
    return saida;
}
    public String pegaCartaRestante() {
        return "Remaining card: " + deque.obterPrimeiro();
    }
}