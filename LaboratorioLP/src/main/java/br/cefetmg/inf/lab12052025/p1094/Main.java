
package br.cefetmg.inf.lab12052025.p1094;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double all = 0;
        double rato=0, sapo=0, coelho=0;
        for(int i = 0; i < N; i++){
            int Quantia = scan.nextInt();
            char Tipo = scan.next().charAt(0);
            all +=  Quantia;
            switch (Tipo) {
                case 'C':
                    coelho+=Quantia;
                    break;
                case 'R':
                    rato+=Quantia;
                    break;
                case 'S':
                    sapo+=Quantia;
                    break;
            }
    }
                System.out.printf("Total: %.0f cobaias%n", all);
                System.out.printf("Total de coelhos: %.0f%n", coelho);
                System.out.printf("Total de ratos: %.0f%n", rato);
                System.out.printf("Total de sapos: %.0f%n", sapo);
                System.out.printf("Percentual de coelhos: %.2f %%%n", coelho/all*100);
                System.out.printf("Percentual de ratos: %.2f %%%n", rato/all*100);
                System.out.printf("Percentual de sapos: %.2f %%%n", sapo/all*100);   
        
    }
    
}