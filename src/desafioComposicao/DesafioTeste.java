package desafioComposicao;

public class DesafioTeste {

    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Diogo");
        Compra cp1 = new Compra();
        Compra cp2 = new Compra();
        cp1.adicionaritem("caneta", 10, 1);
        cp2.adicionarItem(new Produto("notebook", 8.2), 2);

        cl1.adicionarCompra(cp1);
        cl1.compras.add(cp2);
        System.out.println(cl1.obterValorTotal());
    }
}
