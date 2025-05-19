
package br.cefetmg.inf.lista01_1007;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    int D = scan.nextInt();
    System.out.printf("DIFERENCA = %d%n", (A*B)-(C*D));
    }
 
}