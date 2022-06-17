package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilhas {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("lala");
        livros.offer("leao");
        livros.push("vida");

        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.pop());
        System.out.println(livros.pop());
        System.out.println(livros.pop());
        System.out.println(livros.size());
        System.out.println(livros.contains("lala"));
    }
}
