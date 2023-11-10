package AtividadeEmGrupo;

import java.util.Scanner;

public class Jedis {
    Scanner sc = new Scanner(System.in);

    public void academiaJedis() {
        System.out.println("Informe o Nome do Aluno");
        String nome = sc.next();
        System.out.println("Informe a Idade do Aluno");
        int idade = sc.nextInt();
        System.out.println("Informe o Sexo do Aluno (1- Para Masculino ou 2- Para Feminino)");
        int sexo = sc.nextInt();
        System.out.println("Informe a Altura do Aluno");
        double altura = sc.nextDouble();
        System.out.println("Informe o Peso do Aluno");
        double peso = sc.nextDouble();
        double pesoIdeal = 0;
        double pesoAPerder = 0;
        double pesoAGanhar = 0;
        double imc = 0;

        // Peso Ideal
        if (sexo == 1) {// sexo masculino
            pesoIdeal = 72.7 * altura - 58;
        } else {// sexo feminino
            pesoIdeal = 62.1 * altura - 44.7;
        }

        // IMC
        imc = peso / (altura * altura);

        // Treino Recomendado
        if (imc < 20) {
            System.out.println("O Aluno está Abaixo do Peso");
        } else if ((imc > 20) && (imc < 27)) {
            System.out.println("O Aluno esta com Peso Normal");
        } else {
            System.out.println("O Aluno está Acima do Peso");
        }

        // Perder ou Ganhar Peso
        if (pesoIdeal > peso) {
            pesoAGanhar = pesoIdeal - peso;
            System.out.println("O(A) Aluno(a) deverá Ganhar " + pesoAGanhar + "Kg para chegar no Peso Ideal");
        } else if (pesoIdeal < peso) {
            pesoAPerder = peso - pesoIdeal;
            System.out.println("O(A) Aluno(a) deverá Perder " + pesoAPerder + "Kg para chegar no Peso Ideal");
        } else {
            System.out.println("O(A) Aluno(a) esta no Peso Ideal");
        }

        // Treino Recomendado IMC < 20

        if (imc < 20 && idade >= 26 && idade < 46) {
            System.out.println("Os Treinos Recomendados sâo Dificeis: Luta e Musculação Intensa");
        } else if (imc < 20 && idade >= 16 && idade < 26) {
            System.out.println("Os Treinos Recomendados sâo Dificeis: Luta");
        } else if (imc < 20 && idade >= 46) {
            System.out.println("Os Treinos Recomendados sâo Dificeis: Luta e Pilates");

            // Treino Recomendado IMC >20 <27

        } else if (imc >= 20 && imc < 27 && idade >= 26 && idade < 56) {
            System.out.println("Os Treinos Recomendados sâo Moderados: Musculação Moderada, Dança e Corrida");
        } else if (imc >= 20 && imc < 27 && idade >= 56) {
            System.out.println("Os Treinos Recomendados sâo Moderados: Dança e Corrida");
        } else if (imc >= 20 && imc < 27 && idade >= 16 && idade < 26) {
            System.out.println("Os Treinos Recomendados sâo Moderados: Musculação Moderada e Dança");

            // Treino Recomendado IMC >27

        } else if (imc > 27 && idade >= 26 && idade < 46) {
            System.out.println("Os Treinos Recomendados sâo Leves: Ioga");
        } else {
            System.out.println("Os Treinos Recomendados sâo Leves: Musculação Moderada e Dança");
        }

    }

}
