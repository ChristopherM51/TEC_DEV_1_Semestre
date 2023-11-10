package EstruturaDecisaoIf;

import java.util.Scanner;

public class DecisaoIf {
    Scanner sc = new Scanner(System.in);

    // Estrutura Decisão Desencadeada
    public void calcularDescontoIf() {

        System.out.println("Informe o valor do produto ");
        double valorProduto = sc.nextDouble();
        double percentualDesconto = 0;

        if (valorProduto >= 150 && valorProduto < 200) {
            percentualDesconto = 5.0;
        }
        if (valorProduto >= 200 && valorProduto < 300) {
            percentualDesconto = 10.0;
        }
        if (valorProduto >= 300) {
            percentualDesconto = 15.0;
        }

        double desconto = (valorProduto * percentualDesconto) / 100;
        double precoComDesconto = valorProduto - desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto + ".");

    }

    // Decisão If encadeada
    public void decisaoIfElse() {

        System.out.println("Informe o valor do produto:");
        double valorProduto = sc.nextDouble();
        double percentualDesconto;

        if (valorProduto >= 300) {
            percentualDesconto = 15;

        } else if (valorProduto >= 200) {
            percentualDesconto = 10;

        } else if (valorProduto >= 100) {
            percentualDesconto = 10;

        } else {
            percentualDesconto = 0;
        }

        double desconto = (valorProduto * percentualDesconto) / 100;
        double precoComDesconto = valorProduto - desconto;
        System.out.println("O produto sairá por R$" + precoComDesconto + ".");
    }
}
