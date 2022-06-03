package fundamentos.controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palavra = "";
        do {
            System.out.println("voce precisa falar : ");
            palavra = entrada.nextLine();
        } while (!palavra.equalsIgnoreCase("por favor"));
        System.out.println("obrigado");
        entrada.close();
    }


}
