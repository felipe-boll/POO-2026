package FolhaDePagamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Funcionario> funcionarios = new ArrayList<>();
    Funcionario f1 = new Funcionario("Jeremias", 1500);
    FuncionarioHorista f2 = new FuncionarioHorista("Cléber", 1300, 20, 50);
    FuncionarioComissioado f3 = new FuncionarioComissioado("Bianca", 2500, 60, 20);
    FuncionarioBonificado f4 = new FuncionarioBonificado("Flávia", 1500, 50, 10, 500);

    funcionarios.add(f1);
    funcionarios.add(f2);
    funcionarios.add(f3);
    funcionarios.add(f4);

    FolhaDePagamento pagamentos = new FolhaDePagamento();
    pagamentos.processarPagamento(funcionarios);

  }
}
