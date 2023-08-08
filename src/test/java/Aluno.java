public class Aluno extends Pessoa{

    private int ra;

    public Aluno(String nome, int idade){
        super(nome, idade);
    }

    public Aluno(String nome, int idade, int ra){
        super(nome, idade);
        this.ra = ra;
    }

    /*------------------------------------*/

    @Override
    public String getNome(){
        return "Aluno: " + super.getNome();
    }
    public int getIdade(){
        return this.idade;
    }
    public int getRa(){
        return this.ra;
    }
}