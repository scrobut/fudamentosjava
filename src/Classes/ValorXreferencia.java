package Classes;

public class ValorXreferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;
        a++;
        b--;

        System.out.println(a +" " + b);

        Data d1 = new Data(1,6,2002);
        Data d2 = d1;

        System.out.println(d1.formataData());

        voltandoValor(d1);

        System.out.println(d1.formataData());
    }
    static void voltandoValor(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1960;

    }
}
