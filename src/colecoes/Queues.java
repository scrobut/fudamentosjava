package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String>  fila = new LinkedList<>();
        fila.add("Diogo"); // false
        fila.offer("Mateus"); //lanca uma exceção
        fila.offer("Mat");
        fila.offer("Joao");

        for (int i = 0; i < fila.size(); i++) {

            System.out.println(fila.poll());
            System.out.println(fila.poll());
            System.out.println(fila.poll());
            System.out.println(fila.poll());
        }
        System.out.println("saindo do for");

        int i = 0;
        while ( i <= fila.size()){

            System.out.println(fila.poll());
            System.out.println(fila.poll());
            i ++;
        }

        System.out.println(fila.size());
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.element()); // retorna exceção

    }
}
