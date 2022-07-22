package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreateStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        Stream<String> langs = Stream.of("java ", "Dart ", "php \n");
        langs.forEach(print);

        String [] morePrint = {"1", "2" , "3\n"};
        Stream.of(morePrint).forEach(print);
        Arrays.stream(morePrint).forEach(print);
        Arrays.stream(morePrint, 1, 3).forEach(print);
    }
}
