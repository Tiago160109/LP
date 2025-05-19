
package br.cefetmg.inf.lista02.p1129;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int N = scanner.nextInt();
            if (N == 0) {
                break;
            }
            
            for (int i = 0; i < N; i++) {
                int[] respostas = new int[5];
                
                int marcadas = 0;
                int marcado = -1;
                
                for (int j = 0; j < 5; j++) {
                    respostas[j] = scanner.nextInt();
                    if (respostas[j] <= 127) {
                        marcadas++;
                        marcado = j;
                    }
                }

                if (marcadas == 1) {
                    switch (marcado) {
                        case 0: 
                            System.out.println("A"); 
                            break;
                        case 1: 
                            System.out.println("B"); 
                            break;
                        case 2: 
                            System.out.println("C"); 
                            break;
                        case 3: 
                            System.out.println("D"); 
                            break;
                        case 4: 
                            System.out.println("E"); 
                            break;
                    }
                } 
                else {
                    System.out.println("*");
                }
            }
        }
 
    }
 
}