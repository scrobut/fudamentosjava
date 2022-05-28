package fundamentos.controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe a media: ");
        double media = entrada.nextDouble();

        if(media >= 5){
            System.out.println("aprovado");
        }else {
            System.out.println("reprovadinho");
        }


        entrada.close();
    }
}
