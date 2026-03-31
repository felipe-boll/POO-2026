package FolhaDePagamento;

public class FuncionarioHorista extends Funcionario {
  private int horasTrabalhadas;
  private double valorPorHora;

  public FuncionarioHorista() {
  }

  public FuncionarioHorista(String nome, double salarioBase, int horasTrabalhadas, double valorPorHora) {
    super(nome, salarioBase);
    this.horasTrabalhadas = horasTrabalhadas;
    this.valorPorHora = valorPorHora;
  }

  public int getHorasTrabalhadas() {
    return horasTrabalhadas;
  }

  public void setHorasTrabalhadas(int horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
  }

  public double getValorPorHora() {
    return valorPorHora;
  }

  public void setValorPorHora(double valorPorHora) {
    this.valorPorHora = valorPorHora;
  }

  public double calcularSalario() {
    double salarioFinal = salarioBase + (horasTrabalhadas * valorPorHora);
    return salarioFinal;
  }
}
