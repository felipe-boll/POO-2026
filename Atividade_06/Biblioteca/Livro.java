import java.util.ArrayList;
import java.util.List;

public class Livro {
  private String titulo;
  private String edicao;
  private int ano;
  private String editora;
  private List<String> listaAutores;

  public Livro(String titulo, String edicao, int ano, String editora) {
    this.titulo = titulo;
    this.edicao = edicao;
    this.ano = ano;
    this.editora = editora;
    this.listaAutores = new ArrayList<>();
  }

  public Livro() {
  }

  public void addAutor(String a) {
    this.listaAutores.add(a);
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getEdicao() {
    return edicao;
  }

  public void setEdicao(String edicao) {
    this.edicao = edicao;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public String getEditora() {
    return editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public List<String> getListaAutores() {
    return listaAutores;
  }

  public void setListaAutores(List<String> listaAutores) {
    this.listaAutores = listaAutores;
  }
}
