public class Professor extends Pessoa {
  private String departamento;

  public Professor() {
  }

  public Professor(String nome, String dataNasc, String departamento) {
    super(nome, dataNasc);
    this.departamento = departamento;
  }

  public Professor(String departamento) {
    this.departamento = departamento;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }
}
