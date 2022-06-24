package heranca.desafio;

public class Civic extends Carro{

    @Override
    boolean acelerar(Carro velocidadeAcel) {
        boolean acelera1 = super.acelerar(velocidadeAcel);
        return acelera1;
    }
}
