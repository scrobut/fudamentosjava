package objetos;

public class CompraTeste {
    public static void main(String[] args) {
        Compra comprinhas = new Compra();

        comprinhas.cliente = "Diogo";
        comprinhas.adicionar(new Itens("agulha", 4, 3.2));
        comprinhas.adicionar(new Itens("fio", 2, 1.2));
        comprinhas.adicionar(new Itens("maquina", 1, 100.2));

        System.out.println(comprinhas.produto.size());
        System.out.println(comprinhas.getValue());
        double total = comprinhas.produto.get(0).compra.getValue();
        System.out.println(total);
    }
}
