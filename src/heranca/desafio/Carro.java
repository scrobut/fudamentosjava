package heranca.desafio;

public class Carro {

    double velocidadeAtual = 0;


    boolean acelerar(Carro velocidadeAcel){
        if (velocidadeAtual >= 0) {
            velocidadeAcel.velocidadeAtual += 5;
            System.out.println("Acelerouuu: " + velocidadeAcel.velocidadeAtual);
            return true;
        }else
            System.out.println("Nao foi possivel acelerar");
        return false;

    }

    boolean Frear(Carro velocidadeFre){

        if (velocidadeAtual != 0) {
            velocidadeFre.velocidadeAtual -= 5;
            return true;
        }else
            System.out.println("velovidade esta em zero");
        return false;

    }
}
