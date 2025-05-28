import java.util.ArrayList;

public class Playlist {
    private String nome;
    private ArrayList<Musica> musicas;

    public Playlist(String n){
        this.nome = n;
        this.musicas = new ArrayList<>();
    }
    public void adicionarMusica(Musica musica){
        if (musicas.stream().anyMatch(m -> m.getTitulo().equalsIgnoreCase(musica.getTitulo()))) {
            System.out.println("A música '" + musica.getTitulo() + "' Já está na playlist.");
        } else {
            musicas.add(musica);
            System.out.println("Música adicionada à playlist: " + musica.getTitulo());
        }
        //musicas.add(musica);
        //System.out.println("Musica adicionada à playlist: " + musica.getTitulo());
    }
    public void removerMusica(String titulo){
        boolean removido = musicas.removeIf(musica -> musica.getTitulo().equalsIgnoreCase(titulo));
        if(removido){
            System.out.println("Musica Removida da Playlist " + titulo);
        } else {
            System.out.println("Musica não encontrada na playlist.");
        }
    }
    public void exibirPlaylist(){
        System.out.println("Playlist: " + nome);
        for (Musica musica : musicas){
            musica.informacoes();
        }
    }
}
