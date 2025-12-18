package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {

    private String nome;
    private int idade;
    private Time time;

    public void imprime(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(time.getNome());
    }

    public Jogador(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Jogador(String nome, int idade, Time time){
        this.nome = nome;
        this.idade = idade;
        this.time = time;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
