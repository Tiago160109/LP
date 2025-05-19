
package br.cefetmg.inf.lista01.p1008;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int horas = scan.nextInt();
        float salario = scan.nextFloat();
        System.out.printf("NUMBER = %d%n", numero);
        System.out.printf("SALARY = U$ %.2f%n", horas*salario);
        
    }
 
}