package Classes;

public class DataTeste {
    public static void main(String[] args) {
        Data calendario = new Data(12,1800,03);
       // calendario.dia = 12;
       // calendario.ano = 2022;
       // calendario.mes = 4;

        Data calendario2 = new Data();{
            System.out.println(calendario2.formataData());
        }

        System.out.println(calendario.formataData());
    }
}
