
package br.cefetmg.inf.lista01_1001;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
    
    Scanner scan = new Scanner(System.in);
    int A =  scan.nextInt();
    int B = scan.nextInt();
    scan.close();
    int X = A + B;
    System.out.println("X = " + X);
    }
 
}