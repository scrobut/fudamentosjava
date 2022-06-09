package Classes;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto(){

    }
    Produto(String nomeDoProduto){
        nome = nomeDoProduto;
    }

    Produto(String nomeDoProduto, double precoDoProduto){
        nome = nomeDoProduto;
        preco = precoDoProduto;
    }


    double precoComDesconto(){
        return preco * (1 - desconto);
    }
}
