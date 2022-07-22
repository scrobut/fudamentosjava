package polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa diogo = new Pessoa(70.3);
        Arroz arroz =  new Arroz(0.60);
        Feijao feijao = new Feijao(0.90);

        System.out.println(diogo.getPeso());

        diogo.comer(arroz);
        diogo.comer(feijao);
        diogo.comer(feijao);

        System.out.println(diogo.getPeso());


    }
}
