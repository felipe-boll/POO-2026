public class Sopro extends Instrumento {
  private String tipoBocal;

  public Sopro(String nome, String descricao, String tipoBocal){
    super(nome, descricao);
    this.tipoBocal = tipoBocal;
  }

  public String getTipoBocal() {
    return tipoBocal;
  }

  public void setTipoBocal(String tipoBocal) {
    this.tipoBocal = tipoBocal;
  }
}
