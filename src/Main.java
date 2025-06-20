public class Main {
    public static void main(String[] args) {
        PlaylistManager manager = new PlaylistManager();
        manager.listarPlaylistsSalvas();

        Artista queen = new Artista("Queen");
        Artista beatles = new Artista("The Beatles");

        Musica m1 = new Musica("Bohemian Rhapsody", queen, new Album("A Night at the Opera"), "Rock", 1975, 5.55);
        Musica m2 = new Musica("Here Comes The Sun", beatles, new Album("Abbey Road"), "Rock", 1969, 3.05);
        Musica m3 = new Musica("Let It Be", beatles, new Album("Let It Be"), "Rock", 1970, 4.03);

        Playlist rock = new Playlist("Classicos do Rock");
        rock.adicionarMusica(m1);
        rock.adicionarMusica(m2);
        rock.adicionarMusica(m3);

        rock.ordenarPorArtista();
        rock.exibirPlaylist();

        manager.salvarPlaylist(rock);
    }
}