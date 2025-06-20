import java.io.Serializable;
import java.util.*;

public class Playlist implements Serializable {
    private final String nome;
    private final List<Musica> musicas;

    public Playlist(String nome){
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Musica> getMusicas() { return musicas; }

    public void adicionarMusica(Musica musica){
        if (musicas.stream().anyMatch(m -> m.getTitulo().equalsIgnoreCase(musica.getTitulo()))) {
            System.out.println("A música '" + musica.getTitulo() + "' já está na playlist.");
        } else {
            musicas.add(musica);
            System.out.println("Música adicionada à playlist: " + musica.getTitulo());
        }
    }

    public void removerMusica(String titulo){
        boolean removido = musicas.removeIf(musica -> musica.getTitulo().equalsIgnoreCase(titulo));
        if(removido){
            System.out.println("Música removida da playlist: " + titulo);
        } else {
            System.out.println("Música não encontrada na playlist.");
        }
    }

    public void exibirPlaylist(){
        System.out.println("\nPlaylist: " + nome);
        for (Musica musica : musicas){
            musica.informacoes();
        }
    }

    public void ordenarPorTitulo(){
        musicas.sort(Comparator.naturalOrder());
    }

    public void ordenarPorArtista(){
        musicas.sort(Comparator.comparing(m -> m.getArtista().getNome()));
    }

    public void ordenarPorDuracao(){
        musicas.sort(Comparator.comparingDouble(Musica::getDuracao));
    }
}
