package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class CreateMap {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        List<String> marcas = Arrays.asList(" nike ", " coca ", " tim \n");

         marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> upper = n -> n.toUpperCase();
        UnaryOperator<String> firstN = n -> n.charAt(0) + "";
        UnaryOperator<String> say = n -> n + "!!!!";
        System.out.println(upper.andThen(firstN).andThen(say).apply("nike"));


        marcas.stream().map(upper).map(firstN).map(say).forEach(print);
    }
}
