
package br.cefetmg.inf.lista02_1435;
import java.io.IOException;

import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            imprimirMatriz(n);
            System.out.println(); 
        }

        scanner.close();
    }

    public static void imprimirMatriz(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder linha = new StringBuilder();
            for (int j = 0; j < n; j++) {
                int valor = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j)) + 1;

                if (j > 0) linha.append(" ");
                linha.append(String.format("%3d", valor));
            }
            System.out.println(linha);
        }
    }
}