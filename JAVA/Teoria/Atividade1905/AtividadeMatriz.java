package Atividade1905;

import java.util.Random;
import java.util.Scanner;

public class AtividadeMatriz {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random(0);

    public void atividade1a() {

        // declarar a matriz
        System.out.println("Informe o Nº de Colunas da Matriz");
        int i = sc.nextInt();
        System.out.println("Informe o Nº de Linhas da Matriz");
        int j = sc.nextInt();

        int matriz[][] = new int[i][j];

        // preencher a minha matriz
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }
        // imprimir em formato de matriz
        for (i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }
        System.out.println(">>>>>>>>");
        for (i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void atividade2() {

        // Sortear um valor entre 0 e 1000

        System.out.println("Chute um valor entre 0 e 1000");
        System.out.println("Aperte CTRL+C a qualquer momento para parar.");
        int valorAleatorio = rd.nextInt(1000);
        int chute = sc.nextInt();
        int i = 1;
        while (valorAleatorio != chute) {
            if (valorAleatorio > chute) {
                System.out.println("Chute um valor Maior");
                chute = sc.nextInt();
                i++;
            }
            if (valorAleatorio < chute) {
                System.out.println("Chute um valor Menor");
                chute = sc.nextInt();
                i++;
            }
        }
        System.out.println("Parabens! Você acertou!");
        System.out.println("Você precisou de " + i + " tentativas");
    }

    public void atividade3() {

        int vetor[] = new int[rd.nextInt(100, 1000)];
        int contParEmImpar = 0;
        int contImparEmPar = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100) + 1;
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i] + " É Par");
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) {
                System.out.println(vetor[i] + " É Impar");
            }
        }
        for (int i = 1; i < vetor.length; i+=2) {
            if (vetor[i] % 2 == 0) {
                contParEmImpar++;
            }
        }
        for (int i = 0; i < vetor.length; i+=2) {
            if (vetor[i] % 2 == 1) {
                contImparEmPar++;
            }
        }
        System.out.println("Numeros pares aparecem em posições impares "+contParEmImpar+ " vezes");
        System.out.println("Numeros impares aparecem em posições pares "+contImparEmPar+ " vezes");
    }
}
