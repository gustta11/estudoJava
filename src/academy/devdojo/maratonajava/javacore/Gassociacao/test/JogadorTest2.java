package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Time time = new Time("Bahia");
        Jogador jogador = new Jogador("Cauly", 28, time);
        Jogador jogador1 = new Jogador("Everton Ribeiro",23);
        Jogador jogador2 = new Jogador("Jean Lucas", 24);
        Jogador jogador3 = new Jogador("Erick Pulga", 25);

        Jogador[] jogadores = {jogador,jogador1,jogador2,jogador3};

        time.setJogadores(jogadores);

        jogador2.setTime(time);
        jogador3.setTime(time);

        jogador3.imprime();
        time.imprimeJogadores();
        jogador2.getTime();


    }
}
