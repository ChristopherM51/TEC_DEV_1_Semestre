package POOIntroducao;

public class App {
    public static void main(String[] args) {
        // criar 3 objetos ResgistraAluno
        RegistraAluno aluno = new RegistraAluno();
        RegistraAluno aluno1 = new RegistraAluno();
        RegistraAluno aluno2 = new RegistraAluno();
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // set do nome usando setNome
        aluno.setNome("Ana Machado");
        aluno.setEndereco("Verdanks, 1984");
        aluno.setIdade(14);
        aluno.setNotaCiencias(10);
        aluno.setNotaMatematica(9);
        aluno.setNotaPortugues(7);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        aluno1.setNome("Roberto da Silva");
        aluno1.setEndereco("Rebirth Island, 1984");
        aluno1.setIdade(17);
        aluno1.setNotaCiencias(4);
        aluno1.setNotaMatematica(3);
        aluno1.setNotaPortugues(5);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        aluno2.setNome("Carlos Alberto");
        aluno2.setEndereco("Almazda, 2022");
        aluno2.setIdade(13);
        aluno2.setNotaCiencias(10);
        aluno2.setNotaMatematica(10);
        aluno2.setNotaPortugues(8);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // Imprimi usando o método getNome
        System.out.println(aluno.getNome());
        System.out.println(aluno.getEndereco());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getMedia());
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getEndereco());
        System.out.println(aluno1.getIdade());
        System.out.println(aluno1.getMedia());
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getEndereco());
        System.out.println(aluno2.getIdade());
        System.out.println(aluno2.getMedia());
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println("Contador: "
                + RegistraAluno.getQuantidadeAlunos());
    }
}
