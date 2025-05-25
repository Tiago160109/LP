package br.cefetmg.inf.lista03.p1105;
import java.util.Scanner;

class SistemaBancario {
    int[] reservas;
    int quantidadeBancos;

    SistemaBancario(int quantidadeBancos) {
        this.quantidadeBancos = quantidadeBancos;
        reservas = new int[quantidadeBancos + 1]; 
    }

    void definirReservasIniciais(int[] valores) {
        for (int i = 1; i <= quantidadeBancos; i++) {
            reservas[i] = valores[i];
        }
    }

    void aplicarDebenture(Debenture d) {
        reservas[d.devedor] -= d.valor;
        reservas[d.credor] += d.valor;
    }

    boolean todosComReservasPositivas() {
        for (int i = 1; i <= quantidadeBancos; i++) {
            if (reservas[i] < 0) {
                return false;
            }
        }
        return true;
    }
}

class Debenture {
    int devedor;
    int credor;
    int valor;

    Debenture(int devedor, int credor, int valor) {
        this.devedor = devedor;
        this.credor = credor;
        this.valor = valor;
    }
}

class LeitorCasos {
    Scanner scanner;

    LeitorCasos() {
        scanner = new Scanner(System.in);
    }

    void processarCasos() {
        while (true) {
            int B = scanner.nextInt();
            int N = scanner.nextInt();
            if (B == 0 && N == 0) {
                break;
            }

            SistemaBancario sistema = new SistemaBancario(B);

            int[] reservasTemp = new int[B + 1];
            for (int i = 1; i <= B; i++) {
                reservasTemp[i] = scanner.nextInt();
            }
            sistema.definirReservasIniciais(reservasTemp);

            for (int i = 0; i < N; i++) {
                int d = scanner.nextInt();
                int c = scanner.nextInt();
                int v = scanner.nextInt();
                Debenture debenture = new Debenture(d, c, v);
                sistema.aplicarDebenture(debenture);
            }

            if (sistema.todosComReservasPositivas()) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LeitorCasos leitor = new LeitorCasos();
        leitor.processarCasos();
    }
}
