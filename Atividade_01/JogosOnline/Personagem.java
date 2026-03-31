public class Personagem {
  private String nome;
  private Inventario inventario = new Inventario();
  private Guilda guilda;

  public Personagem(String nome){
    this.nome = nome;
  }

  public void entrarGuilda(Guilda guilda){
    this.guilda = guilda;
    guilda.adicionarIntegrantes(this);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Inventario getInventario() {
    return inventario;
  }

  public void setInventario(Inventario inventario) {
    this.inventario = inventario;
  }
}
