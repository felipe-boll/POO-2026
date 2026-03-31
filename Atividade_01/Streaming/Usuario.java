import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private String nome;
  private List<Perfil> perfils = new ArrayList<>();

  public Usuario(String nome){
    this.nome = nome;
  }

  public void adicionarPerfil(Perfil perfil){
    perfils.add(perfil);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Perfil> getPerfils() {
    return perfils;
  }

  public void setPerfils(List<Perfil> perfils) {
    this.perfils = perfils;
  }
}
