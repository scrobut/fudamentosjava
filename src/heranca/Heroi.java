package heranca;

public class Heroi extends Jogador{

    boolean ataque(Jogador oponente){
       boolean ataque1 = super.ataque(oponente);
       boolean ataque2 = super.ataque(oponente);
       return ataque1 || ataque2;
    }
}
