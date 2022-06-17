package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        String nome = "Diogo";

        conjunto.add(1.2);
        conjunto.add(1);
        conjunto.add(true);
        conjunto.add(nome);
        System.out.println(conjunto.size());
        System.out.println(conjunto.contains("Diogo"));
        System.out.println(nome.hashCode());

        Set set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        conjunto.retainAll(set);
        System.out.println(conjunto);
        conjunto.addAll(set);
        System.out.println(conjunto);
    }
}
