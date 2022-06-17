package array;

import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {
        double[] notasAlunos = new double[3];
        notasAlunos[0] = 7.9;
        notasAlunos[1] = 6.9;
        notasAlunos[2] = 8.0;

        System.out.println(Arrays.toString(notasAlunos));

        double total = 0;

        for (int i = 0; i < notasAlunos.length; i ++){
            total += notasAlunos[i];
        }

        System.out.println(total / notasAlunos.length);

            double total2=0;
        double[] notas2 = { 7.9, 6.9 , 8.0};
        for(int i =0; i < notas2.length; i ++){
            total2 += notas2[i];
            System.out.println(total2 / notas2.length);
        }

    }
}
