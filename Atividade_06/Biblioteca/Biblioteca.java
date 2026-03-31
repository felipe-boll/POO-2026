import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
  private String nomeBiblioteca;
  private String endereco;
  private List<Livro> listaLivros;
  private List<Emprestimo> listaEmprestimos;
  
  public Biblioteca(String nomeBiblioteca, String endereco) {
    this.nomeBiblioteca = nomeBiblioteca;
    this.endereco = endereco;
    this.listaLivros = new ArrayList<>();
    this.listaEmprestimos = new ArrayList<>();
  }

  public Biblioteca() {
  }

  public void addLivro(Livro l){
    this.listaLivros.add(l);
  }

  public void addEmprestimo(Emprestimo emp){
    this.listaEmprestimos.add(emp);
  }

  public String getNomeBiblioteca() {
    return nomeBiblioteca;
  }

  public void setNomeBiblioteca(String nomeBiblioteca) {
    this.nomeBiblioteca = nomeBiblioteca;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public List<Livro> getListaLivros() {
    return listaLivros;
  }

  public void setListaLivros(List<Livro> listaLivros) {
    this.listaLivros = listaLivros;
  }

  public List<Emprestimo> getListaEmprestimos() {
    return listaEmprestimos;
  }

  public void setListaEmprestimos(List<Emprestimo> listaEmprestimos) {
    this.listaEmprestimos = listaEmprestimos;
  }
}
