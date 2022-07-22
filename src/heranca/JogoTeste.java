package heranca;

public class JogoTeste {
    public static void main(String[] args) {
        Boss j1 = new Boss(10,10);
        j1.x = 10;
        j1.y = 10;


        Heroi j2 = new Heroi(10,11);


        System.out.println(j1.vida);
        System.out.println(j2.vida);

        j1.ataque(j2);
        System.out.println(j1.vida);
        System.out.println(j2.vida);





    }
}
