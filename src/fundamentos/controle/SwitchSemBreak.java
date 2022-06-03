package fundamentos.controle;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "preta";
        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("resposta = preta");
            case "marrom":
                System.out.println("resposta = marrom");
            case "verde":
                System.out.println("resposta = verde");
            default:
                System.out.println("resposta = default");
        }
        String profissional = "diogo";
        switch (profissional){
            case "diogo":
                System.out.println("foda");
                break;
            case "outro":
                System.out.println("nada");
            case "ele":
                System.out.println("nadinha");
        }
    }
}
