public class Professor extends Pessoa {

    private String matricula;

    public Professor(String nome, int idade, String matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    /*-----------------*/

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getMatricula(){
        return this.matricula;
    }

}
