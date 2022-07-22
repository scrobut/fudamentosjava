package heranca.desafio;

public class TesteDesafio {
    public static void main(String[] args) {
        Ferrari fer = new Ferrari();
        fer.acelerar(fer);
        fer.Frear(fer);
        fer.Frear(fer);
        fer.Frear(fer);
        fer.Frear(fer);


        Civic civ = new Civic();
        civ.acelerar(civ);
        civ.acelerar(civ);
        civ.acelerar(civ);
        civ.acelerar(civ);
        civ.acelerar(civ);


        System.out.println(fer.velocidadeAtual);
        System.out.println(civ.velocidadeAtual);
    }
}
