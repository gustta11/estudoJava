package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario = new double[3];

    public void imprimir (){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(salario == null){
            return;
        }
        for(double sal:salario){
            System.out.println(sal + " ");
        }
        mediaDosSalarios();
    }

    public void mediaDosSalarios(){
        if(salario == null){
            return;
        }
        double soma = 0;
        for(double sal:salario){
            soma += sal;
        }
        System.out.println("Média: " + soma/salario.length);
    }
}
