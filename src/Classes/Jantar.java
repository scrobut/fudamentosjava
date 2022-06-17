package Classes;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("arroz",0.10);
        Comida c2 = new Comida("feijao",0.10);
        Comida c3 = new Comida("carne",0.10);
        Pessoa p1 = new Pessoa("Diogo", 1.80);
        double soma = c1.peso + c2.peso + c3.peso + p1.peso;
        System.out.println("O cliente: "+ p1.nome +" comeu: " +c1.nome +" "+c2.nome +" "+ c3.nome+" e agora esta com peso:" + soma);

    }
}
