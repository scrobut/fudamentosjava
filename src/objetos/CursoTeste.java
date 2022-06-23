package objetos;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Diogo");
        Aluno aluno2 = new Aluno("Bigo");
        Aluno aluno3 = new Aluno("Noma");

        Curso curso1 = new Curso("java");
        Curso curso2 = new Curso("html");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        aluno1.adicinionarCurso(curso2);
        aluno3.adicinionarCurso(curso1);

        for (Aluno aluno: curso1.alunos
             ) {

            System.out.println("estou matriculado " + curso1.nome);
            System.out.println(" meu nome eh " + aluno.nome);
            System.out.println();
        }

    }
}
