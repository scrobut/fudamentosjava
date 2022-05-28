package fundamentos.controle;

import javax.swing.*;

public class Else {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe numero: ");
        int numero = Integer.parseInt(valor);

        if ( numero % 2 == 0){
            System.out.println("numero par");
        }else {
            System.out.println("numero impar");
        }
    }
}
