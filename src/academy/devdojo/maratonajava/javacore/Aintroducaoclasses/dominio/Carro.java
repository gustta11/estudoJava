package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Carro {
    public String Nome;
    public String Modelo;
    public int ano;

    public void descricao(){
        System.out.println("Nome: " + this.Nome);
        System.out.println("Modelo " + this.Modelo);
        System.out.println("Ano " + this.ano);
    }
}
