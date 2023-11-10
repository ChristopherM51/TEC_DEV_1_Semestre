package ExemplosFor;

import java.util.Scanner;

import javax.sound.midi.ShortMessage;
import javax.sql.rowset.spi.SyncResolver;

public class exemplosFor {
    Scanner sc = new Scanner(System.in);

    public void exemplo2() {

        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor[" + i + "]=");
            vetor[i] = sc.nextInt();
        }
        //
        for (int i = 9; i >= 0; i--) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
        }
    }

    public void exemplo3() {
        // Carrinho de Compra
        double carrinhoCompra[] = new double[] { 19.90, 35.70, 56.80, 97.50 };
        // Finalizar a Compra
        double valorFinal = 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
            System.out.println("Valor parcial da compra: R$" + valorFinal);
        }
        // Mostrar o valor final da compra
        System.out.println("O valor da compra é R$ " + valorFinal);
    }

    public void exemplo4() {
        // Ler 4 Notas e Mostrar as 4 Notas e a Media
        double vetorNotas[] = new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a Nota" + (i + 1) + ":");
            vetorNotas[i] = sc.nextDouble();
        }
        // Imprimir as 4 notas e calcular a media
        double mediaNotas = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas += vetorNotas[i];
            System.out.println("A " + (i + 1) + "ª Nota é " + vetorNotas[i]);
        }
        mediaNotas /= vetorNotas.length;
        System.out.printf("A Media do Aluno é: %.1f", mediaNotas);
    }

    public void exemplo5() {
        // Ler 4 notas de 10 alunos
        // vetor para guardar a nota
        double vetorMedia[] = new double[10];
        // preencher o vetor de medias
        for (int i = 0; i < vetorMedia.length; i++) {
            double notas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.println("Nota " + (j + 1) + " Aluno " + (i + 1));
                notas += sc.nextDouble();
            }
            notas /= 4;
            vetorMedia[i] = notas;
        }
        // imprimir notas>=7 do vetor media
        for (int i = 0; i < vetorMedia.length; i++) {
            if (vetorMedia[i] >= 7) {
                System.out.println("A Media do Aluno " + (i + 1) + " é " + vetorMedia[i]);
            }
        }
    }

    // Faça um programa que leia um vetor com 5 numeros inteiros, mostre a soma, a
    // multiplicação e os numeros
    public void exemplo6() {
        int vetor[] = new int[] { 1, 2, 3, 4, 5 };
        int resultadomulti = 1;
        int adicao = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("O Número do " + (i + 1) + "º é: " + vetor[i]);
            adicao += vetor[i];
            resultadomulti *= vetor[i];
        }
        System.out.println("O Valor da soma é: " + adicao);
        System.out.println("O valor da multiplicação é: " + resultadomulti);
    }

    // Faça um programa que peça a idade e a altura de 5 pessoas e armazene cada
    // em um vetor. Imprima a idade e a altura na ordem inversa a ordem lida.
    public void exemplo7() {
        int idade[] = new int[5];
        double altura[] = new double[5];

        for (int i = 0; i < altura.length; i++) {
            System.out.println("Informe a idade da " + (i + 1) + "ª Pessoa");
            idade[i] = sc.nextInt();
            System.out.println("Informe a altura da " + (i + 1) + "ª Pessoa");
            altura[i] = sc.nextDouble();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println("A idade da " + (i + 1) + "ª Pessoa é: " + idade[i] + " e a altura é: " + altura[i]);
        }

    }

    // faça um programa que leia um vetorA com 10 nuemros inteiros, calcule e mostre
    // a soma dos quadrados dos elementos do vetor

    public void exemplo8() {
        int vetor[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int adicao = 0;

        for (int i = 0; i < vetor.length; i++) {
            adicao += vetor[i] * vetor[i];
        }
        System.out.println("O Valor da soma dos quadrados dos elementos do vetor é: " + adicao);
    }

    /**
     * 
     */
    public void exemplo9() {
        int vetor[] = new int[20];
        int contImpar = 0;
        int contPar = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informar vetor[" + i + "]=");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                contPar++;
                System.out.println("o " + vetor[i] + " é Par");
            } else {
                contImpar++;
                System.out.println("o " + vetor[i] + " é Impar");
            }
        }

        int vetorPar[] = new int[contPar];
        int vetorImpar[] = new int[contImpar];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                vetorPar[contPar] = vetor[i];
                contPar++;
            } else {
                vetorImpar[contImpar] = vetor[i];
                contImpar++;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
        }
        for (int i = 0; i < vetorPar.length; i++) {
            System.out.println("vetor par[" + i + "]=" + vetorPar[i]);
        }
        for (int i = 0; i < vetorImpar.length; i++) {
            System.out.println("vetor impar[" + i + "]=" + vetorImpar[i]);
        }

    }

}
