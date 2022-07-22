package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> nums = (ac, n)  -> ac + n;
        Integer total1 = values.stream().reduce(nums).get();

        System.out.println(total1);

        Integer total2 =  values.stream().reduce(10, nums);
        System.out.println(total2);

        values.stream()
                .filter(n -> n > 4)
                .reduce(nums)
                .ifPresent(System.out::println);
    }
}
