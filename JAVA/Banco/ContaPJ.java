package RevisaoPOO.Banco;

import javax.swing.JOptionPane;

public class ContaPJ extends Conta{
    //atributo
    String nCnpj;
    double faturamento;
    //construtor default(vazio)
    //set get

    public String getnCnpj() {
        return nCnpj;
    }

    public void setnCnpj(String nCnpj) {
        this.nCnpj = nCnpj;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }
    
    //metodo
    public void saldo(){
         JOptionPane.showMessageDialog(null,"O saldo atual da conta é de: "+saldo);
    }
    public void saque() {
        double saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Saque"));
        if(saldo-saque>=faturamento/-5){
            saldo = saldo-saque;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso. O novo saldo é de:" +saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }
    public void emprestimo(){
        double emprestimo = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor do emprestimo desejado"));
        int nParcelas = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero de parcelas"));
        double valorParcelas;

        if(emprestimo<=faturamento*5){
            valorParcelas=emprestimo*(1+nParcelas/90)/nParcelas;
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

