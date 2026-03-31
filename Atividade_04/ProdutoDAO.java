import java.util.List;

public interface ProdutoDAO {
  void inserir(Produto produto);
  List<Produto> listar();
  Object buscarPorId(int id);
  void remover(int id);
}
