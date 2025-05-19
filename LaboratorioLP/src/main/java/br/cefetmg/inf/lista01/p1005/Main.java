
package br.cefetmg.inf.lista01.p1005;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    double A = scan.nextDouble();
    A = A*3.5;
    double B = scan.nextDouble();
    B = B*7.5;
    scan.close();    
    System.out.printf("MEDIA = %.5f%n", (A+B)/11);
    
    }
 
}