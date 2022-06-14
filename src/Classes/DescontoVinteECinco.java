package Classes;

public class DescontoVinteECinco {
    String produto;
    double preco;
    static double descontoPadrao = 0.25;

    DescontoVinteECinco( String produtoInicial, double precoNew){
        produto = produtoInicial;
        preco = precoNew;
    }

    double precoDesconto(){
        return preco * (1 - descontoPadrao);
    }
}
