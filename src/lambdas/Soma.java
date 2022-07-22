package lambdas;

import java.util.Arrays;
import java.util.List;

public class Soma implements Calculo{
    @Override
    public double executar(double a, double b) {
        return a+b;
    }

    public static class Foreach {
        public static void main(String[] args) {
            List<String> peoples = Arrays.asList("may", "gui", "ana");

            for (String names: peoples
                 ) {
                System.out.println(names);
            }

            peoples.forEach((names) -> System.out.println(names + "!!!"));
        }
    }
}
