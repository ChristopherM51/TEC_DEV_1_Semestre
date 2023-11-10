package RevisaoPOO.Banco;

import javax.swing.JOptionPane;

public class ContaPF extends Conta {
    //atributo
    String nCpf;
    double salario;
    //set get
    //cosntrutor default(vazio)
    public String getnCpf() {
        return nCpf;
    }
    public void setnCpf(String nCpf) {
        this.nCpf = nCpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //método vazio
    public void saldo(){
         JOptionPane.showMessageDialog(null,"O saldo atual da conta é de: "+saldo);
    }
    public void saque() {
        double saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Saque"));
        if(saldo-saque>=salario/-2){
            saldo = saldo-saque;
            JOptionPane.showMessageDialog(null, "Saque realizado. O novo saldo é de:" +saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }
    public void emprestimo(){
        double emprestimo = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor do emprestimo desejado"));
        int nParcelas = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de parcelas"));
        double valorParcelas;

        if(emprestimo<=salario*10){
            valorParcelas=emprestimo*(1+nParcelas/100)/nParcelas;
            JOptionPane.showMessageDialog(null,"Emprestimo aprovado: \n Serão "+nParcelas+" no Valor de "+valorParcelas);
        } else{
            JOptionPane.showMessageDialog(null, "Emprestimo Negado");
        }
    }
    public void deposito(){
        double deposito = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor do Deposito"));
        saldo = saldo+deposito;
        JOptionPane.showMessageDialog(null,"O novo Saldo é de: "+saldo);
        }
    }
