package Classes;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto perfume = new Produto("diogo", 12.5);
        //perfume.nome = "carraja";
        //perfume.preco = 150;
        perfume.desconto = 0.25;

        System.out.println(perfume.nome);

        Produto agulha = new Produto();
        agulha.nome = "aço";
        agulha.preco = 1.25;
        agulha.desconto = 0.11;

        double precoFinalAgulha = agulha.precoComDesconto();

        System.out.println(precoFinalAgulha);

    }
}
