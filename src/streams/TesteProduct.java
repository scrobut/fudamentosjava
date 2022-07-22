package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TesteProduct {

    public static void main(String[] args) {
        Product p1 = new Product("pencil", 1.3, 0.3, 12);
        Product p2 = new Product("keys", 3.3, 0.3, 7);
        Product p3 = new Product("glass", 4.3, 0.3, 8);
        Product p4 = new Product("shirt", 2.3, 0.3, 2);

        List<Product> products = Arrays.asList(p1, p2, p3, p4);

        Predicate<Product> sales = p -> p.price >= 2.4 && p.shipping >= 6;

        products.stream()
                .filter(sales)
                .map(product -> "nome do produto " + product.name)
                .forEach(System.out::println);

    }
}
