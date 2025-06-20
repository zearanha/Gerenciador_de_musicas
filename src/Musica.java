import java.io.Serializable;

public class Musica implements Serializable, Comparable<Musica> {
    private final String titulo;
    private final Artista artista;
    private final Album album;
    private final String genero;
    private final int anoLancamento;
    private double duracao;

    public Musica(String titulo, Artista artista, Album album, String genero, int anoLancamento, double duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public Musica(Album album, int anoLancamento, Artista artista, double duracao, String genero, String titulo) {
        this.album = album;
        this.anoLancamento = anoLancamento;
        this.artista = artista;
        this.duracao = duracao;
        this.genero = genero;
        this.titulo = titulo;
    }

    public Musica(Album album, int anoLancamento, Artista artista, String genero, String titulo) {
        this.album = album;
        this.anoLancamento = anoLancamento;
        this.artista = artista;
        this.genero = genero;
        this.titulo = titulo;
    }

    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }
    public Album getAlbum() { return album; }
    public String getGenero() { return genero; }
    public int getAnoLancamento() { return anoLancamento; }
    public double getDuracao() { return duracao; }

    public void informacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista.getNome());
        System.out.println("Álbum: " + album.getNome());
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracao + " minutos\n");
    }

    @Override
    public int compareTo(Musica outra) {
        return this.titulo.compareToIgnoreCase(outra.titulo);
    }
}
