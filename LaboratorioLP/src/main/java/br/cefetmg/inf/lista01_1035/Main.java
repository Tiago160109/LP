
package br.cefetmg.inf.lista01_1035;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        if(B > C && D > A && C+D > A+B && C >= 0 && D >= 0 && A%2 == 0)
        {
            System.out.printf("Valores aceitos%n");
        }
        else{
            System.out.printf("Valores nao aceitos%n");
        }
    }
 
}