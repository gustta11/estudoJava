package academy.devdojo.maratonajava.javacore.Eblocosdeinicializaca.test;

import academy.devdojo.maratonajava.javacore.Eblocosdeinicializaca.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime("Jorro");
        Anime anime02 = new Anime("One Piece");
        anime01.imprime();
        anime02.imprime();
        for (int episodio : anime02.getEpisodios()) {
            System.out.println(episodio);
        }


    }
}
