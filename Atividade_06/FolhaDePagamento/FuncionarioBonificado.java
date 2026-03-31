public class FuncionarioBonificado extends FuncionarioComissionado {
  private double bonus;

  public FuncionarioBonificado() {
  }

  public FuncionarioBonificado(String nome, double salarioBase, double vendasMensais, double percentualComissao,
      double bonus) {
    super();
    this.bonus = bonus;
  }

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  public double calcularSalario() {
    double salarioFinal = salarioBase + bonus;
    return salarioFinal;
  }
}
