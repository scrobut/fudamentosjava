package fundamentos.controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota de 0 a 10");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("valor invalido");
        } else if (nota >= 8.1) {
            System.out.println("nota a");
        } else if (nota < 8) {
            System.out.println("nota tipo b");
        }

        entrada.close();
    }
}
