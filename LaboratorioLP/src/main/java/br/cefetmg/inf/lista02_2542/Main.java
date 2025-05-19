
package br.cefetmg.inf.lista02_2542;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt(); 
            int M = sc.nextInt(); 
            int L = sc.nextInt(); 

            int[][] baralhoMarcos = new int[M][N];
            int[][] baralhoLeonardo = new int[L][N];
            
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    baralhoMarcos[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < L; i++) {
                for (int j = 0; j < N; j++) {
                    baralhoLeonardo[i][j] = sc.nextInt();
                }
            }

            int CM = sc.nextInt(); 
            int CL = sc.nextInt(); 

            int A = sc.nextInt(); 

            int atributoMarcos = baralhoMarcos[CM - 1][A - 1];
            int atributoLeonardo = baralhoLeonardo[CL - 1][A - 1];

            if (atributoMarcos > atributoLeonardo) {
                System.out.println("Marcos");
            } else if (atributoLeonardo > atributoMarcos) {
                System.out.println("Leonardo");
            } else {
                System.out.println("Empate");
            }
        }

    }
}