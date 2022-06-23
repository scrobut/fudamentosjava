package objetos;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Itens> produto = new ArrayList();
    void adicionar(Itens itens){
        produto.add(itens);
        itens.compra =this;
    }
    double getValue(){
        double total =0;
        for (Itens item: produto
             ) {
            total += item.quant * item.preco;
        }
        return total;
    }


}
