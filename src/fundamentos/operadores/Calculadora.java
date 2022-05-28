package fundamentos.operadores;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("por favor digite um numero: ");
        double num1 = entrada.nextDouble();
        System.out.println("por favor digite o segundo numero: ");
        double num2 = entrada.nextDouble();
        System.out.println("por favor informe a operacao: ");
        String operacao = entrada.next();
        double resultado =  "+".equals(operacao) ? num1 + num2 : 0;
        resultado =  "*".equals(operacao) ? num1 * num2 : resultado;
        resultado =  "/".equals(operacao) ? num1 / num2 : resultado;
        resultado =  "-".equals(operacao) ? num1 - num2 : resultado;

        System.out.printf("%f %s %f = %f",num1 , operacao , num2, resultado);

        entrada.close();
    }
}
