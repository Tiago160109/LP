
package br.cefetmg.inf.lista01_1006;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    double A = scan.nextDouble();
    double B = scan.nextDouble();
    double C = scan.nextDouble();
    A = A*2;
    B = B*3;
    C = C*5;
    System.out.printf("MEDIA = %.1f%n", (A+B+C)/10);
    scan.close();
    }
 
}