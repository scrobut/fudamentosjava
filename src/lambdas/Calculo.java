package lambdas;
@FunctionalInterface
public interface Calculo {

    public double executar(double a , double b);
    default String legal(){
        return "legal";
    }
    static String newNew(){
        return "test";
    }
}
