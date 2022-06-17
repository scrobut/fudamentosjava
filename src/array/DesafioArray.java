package array;


import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Quantas notas? ");
        int quantNotas = Entrada.nextInt();
        double [] notas = new double[quantNotas];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota: "+ (i + 1) + ": ");
            notas[i]= Entrada.nextDouble();
        }
        System.out.println(Arrays.toString(notas));
        Entrada.close();

        double total = 0;
        for (double nota: notas
             ) {
            total += nota;
        }

        System.out.println(total / notas.length);
    }
    
    
}
