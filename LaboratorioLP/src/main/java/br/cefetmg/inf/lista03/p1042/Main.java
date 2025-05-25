package br.cefetmg.inf.lista03.p1042;
import java.util.Scanner;

class LeitorNumeros {
    public int[] lerNumeros(int quantidade) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = scanner.nextInt();
        }
        scanner.close();
        return numeros;
    }
}

class OrdenadorNumeros {
    public int[] ordenar(int[] entrada) {
        int[] copia = entrada.clone();
        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = i + 1; j < copia.length; j++) {
                if (copia[i] > copia[j]) {
                    int temp = copia[i];
                    copia[i] = copia[j];
                    copia[j] = temp;
                }
            }
        }
        return copia;
    }
}

class ExibidorNumeros {
    public void exibirLinhaPorLinha(int[] numeros) {
        for (int num : numeros) {
            System.out.println(num);
        }
    }

    public void exibirEspaco() {
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LeitorNumeros leitor = new LeitorNumeros();
        OrdenadorNumeros ordenador = new OrdenadorNumeros();
        ExibidorNumeros exibidor = new ExibidorNumeros();

        int[] original = leitor.lerNumeros(3);
        int[] ordenados = ordenador.ordenar(original);

        exibidor.exibirLinhaPorLinha(ordenados);
        exibidor.exibirEspaco();
        exibidor.exibirLinhaPorLinha(original);
    }
}