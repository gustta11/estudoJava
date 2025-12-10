package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro("BMW", 200);
        Carro carro02 = new Carro("Audi", 300);

        Carro.setVelocidadeLimite(180);
        carro01.imprime();
        carro02.imprime();


    }
}
