
package br.cefetmg.inf.lista02.p3142;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int LIMITE_EXCEL = 16384;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        while ((linha = br.readLine()) != null) {
            linha = linha.trim();
            int resultado = 0;

            for (int i = 0; i < linha.length(); i++) {
                int valor = linha.charAt(i) - 'A' + 1;
                resultado = resultado * 26 + valor;
                if (resultado > LIMITE_EXCEL) break;
            }

            if (resultado <= LIMITE_EXCEL) {
                System.out.println(resultado);
            } else {
                System.out.println("Essa coluna nao existe Tobias!");
            }
        }
    }
}
