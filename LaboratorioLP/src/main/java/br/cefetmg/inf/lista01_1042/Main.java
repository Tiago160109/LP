
package br.cefetmg.inf.lista01_1042;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int valor3 = scan.nextInt();
        int A = valor1;
        int B = valor2;
        int C = valor3;
        if(valor1 > valor2)
        {
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }
        if(valor1 > valor3)
        {
            int temp = valor1;
            valor1 = valor3;
            valor3 = temp;
        }
        if(valor2 > valor3)
        {
            int temp = valor2;
            valor2 = valor3;
            valor3 = temp;
        }
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
 
        
    }
 
}