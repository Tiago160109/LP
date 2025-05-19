
package br.cefetmg.inf.lista02_2163;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] terreno = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                terreno[i][j] = scanner.nextInt();
            }
        }

        boolean encontrado = false;
        for (int i = 1; i < N - 1 && !encontrado; i++) {
            for (int j = 1; j < M - 1 && !encontrado; j++) {
                if (terreno[i][j] == 42 &&
                    terreno[i - 1][j - 1] == 7 &&
                    terreno[i - 1][j] == 7 &&
                    terreno[i - 1][j + 1] == 7 &&
                    terreno[i][j - 1] == 7 &&
                    terreno[i][j + 1] == 7 &&
                    terreno[i + 1][j - 1] == 7 &&
                    terreno[i + 1][j] == 7 &&
                    terreno[i + 1][j + 1] == 7) {

                    System.out.println((i + 1) + " " + (j + 1));
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("0 0");
        }

        scanner.close();
    }
}