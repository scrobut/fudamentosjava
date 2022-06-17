package colecoes;

import java.util.HashMap;
import java.util.Map;

public class maaps {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Roberto");

        System.out.println(usuarios.size());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        for (int chave: usuarios.keySet()
             ) {
            System.out.println(chave);
        }

        for (String valores: usuarios.values()
             ) {
            System.out.println(valores);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()
             ) {
            System.out.println(registro.getKey());
        }


    }
}
