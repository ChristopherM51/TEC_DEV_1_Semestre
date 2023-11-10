package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class exemploWhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        int iteracao = 0;
        while (iteracao < 999999999) {
            iteracao += 1;
            System.out.println("Essa é a iteracao de nº " + iteracao);
        }
    }

    public void exemplo2() { // Jogo de adivinhação
        Random rd = new Random(); // Função para escolha de nº aleatorio
        int nAleatorio = rd.nextInt(10);
        boolean tenteNovamente = true;
        System.out.println("Aperte CTRL+C a qualquer momento para parar.");
        while (tenteNovamente)
            ;
        System.out.println("Tente adivinhar um numero");
        int numero = sc.nextInt();
        if (numero == nAleatorio) {
            System.out.println("Acertou");
            tenteNovamente = false;
        } else {
            System.out.println("errou");
        }
    }

    public void exemplo3() {
        // Ler 5 nº inteiros e printar na ordem
        // criar vetor com while
        int vetor[] = new int[5];
        int i = 0;
        while (i < 5) {
            vetor[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < 5) {
            System.out.println(vetor[i]);
            i++;
        }
    }

    public void exercico4while() {
        // lendo um vetor de string com lanço while
        // criar um vetor de 10 letras
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        // iterador ou repetidor - elemneto que servirá de contagem
        int i = 0;
        int cont = 0; // contador para consoantes
        while (i < letras.length) {
            if (letras[i] == "a" || letras[i] == "e" || letras[i] == "i" || letras[i] == "o" || letras[i] == "u") {

            } else {
                cont++;
                System.out.println(letras[i] + " é consoante");
            }
            i++;
        }
        System.out.println("o nº de consoantes é " + cont);
    }

    public void exercicio4() {
        // lendo um vetor de string com lanço while
        // criar um vetor de 10 letras
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        // iterador ou repetidor - elemneto que servirá de contagem
        int i = 0;
        int cont = 0; // contador para consoantes
        while (i < letras.length) {
            switch (letras[i]) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break;
                default:
                    cont++;

                    System.out.println("o nº de consoantes é " + cont);
            }
            i++;
        }
        System.out.println("o numero de consoantes é " + cont);
    }

    public void exercicio4For() {
        // criar um vetor de 10 letras
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        // ler o vetor letra por letra e verificar se é consoante e "contar"
        int contConsoante = 0;
        for (int i = 0; i < letras.length; i++) {
            if(letras[i]=="a"||letras[i]=="e"||letras[i]=="i"||letras[i]=="o"||letras[i]=="u"){
            System.out.println(letras[i] +" é vogal");
        }else {
            System.out.println(letras[i]+ " é consoante");
            contConsoante++;
        }
        System.out.println("o nº de consoantes é " + contConsoante);
    }
    }

    public void exercicio4ForEx() {
        System.out.println("Digite uma palavra");
        String letras = sc.next();
        letras=letras.toLowerCase();
        // ler a palavra letra por letra e verificar se é consoante e "contar"
        int contConsoante = 0;
        for (int i = 0; i < letras.length(); i++) {
            char c = letras.charAt(i);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println(c+" é vogal");
        }else {
            System.out.println(c+ " é consoante");
            contConsoante++;
        }
        System.out.println("o nº de consoantes é " + contConsoante);
    }
    }

    public void exercicio5() { // exercicio5
        int vetor[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int i = 0;
        int contPar = 0;
        int contImpar = 0;

        while (i < vetor.length) {
            if (vetor[i] % 2 == 0) {
                contPar++;
                System.out.println("o " + vetor[i] + " é Par");
            } else {
                contImpar++;
                System.out.println("o " + vetor[i] + " é Impar");
            }
            i++;
        }
        int vetorPar[] = new int[contPar];
        int vetorImpar[] = new int[contImpar];
        i = 0;
        contPar = 0;
        contImpar = 0;

        while (i < vetor.length) {
            if (vetor[i] % 2 == 0) {
                vetorPar[contPar] = vetor[i];
                contPar++;
            } else {
                vetorImpar[contImpar] = vetor[i];
                contImpar++;
            }
            i++;
        }
        i = 0;

        while (i < vetor.length) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
            i++;
        }
        i = 0;
        while (i < vetorPar.length) {
            System.out.println("vetor par[" + i + "]=" + vetorPar[i]);
            i++;
        }
        i = 0;
        while (i < vetorImpar.length) {
            System.out.println("vetor impar[" + i + "]=" + vetorImpar[i]);
            i++;
        }

    }

    public void exercicio5For() {
        //ler um vetor de 20 nº e determinar Impares e Pares
        //guardar dentro de outros vetores
        int numeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                contPar++;
            }else {
                contImpar++;
            }
            
        }
        //Criar os vetores Par e Impar
        int nPar[] = new int[contPar];
        int nImpar[] = new int[contImpar];

        //Preencher os vetores Par e Impar
        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                nPar[contPar] = numeros[i];
                contPar++;
            } else {
                nImpar[contImpar] = numeros[i];
                contImpar++;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("vetor[" + i + "]=" + numeros[i]);
        }
        for (int i = 0; i < nPar.length; i++) {
            System.out.println("vetor par[" + i + "]=" + nPar[i]);
        }
        for (int i = 0; i < nImpar.length; i++) {    
        System.out.println("vetor impar[" + i + "]=" + nImpar[i]);
        }

    }


    public void exemplo7() {
        int medias[] = new int[10];

    }
}