package objetos;

public class CarroTeste {

    public static void main(String[] args) {
        Carro reno = new Carro();
        System.out.println(reno.estaLigado());

        reno.ligar();
        System.out.println(reno.estaLigado());
        System.out.println(reno.motor.giros());

        reno.acelerar();
        System.out.println(reno.motor.giros());
    }

}
