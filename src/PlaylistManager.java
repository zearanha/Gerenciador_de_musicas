import java.io.*;
import java.util.*;

public class PlaylistManager {
    private static final String DIRETORIO = "playlists";
    private final Map<String, Playlist> playlists = new HashMap<>();

    public PlaylistManager(){
        carregarPlaylistsSalvas();
    }

    public void salvarPlaylist(Playlist playlist) {
        try {
            File dir = new File(DIRETORIO);
            if (!dir.exists()) dir.mkdir();
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DIRETORIO + "/" + playlist.getNome() + ".dat"))) {
                oos.writeObject(playlist);
            }
            playlists.put(playlist.getNome(), playlist);
            System.out.println("Playlist salva com sucesso: " + playlist.getNome());
        } catch (IOException e) {
            System.err.println("Erro ao salvar playlist: " + e.getMessage());
        }
    }

    public final void carregarPlaylistsSalvas() {
        File dir = new File(DIRETORIO);
        if (!dir.exists()) return;
        File[] arquivos = dir.listFiles((d, name) -> name.endsWith(".dat"));
        if (arquivos == null) return;

        for (File arq : arquivos) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arq))) {
                Playlist p = (Playlist) ois.readObject();
                playlists.put(p.getNome(), p);
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Erro ao carregar " + arq.getName() + ": " + e.getMessage());
            }
        }
    }

    public void listarPlaylistsSalvas() {
        System.out.println("\nPlaylists salvas:");
        playlists.keySet().forEach(nome -> System.out.println("- " + nome));
    }

    public Playlist getPlaylist(String nome) {
        return playlists.get(nome);
    }
}

