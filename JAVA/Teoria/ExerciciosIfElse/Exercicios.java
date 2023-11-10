package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o primeiro valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o segundo valor:");
        int valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else if (valor2 > valor1) {
            System.out.println("O maior valor é: " + valor2);
        } else {
            System.out.println("Os valores são iguais");
        }
    }

    public void exercicio2() {
        System.out.println("informe o ano de seu nascimento:");
        int anoNascimento = sc.nextInt();

        if (anoNascimento == 2006) {
            System.out.println("O voto é facultativo.");
        } else if (anoNascimento > 2006) {
            System.out.println("Não é permitido votar");
        } else {
            System.out.println("É permitido votar");
        }
    }

    public void exercicio3() {
        System.out.println("Informe a senha do usuario:");
        int senhaUsuario = sc.nextInt();

        if (senhaUsuario == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }

    public void exercicio4() {
        System.out.println("Informe o numero de maças:");
        int numeroMacas = sc.nextInt();
        double custoUnidade = 0.30;

        if (numeroMacas < 12) {
            double custoTotal = (custoUnidade * numeroMacas);
            System.out.println("O valor da compra é de:" + custoTotal);
        } else {
            custoUnidade = 0.25;
            double custoTotal = (custoUnidade * numeroMacas);
            System.out.println("O valor da compra é de:" + custoTotal);
        }

    }

    public void exercicio5() {
        System.out.println("Informe um numero inteiro:");
        int a = sc.nextInt();
        System.out.println("Informe um numero inteiro:");
        int b = sc.nextInt();
        System.out.println("Informe um numero inteiro:");
        int c = sc.nextInt();

        if ((a < b) && (b < c)) {
            System.out.println("Em ordem crescente fica: " + a + "," + b + "," + c);
        } else if ((b < a) && (a < c)) {
            System.out.println("Em ordem crescente fica: " + b + "," + a + "," + c);
        } else if ((b < c) && (c < a)) {
            System.out.println("Em ordem crescente fica: " + b + "," + c + "," + a);
        } else if ((a < c) && (c < b)) {
            System.out.println("Em ordem crescente fica: " + a + "," + c + "," + b);
        } else if ((c < a) && (a < b)) {
            System.out.println("Em ordem crescente fica: " + c + "," + a + "," + b);
        } else {
            System.out.println("Em ordem crescente fica: " + c + "," + b + "," + a);
        }

    }

    public void exercicio6() {
        System.out.println("Para calcular o peso ideal informe o sexo digitando 1 para Masculino e 2 para Feminino:");
        int sexo = sc.nextInt();
        System.out.println("Agora digite a altura");
        int altura = sc.nextInt();

        if (sexo==1) {// sexo masculino
            (((72.7)*altura)– (58));
        } else {// sexo feminino
            ((62.1)*altura)– (44.7);
        }
    }
}
