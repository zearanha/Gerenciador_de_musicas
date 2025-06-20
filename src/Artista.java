import java.io.Serializable;

public class Artista implements Serializable {
    private String nome;

    public Artista(String n){
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Artista{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
