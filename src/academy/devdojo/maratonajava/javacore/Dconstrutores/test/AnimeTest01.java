package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Pokemon", "TV", 540);
        Anime anime2 = new Anime("Naruto", "TV", 550, "Adulto");
        Anime anime3 = new Anime("DragonBallZ","TV", 800, "Jovem",15);
        anime.imprimir();
        anime2.imprimir();
        anime3.imprimir();
    }

}

