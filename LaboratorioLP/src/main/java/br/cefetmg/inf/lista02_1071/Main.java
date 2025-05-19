
package br.cefetmg.inf.lista02_1071;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int Y = scan.nextInt();
        
        if(X > Y)
        {
            int temp = X;
            X = Y;
            Y = temp;
        }
        int soma = 0;
        for(int i = X + 1; i < Y; i++)
        {
            if(i%2 != 0)
            {
                soma += i;
            }
        }
        System.out.printf("%d%n", soma);
    }
 
}