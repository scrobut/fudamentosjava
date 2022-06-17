package colecoes;

import Classes.Usuario;

import java.util.Objects;

public class Usuarios {
    String nome;

    Usuarios(String nome){

        this.nome = nome;

    }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuarios)) return false;
        Usuarios usuarios = (Usuarios) o;
        return nome.equals(usuarios.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
