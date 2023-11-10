package RevisaoPOO.Banco;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // criar os vetores de objetos
        ContaPF contasPf[] = new ContaPF[10];
        ContaPJ contasPj[] = new ContaPJ[10];
        // criar a aplicação do banco
        boolean aberta = true;
        int contPF = 0;
        int contPj = 0;
        int contaAtual = 0;
        while (aberta) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha ação desejada:"
                            + "\n 1-Abrir Conta PF"
                            + "\n 2-Abrir Conta PJ"
                            + "\n 3-Acessar Conta PF"
                            + "\n 4-Acessar Conta PJ"
                            + "\n 5-Sair"));
            if (acao == 1) {// abrir conta PF
                // criar a conta
                // instanciar o objeto
                contasPf[contPF] = new ContaPF();// objeto criado
                // preencher as informações da conta
                contasPf[contPF].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                contasPf[contPF].setnCpf(JOptionPane.showInputDialog("Informe o CPF:"));
                contasPf[contPF].setSalario(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Salario:")));
                contasPf[contPF].setSaldo(0);
                contasPf[contPF].setnConta(1000 + contPF);
                contPF++;

            } else if (acao == 2) {// abrir conta PJ
                // criar a conta
                // instanciar o objeto
                contasPj[contPj] = new ContaPJ();// objeto criado
                // preencher as informações da conta
                contasPj[contPj].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                contasPj[contPj].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ:"));
                contasPj[contPj].setFaturamento(
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Faturamento Anual:")));
                contasPj[contPj].setSaldo(0);
                contasPj[contPj].setnConta(2000 + contPj);
                contPj++;

            } else if (acao == 3) {// buscar a conta já criada da PF
                for (int i = 0; i < contPF; i++) {
                    // busca pelo nº da conta
                    int nContaBusca = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                    if (nContaBusca == contasPf[i].getnConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                        boolean acessar = true;
                        while (acessar) {
                            int acao3 = Integer.parseInt(JOptionPane.showInputDialog("Ação desejada:"
                                    + "\n 1- Verificar saldo"
                                    + "\n 2- Saque"
                                    + "\n 3- Deposito"
                                    + "\n 4- Emprestimo"
                                    + "\n 5- Sair"));
                            if (acao3 == 1) {
                                contasPf[contaAtual].saldo();
                            } else if (acao3 == 2) {
                                contasPf[contaAtual].saque();
                            } else if (acao3 == 3) {
                                contasPf[contaAtual].deposito();
                            } else if (acao3 == 4) {
                                contasPf[contaAtual].emprestimo();
                            } else if (acao3 == 5) {
                                acessar = false;
                                JOptionPane.showMessageDialog(null, "Seção encerrada.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Ação invalida");
                            }
                        }
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Conta não encontrada");
                    }
                }

            } else if (acao == 4) {// buscar a conta já criada da PF
                for (int i = 0; i < contasPj.length; i++) {
                    // busca pelo nº da conta
                    int nContaBusca = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                    if (nContaBusca == contasPj[i].getnConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                        boolean acessar = true;
                        while (acessar) {
                            int acao4 = Integer.parseInt(JOptionPane.showInputDialog("Ação desejada:"
                                    + "\n 1- Verificar saldo"
                                    + "\n 2- Saque"
                                    + "\n 3- Deposito"
                                    + "\n 4- Emprestimo"
                                    + "\n 5- Sair"));
                            if (acao4 == 1) {
                                contasPj[contaAtual].saldo();
                            } else if (acao4 == 2) {
                                contasPj[contaAtual].saque();
                            } else if (acao4 == 3) {
                                contasPj[contaAtual].deposito();
                            } else if (acao4 == 4) {
                                contasPj[contaAtual].emprestimo();
                            } else if (acao4 == 5) {
                                acessar = false;
                                JOptionPane.showMessageDialog(null, "Seção encerrada.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Ação invalida");
                            }
                        }
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Conta não encontrada");
                    }
                }

            } else if (acao == 5) {
                JOptionPane.showMessageDialog(null, "Sistema encerrado");
                aberta = false;
            } else {
                JOptionPane.showMessageDialog(null, "Ação invalida");
            }
        }
    }
}
