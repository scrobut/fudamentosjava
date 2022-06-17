package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        SortedSet<String> list = new TreeSet<>();
        list.add("Diogo");
        list.add("Ana");
        list.add("Lucas");
        list.add("Diego");
        list.add("Aninha");

        for (String nomes: list
             ) {
            System.out.println(nomes);
            
        }
    }
}
