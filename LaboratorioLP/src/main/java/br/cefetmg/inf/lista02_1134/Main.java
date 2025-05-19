
package br.cefetmg.inf.lista02_1134;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner scan = new Scanner(System.in);
       int[] vet = new int[3];
       while(true)
        {
            int tipoAbastecido = scan.nextInt();
            if(tipoAbastecido == 4) break;
            
            switch (tipoAbastecido){
                    case 1:
                        vet[0] += 1;
                        break;
                    case 2:
                        vet[1] += 1;
                        break;
                    case 3:
                        vet[2] += 1;
                        break;
                    default:
                        break;
            }
        }
        System.out.printf("MUITO OBRIGADO%n");
        System.out.printf("Alcool: %d%n", vet[0]);
        System.out.printf("Gasolina: %d%n", vet[1]);
        System.out.printf("Diesel: %d%n", vet[2]);
    }
 
}