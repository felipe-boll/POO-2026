package FolhaDePagamento;

public class FuncionarioComissionado extends Funcionario {
  private double vendasMensais;
  private double percentualComissao;

  public FuncionarioComissioado() {
  }

  public FuncionarioComissioado(String nome, double salarioBase, double vendasMensais, double percentualComissao) {
        super(nome, salarioBase);
        this.vendasMensais = vendasMensais;
        this.percentualComissao = percentualComissao;
    }

  public double getVendasMensais() {
    return vendasMensais;
  }

  public void setVendasMensais(double vendasMensais) {
    this.vendasMensais = vendasMensais;
  }

  public double getPercentualComissao() {
    return percentualComissao;
  }

  public void setPercentualComissao(double percentualComissao) {
    this.percentualComissao = percentualComissao;
  }

  public double calcularSalario() {
    double salarioFinal = salarioBase + (vendasMensais * (percentualComissao / 100));
    return salarioFinal;
  }
}
