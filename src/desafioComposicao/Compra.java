package desafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto prod1, int quantidade){
        this.itens.add(new Item(prod1, quantidade));
    }

    void adicionaritem(String nome, double preco, int quantidade){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto,quantidade));
    }



    double obterValorTotal(){

        double total = 0;
        for (Item item: itens
             ) {
            total += item.quantidade * item.produto.preco;

        }
        return total;
    }
}
