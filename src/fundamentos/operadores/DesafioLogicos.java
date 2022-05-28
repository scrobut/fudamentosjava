package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean tomouSorvete = !(trabalho1 && trabalho2);

        System.out.println(comprouTv32);
        System.out.println(comprouTv50);
        System.out.println(tomouSorvete);

    }
}
