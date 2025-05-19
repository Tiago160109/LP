
package br.cefetmg.inf.lab12052025.p1105;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while(true){
        int B = scan.nextInt();
        int N = scan.nextInt();
        if (B == 0 && N == 0) break;
        int[] vet = new int[B+1];
        
        for(int i = 1; i <= B; i++)
        {
            vet[i] = scan.nextInt();
        }
        for(int i = 0; i < N; i++)
        {
            int D = scan.nextInt();
            int C = scan.nextInt();
            int V = scan.nextInt();
            
            vet[D] -= V;
            vet[C] += V;
        }
        int positivos = 0;
        for(int i = 1; i <= B; i++)
        {
            if(vet[i] < 0)
            {
                positivos = 1;
                break;
            }
        }
        if(positivos == 1)
        {
            System.out.println("N");
        }
        else
        {
             System.out.println("S");
        }
    }
 }
}