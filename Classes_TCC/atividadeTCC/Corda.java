public class Corda extends Instrumento{
  private int numeroDeCordas;
  private String metodoExecucao;

  public Corda(int numeroDeCordas, String metodoExecucao, String nome, String descricao){
    super(nome, descricao);
    this.numeroDeCordas = numeroDeCordas;
    this.metodoExecucao = metodoExecucao;
  }

  public int getNumeroDeCordas() {
    return numeroDeCordas;
  }

  public void setNumeroDeCordas(int numeroDeCordas) {
    this.numeroDeCordas = numeroDeCordas;
  }

  public String getMetodoExecucao() {
    return metodoExecucao;
  }

  public void setMetodoExecucao(String metodoExecucao) {
    this.metodoExecucao = metodoExecucao;
  }
}
