package Classes;

public class Equals {
    public static void main(String[] args) {
        Usuario user1 = new Usuario();
        user1.nome = "Diogo";
        user1.email = "diogo@scrobut.com";

        Usuario user2 = new Usuario();
        user2.nome = "Diogo";
        user2.email = "diogo@scrobut.com";

        System.out.println( user1 == user2);
        System.out.println(user1.equals(user2));
       // System.out.println(user1.hashCode());
    }
}
