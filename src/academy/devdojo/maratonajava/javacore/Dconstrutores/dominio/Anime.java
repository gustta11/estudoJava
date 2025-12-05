package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private int idade;

   public Anime(String nome, String tipo, int episodios){
       this.nome = nome;
       this.tipo = tipo;
       this.episodios = episodios;
   }

   public Anime(String nome, String tipo, int episodios, String genero){
       this(nome,tipo, episodios);
       this.genero = genero;
   }

    public Anime(String nome, String tipo, int episodios, String genero, int idade){
        this(nome,tipo, episodios,genero);
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println(nome);
        System.out.println(tipo);
        System.out.println(episodios);
        System.out.println(genero);
    }

    public int getEpisodios(){
        return episodios;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
