package fundamentos.controle;

import java.util.Scanner;

public class SwitchNext {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        String conceito = "";
        System.out.print(" informe uma nota :");
        int nota = Entrada.nextInt();
        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
        }
        System.out.println("resposta =" + conceito);

        Entrada.close();
    }
}
