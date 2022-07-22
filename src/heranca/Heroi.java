package heranca;

public class Heroi extends Jogador{

    Heroi(int x , int y){
        super(x,y);
    }
    boolean ataque(Jogador oponente){
       boolean ataque1 = super.ataque(oponente);
       boolean ataque2 = super.ataque(oponente);
       return ataque1 || ataque2;
    }
}
