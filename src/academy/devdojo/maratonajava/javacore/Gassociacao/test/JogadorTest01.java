package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Time time = new Time("Santos");
        Time time2 = new Time("Bahia");
        Jogador jogador1 = new Jogador("Cafu", 18, time);
        Jogador jogador2 = new Jogador("Elias", 25, time2);
        Jogador jogador3 = new Jogador("Neymar", 22, time);

        Jogador[] jogadores = {jogador1,jogador2,jogador3};


        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }

}
