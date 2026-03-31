import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private String nome;
  private List<Pedido> pedidos = new ArrayList<>();

  public Cliente(String nome){
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Pedido> getPedidos() {
    return pedidos;
  }

  public void setPedidos(List<Pedido> pedidos) {
    this.pedidos = pedidos;
  }

  public void adicionarPedido(Pedido p){
    pedidos.add(p);
  }
}
