package fundamentos;

import javax.swing.*;

public class ConversaoStringToNumber {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");
        System.out.println(valor1 + "\n" + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double soma = numero1 + numero2;
        System.out.println(soma);

    }
}
