package lambdas;

import java.util.function.Predicate;

public class PredicadoFunction {

    public static void main(String[] args) {
        Predicate<Integer> isPar = nun -> nun % 2 == 0 ;
        Predicate<Integer> number = nun1 -> nun1 >= 100 && nun1 <= 999;

        System.out.println(isPar.and(number).test(222));
    }



}
