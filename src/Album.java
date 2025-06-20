import java.io.Serializable;

public class Album implements Serializable {
    private String nome;

    public Album(String n){
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
        return "Album{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
