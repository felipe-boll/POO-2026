public class Item {
  private String nome;
  private boolean equipavel;
  private boolean equipado;

  public Item(String nome, boolean equipavel){
    this.nome = nome;
    this.equipavel = equipavel;
  }

  public void equipar(){
    if (equipavel) {
      equipado = true;
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public boolean isEquipado() {
    return equipado;
  }
  
  public void setEquipado(boolean equipado) {
    this.equipado = equipado;
  }
}
