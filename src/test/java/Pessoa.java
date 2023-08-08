public class Pessoa {

    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String getNome();

    public String getNome() {
        return nome;
    }
}
