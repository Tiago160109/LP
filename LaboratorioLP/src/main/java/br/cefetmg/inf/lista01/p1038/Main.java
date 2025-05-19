
package br.cefetmg.inf.lista01.p1038;
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int codigo = scan.nextInt();
        int quantos = scan.nextInt();
        double total = 0;
        if(codigo == 1){
            total = quantos*4;
        }
        else if(codigo == 2){
            total = quantos*4.5;
        }
        else if(codigo == 3){
            total = quantos*5;   
        }
        else if(codigo == 4){
            total = quantos*2;
        }
        else if(codigo == 5){
            total = quantos*1.5;
        }
        System.out.printf("Total: R$ %.2f%n", total);
        
    }
 
}