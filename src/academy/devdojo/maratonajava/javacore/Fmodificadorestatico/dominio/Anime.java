package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static{
        System.out.println("Dentro de todos");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }

    }

    public Anime(){
        for(int episodio : Anime.episodios){
            System.out.print(episodio + " ");
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }



    public void imprime(){
        System.out.println(nome);
    }

    public static int[] getEpisodios(){
        return episodios;
    }
}
