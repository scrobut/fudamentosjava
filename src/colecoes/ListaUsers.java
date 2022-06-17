package colecoes;

import java.util.ArrayList;

public class ListaUsers {
    public static void main(String[] args) {
        ArrayList<Usuarios> lista = new ArrayList<>();

        Usuarios diogo = new Usuarios("Diogo");
        lista.add(diogo);
        lista.add(new Usuarios("mayara"));
        lista.add(new Usuarios("maria"));
        lista.add(new Usuarios("marcia"));

        System.out.println(lista.get(2));
        for (Usuarios user:lista
             ) {
            System.out.println(user);
            
        }
    }
}
