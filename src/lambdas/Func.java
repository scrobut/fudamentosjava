package lambdas;

import java.util.function.Function;

public class Func {
    public static void main(String[] args) {

        Function<Integer, String> parOrImpar = num -> num % 2 == 0 ? "par" : "Impar";
        System.out.println(parOrImpar.apply(22));



     }
}
