import java.util.ArrayList;
import java.util.List;

public class Passageiro {
  private String nome;
  private List<Corrida> corridas = new ArrayList<>();

  public Passageiro(String nome){
    this.nome = nome;
  }

  public void adicionarCorrida(Corrida corrida){
    corridas.add(corrida);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Corrida> getCorridas() {
    return corridas;
  }

  public void setCorridas(List<Corrida> corridas) {
    this.corridas = corridas;
  }
}
