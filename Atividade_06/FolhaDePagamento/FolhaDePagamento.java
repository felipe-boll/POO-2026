package FolhaDePagamento;

import java.util.List;

public class FolhaDePagamento {
  public void processarPagamento(List<Funcionario> Funcionarios) {
    System.out.print("Folha de Pagamento:\n\n");
    int cont = 1;
    for (Funcionario funcionario : Funcionarios) {
      System.out.printf("%d. Nome: %s | Salário: %.2f\n", cont, funcionario.getNome(), funcionario.calcularSalario());
    }
  }
}
