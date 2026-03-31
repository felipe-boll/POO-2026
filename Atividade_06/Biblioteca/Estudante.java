public class Estudante extends Pessoa {
  private int numMatricula;
  private String curso;
  private int anoIngresso;

  public Estudante() {
  }

  public Estudante(String nome, String dataNasc, int numMatricula, String curso, int anoIngresso) {
    super(nome, dataNasc);
    this.numMatricula = numMatricula;
    this.curso = curso;
    this.anoIngresso = anoIngresso;
  }

  public int getNumMatricula() {
    return numMatricula;
  }

  public void setNumMatricula(int numMatricula) {
    this.numMatricula = numMatricula;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public int getAnoIngresso() {
    return anoIngresso;
  }

  public void setAnoIngresso(int anoIngresso) {
    this.anoIngresso = anoIngresso;
  }
}
