package br.cefetmg.inf.lista03.p1068;
import java.util.Scanner;

class Expressao {
    String conteudo;

    Expressao(String conteudo) {
        this.conteudo = conteudo;
    }

    String getConteudo() {
        return conteudo;
    }
}

class No {
    char valor;
    No proximo;

    No(char valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class PilhaEncadeada {
    No topo;

    void push(char c) {
        No novo = new No(c);
        novo.proximo = topo;
        topo = novo;
    }

    char pop() {
        if (isEmpty()) {
            return '\0'; 
        }
        char valor = topo.valor;
        topo = topo.proximo;
        return valor;
    }

    boolean isEmpty() {
        return topo == null;
    }
}

class ValidadorParenteses {
    boolean estaBalanceado(Expressao expressao) {
        PilhaEncadeada pilha = new PilhaEncadeada();
        String texto = expressao.getConteudo();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
}

class LeitorExpressao {
    Expressao[] lerExpressoes(int maximo) {
        Scanner scanner = new Scanner(System.in);
        Expressao[] expressoes = new Expressao[maximo];
        int contador = 0;

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            if (linha.equals("")) {
                break;
            }
            if (contador < maximo) {
                expressoes[contador] = new Expressao(linha);
                contador++;
            }
        }

        Expressao[] resultado = new Expressao[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = expressoes[i];
        }

        return resultado;
    }
}

public class Main {
    public static void main(String[] args) {
        int LIMITE = 10000;
        LeitorExpressao leitor = new LeitorExpressao();
        ValidadorParenteses validador = new ValidadorParenteses();

        Expressao[] expressoes = leitor.lerExpressoes(LIMITE);

        for (int i = 0; i < expressoes.length; i++) {
            boolean balanceado = validador.estaBalanceado(expressoes[i]);
            if (balanceado) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
    }
}
