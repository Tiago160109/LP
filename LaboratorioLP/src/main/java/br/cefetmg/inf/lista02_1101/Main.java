
package br.cefetmg.inf.lista02_1101;
import java.io.IOException;
import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            int M = scan.nextInt();
            int N = scan.nextInt();
            if(M <= 0 || N <= 0)
            {
                break;
            }
            int soma = 0;
            if(N > M)
            {
                int temp = N;
                N = M;
                M = temp;
            }
            for(int i = N; i <= M; i++)
            {
                System.out.printf("%d ", i);
                soma += i;
            }
            System.out.printf("Sum=%d%n", soma);
        }
 
    }
 
}