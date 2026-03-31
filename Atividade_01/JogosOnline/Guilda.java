import java.util.ArrayList;
import java.util.List;

public class Guilda {
  private String nome;
  private List<Personagem> integrantes = new ArrayList<>();

  public Guilda(String nome){
    this.nome = nome;
  }

  public void adicionarIntegrantes(Personagem personagem){
    integrantes.add(personagem);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Personagem> getIntegrantes() {
    return integrantes;
  }

  public void setIntegrantes(List<Personagem> integrantes) {
    this.integrantes = integrantes;
  }
}
