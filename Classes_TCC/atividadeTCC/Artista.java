import java.util.ArrayList;
import java.util.List;

public class Artista {
  private String nome;
  private List<Musica> musicas = new ArrayList<>();

  public Artista(String nome){
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Musica> getMusicas() {
    return musicas;
  }

  public void setMusicas(List<Musica> musicas) {
    this.musicas = musicas;
  }
}
