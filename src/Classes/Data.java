package Classes;

public class Data {
    int mes;
    int ano;
    int dia;

    Data(){
        mes = 1;
        ano = 1990;
        dia = 1;
    }
    Data( int mesAtual, int anoAtual, int diaAtual){
        mes = mesAtual;
        dia = diaAtual;
        ano = anoAtual;
    }

    String formataData(){
        return String.format("%d/%d/%d", dia,mes,ano);
    }
}
