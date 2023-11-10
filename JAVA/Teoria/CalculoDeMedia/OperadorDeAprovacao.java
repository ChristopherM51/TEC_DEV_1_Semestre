package CalculoDeMedia;

import java.util.Scanner;

public class OperadorDeAprovacao {
    Scanner sc = new Scanner(System.in);
    public void notafrequencia(){

        System.out.println("Informe a Nota 1 do aluno:");
        int nota1 = sc.nextInt();

        System.out.println("Informe a Nota 2 do aluno:");
        int nota2 = sc.nextInt();

        System.out.println("Informe a Frequencia do aluno");
        int frequenciaAluno = sc.nextInt();

        double CalculoDeMedia = (nota1+nota2)/2;
        System.out.println("A média do aluno é "+CalculoDeMedia);
        Boolean mediaAprovado = CalculoDeMedia>=50;

        System.out.println("O Aluno está aprovado por nota?"+ mediaAprovado);
        Boolean frequenciaAprovada = frequenciaAluno>=75;
        System.out.println("O aluno está aprovado por frequencia?"+ frequenciaAprovada);

        Boolean aprovacaoFinal = (mediaAprovado==true)&&(frequenciaAprovada==true);
        System.out.println("O aluno está aprovado no curso? "+aprovacaoFinal);
    }
}
