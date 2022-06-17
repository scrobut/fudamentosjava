package array;


import java.util.Arrays;
import java.util.Scanner;

/*
@editor Diogo Scrobut
 */
public class matriz {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.print("quantidade de alnos: ");
        int quantidadeAlunos = Entrada.nextInt();

        System.out.print("quantidade de notas por alunos: ");
        int quantidadeNotas = Entrada.nextInt();

        double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("informe a nota %d do aluno %d: ", i + 1, j + 1);
                notasDaTurma[i][j] = Entrada.nextDouble();
                total += notasDaTurma[i][j];
            }

        }
        double media = total / (quantidadeAlunos * quantidadeNotas);
        System.out.println("media da turma eh: " + media);

        for (double[] notasDoAluno : notasDaTurma
        ) {
            System.out.println(Arrays.toString(notasDoAluno));
        }
        Entrada.close();
    }
}
