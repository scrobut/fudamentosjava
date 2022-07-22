package streams;

public class Products {

    String name;
    double value;
    double sale;

    boolean comportament;


    public Products(String name, double value, double sale) {
        this(name, value, sale, true);
    }

    public Products(String name, double value, double sale, boolean comportament) {
        this.name = name;
        this.value = value;
        this.sale = sale;
        this.comportament = comportament;
    }
}
