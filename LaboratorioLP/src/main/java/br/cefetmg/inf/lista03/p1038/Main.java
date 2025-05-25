package br.cefetmg.inf.lista03.p1038;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Pedido pedido = new Pedido();
        Cardapio cardapio = new Cardapio();
        cardapio.calcularValorTotal(pedido);
        System.out.printf("Total: R$ %.2f%n", pedido.valorTotal);
    }
}

class Pedido {
    Produto produto;
    int quantidade;
    double valorTotal;

    Pedido() {
        Scanner scanner = new Scanner(System.in);
        produto = new Produto();
        produto.codigo = scanner.nextInt();
        quantidade = scanner.nextInt();
        valorTotal = 0;
    }
}
class Produto {
    int codigo;
}

class Cardapio {
    void calcularValorTotal(Pedido pedido) {
        switch (pedido.produto.codigo) {
            case 1:
                pedido.valorTotal += 4 * pedido.quantidade;
                break;
            case 2:
                pedido.valorTotal += 4.5 * pedido.quantidade;
                break;
            case 3:
                pedido.valorTotal += 5 * pedido.quantidade;
                break;
            case 4:
                pedido.valorTotal += 2 * pedido.quantidade;
                break;
            case 5:
                pedido.valorTotal += 1.5 * pedido.quantidade;
                break;
            default:
                break;
        }
    }
}
