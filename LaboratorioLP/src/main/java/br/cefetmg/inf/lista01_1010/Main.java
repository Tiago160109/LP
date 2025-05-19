
package br.cefetmg.inf.lista01_1010;
import java.io.IOException;

import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int codigoDePecas1 = scan.nextInt();
        int numeroDePecas1 = scan.nextInt();
        float valorUnitario1 = scan.nextFloat();
        int codigoDePecas2 = scan.nextInt();
        int numeroDePecas2 = scan.nextInt();
        float valorUnitario2 = scan.nextFloat();
        scan.close();
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", (numeroDePecas1 * valorUnitario1)+(numeroDePecas2 * valorUnitario2));
    }
 
}
