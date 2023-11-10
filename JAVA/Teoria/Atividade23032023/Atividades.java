package Atividade23032023;

import java.util.Scanner;

public class Atividades {
    Scanner sc = new Scanner(System.in);

    public void Atividade1() {
        System.out.println("Informe o 1º numero decimal");
        double n1 = sc.nextDouble();
        System.out.println("Informe o 2º numero decimal");
        double n2 = sc.nextDouble();
        System.out.print(
                "Informe a operação desejada, sendo: //1- Para Adição //2- Para Subtração //3- Para Multiplicação //4- Para Divisão ");
        int oP = sc.nextInt();
        double resultado = 0;

        if (oP == 1) {
            resultado = n1 + n2;
            System.out.println("O resultado da operação é: " + resultado);
        } else if (oP == 2) {
            resultado = n1 - n2;
            System.out.println("O resultado da operação é: " + resultado);
        } else if (oP == 3) {
            resultado = n1 * n2;
            System.out.println("O resultado da operação é: " + resultado);
        } else if (oP == 4) {
            resultado = n1 / n2;
            System.out.println("O resultado da operação é: " + resultado);
        } else {
            System.out.println("Operação invalida");
        }

    }

    public void Atividade2() {
        System.out.println("Informe o Nº de Matricula do aluno (de 1 a 100)");
        int nMatricula = sc.nextInt();

        if (nMatricula<=25){
            System.out.println("(Time do Chris");
        } else if ((nMatricula>25)&&(nMatricula<=50)){
            System.out.println("Time do Greg");
        }else if ((nMatricula>50)&&(nMatricula<=75)){
            System.out.println("Time do Caruso");
        }else if ((nMatricula>75)&&(nMatricula<=100)){
            System.out.println("Time do Caruso");
        } else {
            System.out.println("Matricula Invalida");
        }
    }

    public void Atividade3() {
        double morangos = 2.5;
        double macas = 1.8;
        double bananas = 1.3;

        System.out.println("Quantidade de Kg de Morangos");
        double quantidadeMorangos = sc.nextDouble();
        System.out.println("Quantidade de Kg de Macas");
        double quantidadeMacas = sc.nextDouble();
        System.out.println("Quantidade de Kg de Bananas");
        double quantidadeBananas = sc.nextDouble();

        double gastoMorangos = quantidadeMorangos * morangos;
        double gastoMacas = quantidadeMacas * macas;
        double gastoBananas = quantidadeBananas * bananas;
        double gastoTotal = gastoBananas + gastoMacas + gastoMorangos;
        double quantidadeTotalKg = quantidadeBananas + quantidadeMacas + quantidadeMorangos;
        double custoComDesconto = 0;

        if (quantidadeTotalKg > 8 || gastoTotal > 25) {
            custoComDesconto = gastoTotal * (0.9);
            System.out.println("O Valor gasto será de " + custoComDesconto);

        } else {
            custoComDesconto = gastoTotal;
            System.out.println("O Custo será de " + custoComDesconto);
        }

    }

}

