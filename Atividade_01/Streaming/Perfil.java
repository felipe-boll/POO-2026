import java.util.ArrayList;
import java.util.List;

public class Perfil {
  private String nome;
  private List<Conteudo> assistidos = new ArrayList<>();

  public Perfil(String nome){
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void assitir(Conteudo conteudo){
    assistidos.add(conteudo);
  }

  public List<Conteudo> getAssistidos() {
    return assistidos;
  }

  public void setAssistidos(List<Conteudo> assistidos) {
    this.assistidos = assistidos;
  }

}
