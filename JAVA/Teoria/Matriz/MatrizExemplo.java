package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // criar uma matriz 10x9, preencher, imprimir e manipular
        // declarar a matriz

        int matriz[][] = new int[10][9];// 10 linhas e 9 colunas
        // preencher a minha matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }
        // mostrar a minha matriz (imprimir)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j]);
            }
        }
        // imprimir em formato de matriz
        for (int i = 0; i < 10; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        // somar 4ª linha
        int soL = 0;
        for (int j = 0; j < 9; j++) {
            soL += matriz[3][j];

        }
        System.out.println("soma da linha 4 é = " + soL);
        // somar 4ª coluna
        int soC = 0;
        for (int i = 0; i < 10; i++) {
            soC += matriz[i][3];

        }
        System.out.println("soma da coluna 4 é = " + soC);
    }

    // Printar uma matriz identidade
    public void exemplo2() {
        // criar uma matriz identidade 5x5, preencher, imprimir

        int matrizIdentidade[][] = new int[5][5];// 5 linhas e 5 colunas
        // preencher a minha matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matrizIdentidade[i][j] = 1;
                } else {
                    matrizIdentidade[i][j] = 0;
                }
            }
        }
            // imprimir em formato de matriz
            for ( int i = 0; i < 5; i++) {
                System.out.print("| ");
                for (int j = 0; j < 5; j++) {
                    System.out.print(matrizIdentidade[i][j] + " ");
                }
                System.out.println("|");
            }
        }

        //matriz transposta
        public void exemplo3() {
            // criar uma matriz 4x4, preencher, imprimir matriz e matriz transposta
    
            int matriz[][] = new int[4][4];// 4 linhas e 4 colunas
            // preencher a minha matriz
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matriz[i][j] = rd.nextInt(9);
                }
            }
            // imprimir em formato de matriz
            for (int i = 0; i < 4; i++) {
                System.out.print("| ");
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("|");
            } 
    }
}