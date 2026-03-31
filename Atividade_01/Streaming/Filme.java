import java.util.ArrayList;
import java.util.List;

public class Filme extends Conteudo {
  private Pessoa diretor;
  private List<Pessoa> elenco = new ArrayList<>();
  
  public Filme(String titulo, Pessoa diretor){
    super(titulo);
    this.diretor = diretor;
  }

  public Pessoa getDiretor() {
    return diretor;
  }

  public List<Pessoa> getElenco() {
    return elenco;
  }

  public void setDiretor(Pessoa diretor) {
    this.diretor = diretor;
  }

  public void setElenco(List<Pessoa> elenco) {
    this.elenco = elenco;
  }

  public void adicionarAtor(Pessoa ator){
    elenco.add(ator);
  }

}
