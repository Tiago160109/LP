package br.cefetmg.inf.lab20250602;
import java.io.IOException;
import java.util.Scanner;
public class FilaArray {
    Scanner scan = new Scanner(System.in);
    int ultimo=0;
    int vetor[] = new int[10];
    void enfileirar(){
        if(tamanhoFila() == vetor.length)
        {
            aumentarFila();
        }
        vetor[ultimo] = scan.nextInt();
        ultimo++;
    }
    int tamanhoFila(){
        return ultimo;
    }
    int desenfileirar(){
        int j = 1;
        int vetor1[] = new int[vetor.length];
        int retorno = vetor[0];
        for(int i = 0; i < tamanhoFila(); i++){
            vetor1[i] = vetor[j];
            vetor = vetor1;
        }
        ultimo--;
        return retorno;
    }
    boolean estaVazia(){
        return ultimo == 0;
    }
    void aumentarFila(){
        int vetor1[] = new int[tamanhoFila() + 10];
        for(int i = 0; i < tamanhoFila(); i++){
            vetor1[i] = vetor[i];
            vetor = vetor1;
        }
    }
}
