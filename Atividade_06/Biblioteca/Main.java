public class Main {
  public static void main(String[] args) {
    Biblioteca b1 = new Biblioteca("Biblioteca IF", "Rua das Pombas");

    Livro l1 = new Livro("Quarto de Despejo", "Edição comemorativa(1960-2020)", 2020, "Editora Ática");
    l1.addAutor("Carolina Maria de Jesus");
    Livro l2 = new Livro("A Segunda Pátria", "", 2015, "Intrinseca");
    l2.addAutor("Miguel Sanches Neto");

    b1.addLivro(l1);
    b1.addLivro(l2);

    Estudante e1 = new Estudante("Brayan", "27/08/2009", 1, "Informática", 2024);
    Professor p1 = new Professor("Roberta", "00/00/00", "Docente");

    Emprestimo emp1 = new Emprestimo(l1, e1, "27/03/2026", "03/04/2026");
    Emprestimo emp2 = new Emprestimo(l2, p1, "27/03/2026", "03/04/2026");

    b1.addEmprestimo(emp1);
    b1.addEmprestimo(emp2);

    System.out.printf("----LISTA EMPRÉSTIMOS----\n");
    int cont = 1;
    for (Emprestimo emp : b1.getListaEmprestimos()) {
      System.out.printf("%d. Livro: %s | Pessoa: %s | Data Emp.: %s | Data Dev.: %s\n", cont,
          emp.getLivro().getTitulo(), emp.getPessoa().getNome(), emp.getDataEmprestimo(), emp.getDataDevolucao());
    }
  }
}
