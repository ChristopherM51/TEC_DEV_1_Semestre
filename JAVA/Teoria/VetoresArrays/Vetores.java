package VetoresArrays;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // criar meu vetor
        double[] valores = new double[] { 10.5, 15.8, 7.5, -17.6 };
        System.out.println("O 1º Elemento do Vetor - Valores [0] é " + valores[0]);
        System.out.println("O 2º Elemento do Vetor - Valores [1] é " + valores[1]);
        System.out.println("O 3º Elemento do Vetor - Valores [2] é " + valores[2]);
        System.out.println("O 4º Elemento do Vetor - Valores [3] é " + valores[3]);
        System.out.println("Digite um valor para a 4ª posição/índice 3");
        valores[3] = sc.nextDouble();
        System.out.println("O Novo valor da 4ª posição/índice[3] é " + valores[3]);

    }

    public void exemplo2() {
        // criar vetor nulo
        int valoresInt[] = new int[5];
        System.out.println("Digite 5 Valores Inteiros");
        valoresInt[0] = sc.nextInt();
        valoresInt[1] = sc.nextInt();
        valoresInt[2] = sc.nextInt();
        valoresInt[3] = sc.nextInt();
        valoresInt[4] = sc.nextInt();
        valoresInt[5] = sc.nextInt();
        System.out.println("O 1º Elemento do Vetor é " + valoresInt[0]);
        System.out.println("O 2º Elemento do Vetor é " + valoresInt[1]);
        System.out.println("O 3º Elemento do Vetor é " + valoresInt[2]);
        System.out.println("O 4º Elemento do Vetor é " + valoresInt[3]);
        System.out.println("O 5º Elemento do Vetor é " + valoresInt[4]);

    }

    public void exemplo3() {
        int vetorEx3[] = new int[10];
        System.out.println("Digite 10 Valores Inteiros");
        vetorEx3[0] = sc.nextInt();
        vetorEx3[1] = sc.nextInt();
        vetorEx3[2] = sc.nextInt();
        vetorEx3[3] = sc.nextInt();
        vetorEx3[4] = sc.nextInt();
        vetorEx3[5] = sc.nextInt();
        vetorEx3[6] = sc.nextInt();
        vetorEx3[7] = sc.nextInt();
        vetorEx3[8] = sc.nextInt();
        vetorEx3[9] = sc.nextInt();
        System.out.println("O 10º Elemento do Vetor é " + vetorEx3[9]);
        System.out.println("O 9º Elemento do Vetor é " + vetorEx3[8]);
        System.out.println("O 8º Elemento do Vetor é " + vetorEx3[7]);
        System.out.println("O 7º Elemento do Vetor é " + vetorEx3[6]);
        System.out.println("O 6º Elemento do Vetor é " + vetorEx3[5]);
        System.out.println("O 5º Elemento do Vetor é " + vetorEx3[4]);
        System.out.println("O 4º Elemento do Vetor é " + vetorEx3[3]);
        System.out.println("O 3º Elemento do Vetor é " + vetorEx3[2]);
        System.out.println("O 2º Elemento do Vetor é " + vetorEx3[1]);
        System.out.println("O 1º Elemento do Vetor é " + vetorEx3[0]);

    }

    public void exemplo4() {
        double vetorNota[] = new double[4];
        System.out.println("Digite 4 notas");
        vetorNota[0] = sc.nextDouble();
        vetorNota[1] = sc.nextDouble();
        vetorNota[2] = sc.nextDouble();
        vetorNota[3] = sc.nextDouble();
        System.out.println("A Nota1 é " + vetorNota[0]);
        System.out.println("A Nota2 é " + vetorNota[1]);
        System.out.println("A Nota3 é " + vetorNota[2]);
        System.out.println("A Nota4 é " + vetorNota[3]);

        double media = (vetorNota[0] + vetorNota[1] + vetorNota[2] + vetorNota[3]) / 4;
        System.out.println("A media é " + media);
    }

}