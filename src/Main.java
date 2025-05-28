public class Main {
    public static void main(String[] args) {
        Artista artista1 = new Artista("Queen");
        Artista artista2 = new Artista("The Beatles");

        Album album1 = new Album("A Night at the Opera");
        Album album2 = new Album("Abbey Road");

        Musica musica1 = new Musica("Bohemian Rhapsody", artista1, album1, "Rock", 1975, 5.55);
        Musica musica2 = new Musica("Here Comes The Sun", artista2, album2, "Rock", 1969, 3.05);
        Musica musica3 = new Musica("Let It Be", artista2, new Album("Let It Be"), "Rock", 1970, 4.03);

        Playlist minhaPlaylist = new Playlist("Clássicos do Rock");

        minhaPlaylist.adicionarMusica(musica1);
        minhaPlaylist.adicionarMusica(musica2);
        minhaPlaylist.adicionarMusica(musica3);

        minhaPlaylist.adicionarMusica(musica1);

        minhaPlaylist.exibirPlaylist();

        minhaPlaylist.removerMusica("Here Comes The Sun");

        minhaPlaylist.exibirPlaylist();
    }
}