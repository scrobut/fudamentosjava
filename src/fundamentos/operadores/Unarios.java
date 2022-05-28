package fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {
        double media = 4.3;
        String parcial = media >= 5.0 ? "recuperacao" : "reprovado";
        String resultado = media >= 7.0 ? "aprovado" : parcial;
        System.out.println("Aluno esta: " + resultado);
    }
}
