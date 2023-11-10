package AtividadeRevisao1;

import java.util.Scanner;

public class ExemploRevisao1 {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        //1. Ler o nº
        System.out.println("Digite um nº ");
        double nDigitado = sc.nextDouble();

        //2. Se nº > 10
        if (nDigitado>10) {
            System.out.println(nDigitado + " É maior que 10!");
        } 
        //3. Se nº <= 10
        else {
            System.out.println(+nDigitado +" Não é maior que 10!");
        }
        
        
    }
    public void exemplo2() {

        System.out.println("Informe a quantidade de horas trabalhadas (minimo de 200)");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Informar o salario por hora");
        double salarioHora = sc.nextDouble();
        double salarioBase = salarioHora*200;
        double horaExtra = (horasTrabalhadas-200)*salarioHora*1.5;
        double salarioFinal = horaExtra+salarioBase;

        System.out.println("O Salario será de "+salarioFinal);
    }
    public void exemplo3() {
        System.out.println("Informe a quantidade de horas trabalhadas (minimo de 200)");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Informar o salario por hora");
        double salarioHora = sc.nextDouble();
        System.out.println("Informe o adicional por hora extra");
        double adExtra = sc.nextDouble();
        double salarioBase = salarioHora*200;
        double horasExtras = (horasTrabalhadas-200);
        double salarioFinal = 0;

        if (horasExtras>0){
            salarioFinal = horasExtras*adExtra*salarioHora+salarioBase;
            System.out.println("O Salario será de R$"+salarioFinal);
        } else {
            salarioFinal = salarioBase+horasExtras*salarioHora;
            System.out.println("O Salario será de "+salarioFinal);

        }
    }
    
}
