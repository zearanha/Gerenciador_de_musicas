public class Musica {
    private String titulo;
    private Artista artista;
    private Album album;
    private String genero;
    private int anoLancamento;
    private double duracao;

    public Musica(String titulo, Artista artista, Album album, String genero, int anoLancamento, double duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancameto) {
        this.anoLancamento = anoLancameto;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }


    public void informacoes(){
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Artista: " + this.getArtista().getNome());
        System.out.println("Álbum: " + this.getAlbum().getNome());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Ano de Lancamento: " + this.getAnoLancamento());
        System.out.println("Duração: " + this.getDuracao() + "minutos");
    }
}


