package heranca.encapsulamento.casaA;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private int idade;
    private double altura;


    public Pessoa(String nome, String sobreNome, int idade, double altura) {
        setNome(nome);
        setSobreNome(sobreNome);
        setIdade(idade);
        setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString(){
        return "meu nome é " + this.nome +" "+ this.sobreNome+" e tenho "+ this.idade+" de idade.";
    }
}
