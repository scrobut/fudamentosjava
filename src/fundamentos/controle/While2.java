package fundamentos.controle;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "";
        while (!valor.equalsIgnoreCase("sair")){
            System.out.print("voce diz: ");
            valor = entrada.nextLine();
        }
        System.out.println("voce saiu");
        entrada.close();
    }


}
