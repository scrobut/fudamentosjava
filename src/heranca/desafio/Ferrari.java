package heranca.desafio;

public class Ferrari extends Carro implements Esportivo{

        boolean acelerar(Carro velocidadeAcel){
            if (velocidadeAtual >= 0) {
                velocidadeAcel.velocidadeAtual += 15;
                System.out.println("Acelerouuu a Ferrari: " + velocidadeAcel.velocidadeAtual);
                return true;
            }else
                System.out.println("Nao foi possivel acelerar");
            return false;
    }

    @Override
    public void ligarTurbo() {

    }

    @Override
    public void desligarTurbo() {

    }
}
