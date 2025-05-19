
package br.cefetmg.inf.lista02_2060;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int dois=0,tres=0,quatro=0,cinco=0;
        for(int i = 0; i < N; i++)
        {
            int Li = scan.nextInt();
            if(Li%2 == 0)
            {
                dois++;
            }
            if(Li%3 == 0)
            {
                tres++;
            }
            if(Li%4 == 0)
            {
                quatro++;
            }
            if(Li%5 == 0)
            {
                cinco++;
            }
        }
        System.out.printf("%d Multiplo(s) de 2%n", dois);
        System.out.printf("%d Multiplo(s) de 3%n", tres);
        System.out.printf("%d Multiplo(s) de 4%n", quatro);
        System.out.printf("%d Multiplo(s) de 5%n", cinco);
    }
 
}