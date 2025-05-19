
package br.cefetmg.inf.lista02_1245;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
       Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int N = scan.nextInt();

            int[][] botas = new int[61][2]; 

            for (int i = 0; i < N; i++) {
                int tamanho = scan.nextInt();
                char lado = scan.next().charAt(0);

                if (lado == 'E') {
                    botas[tamanho][0]++; 
                } else if (lado == 'D') {
                    botas[tamanho][1]++; 
                }
            }

            int pares = 0;
            for (int i = 30; i <= 60; i++) {
                int esquerdo = botas[i][0];
                int direito = botas[i][1];

                if (esquerdo < direito) {
                    pares += esquerdo;
                } else {
                    pares += direito;
                }
            }

            System.out.println(pares);
        }
 
    }
 
}