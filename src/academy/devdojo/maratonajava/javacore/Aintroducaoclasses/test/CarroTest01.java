package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.Nome = "Celta";
        carro1.Modelo = "ret";
        carro1.ano = 2015;

        carro2.Nome = "Palio";
        carro2.Modelo = "Attractive";
        carro2.ano = 2016;

        carro1.descricao();
        carro2.descricao();
    }
}
