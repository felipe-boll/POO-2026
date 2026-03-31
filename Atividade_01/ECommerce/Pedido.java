import java.util.ArrayList;
import java.util.List;

public class Pedido {
  private List<Produto> produtos = new ArrayList<>();
  private NotaFiscal notaFiscal;

  public Pedido(String numeroNota){
    this.notaFiscal = new NotaFiscal(numeroNota);
  }

  public List<Produto> getProdutos() {
    return produtos;
  }

  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

  public NotaFiscal getNotaFiscal() {
    return notaFiscal;
  }

  public void setNotaFiscal(NotaFiscal notaFiscal) {
    this.notaFiscal = notaFiscal;
  }

  public void adicionarProduto(Produto p){
    produtos.add(p);
  }
}
