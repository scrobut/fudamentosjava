package lambdas;

public class CalculoTesteDois {
    public static void main(String[] args) {

        Calculo soma = (x,y) -> { return x + y;};

        System.out.println(soma.executar(3,2));

        soma = (x,y) -> x * y;
        System.out.println(soma.executar(2,5));

        System.out.println(soma.legal());
        System.out.println(Calculo.newNew());
    }

}
