package academy.devdojo.maratonajava.javacore.Eblocosdeinicializaca.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        System.out.println("Dentro de todos");
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(nome);
    }

    public int[] getEpisodios(){
        return episodios;
    }
}
