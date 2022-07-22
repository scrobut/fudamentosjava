package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ChaMap {
    public static void main(String[] args) {
//        transformar numero em string binaria
//        inverter sequencia binaria
//        converter em numero novamente

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        UnaryOperator<String> reverse = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> numberBi = binary -> Integer.parseInt(binary, 2);


        nums.stream().forEach(System.out::println);

        nums.stream()
                .map(Integer::toBinaryString)
                .forEach(System.out::println);
        nums.stream()
                .map(Integer::toBinaryString)
                .map(reverse)
                .forEach(System.out::println);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(reverse)
                .map(numberBi)
                .forEach(System.out::println);


    }
}
