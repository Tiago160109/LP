
package br.cefetmg.inf.lista01_1003;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    scan.close();
    int SOMA = A + B;
    System.out.println("SOMA = " + SOMA);
    }
 
}