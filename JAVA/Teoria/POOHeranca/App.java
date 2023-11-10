package POOHeranca;

public class App {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos();
        Professor professor1 = new Professor();
        Funcionarios funcionario1 = new Funcionarios();

        aluno1.setNome("Juzé");
        professor1.setNome("Lucas");
        funcionario1.setNome("Pedro");

        System.out.println(aluno1.getNome());
        System.out.println(professor1.getNome());
        System.out.println(funcionario1.getNome());
    }

}
