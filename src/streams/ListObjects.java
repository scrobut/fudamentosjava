package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ListObjects {
    public static void main(String[] args) {
        List<String> aprovate = Arrays.asList("Diogo", "mayara", "joao");

        System.out.println("\nUse For");
        for (int i = 0; i < aprovate.size(); i++){
            System.out.println(aprovate.get(i));
        }

        System.out.println("\nUse Foreach");
        for (String names: aprovate
             ) {
            System.out.println(names);
        }

        System.out.println("\nUse Iterator");
        Iterator<String> it = aprovate.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nUse Stream");
        Stream<String> stream = aprovate.stream();
        stream.forEach(System.out::println);
    }
}
