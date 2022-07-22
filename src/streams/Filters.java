package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filters {


    public static void main(String[] args) {

        FiltersReference r1 = new FiltersReference("Diogo", 8.9, true);
        FiltersReference r2 = new FiltersReference("Diego", 3.9, true);
        FiltersReference r3 = new FiltersReference("Ana", 7.9, true);
        FiltersReference r4 = new FiltersReference("Maria", 2.9, true);
        FiltersReference r5 = new FiltersReference("Vini", 6.9, false);

        List<FiltersReference> rs = Arrays.asList(r1, r2 , r3, r4, r5);

        Predicate<FiltersReference> aprovate = r -> r.nota >= 3.7;
        Predicate<FiltersReference> comporament = r -> r.comportament;

        rs.stream()
                .filter(aprovate)
                .filter(comporament)
                .map(r -> "parabens " + r.names + " vc foi aprovado")
                .forEach(System.out::println);

    }


}
