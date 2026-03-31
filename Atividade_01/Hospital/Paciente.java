import java.util.ArrayList;
import java.util.List;

public class Paciente {
  private String nome;
  private List<Consulta> consultas = new ArrayList<>();

  public Paciente(String nome){
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void adicionarConsultas(Consulta consulta){
    consultas.add(consulta);
  }

  public List<Consulta> getConsultas() {
    return consultas;
  }

  public void setConsultas(List<Consulta> consultas) {
    this.consultas = consultas;
  }

}
