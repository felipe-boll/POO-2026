import java.util.Scanner;

public class ECommerceMain {

  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void main(String[] args) {
    Fornecedor fornecedor = new Fornecedor("Tech Distribuidora");

    Produto p1 = new Produto("Notebook", fornecedor);
    Produto p2 = new Produto("Mouse Gamer", fornecedor);

    Cliente cliente = new Cliente("Ana");

    Pedido pedido = new Pedido("NF123");
    pedido.adicionarProduto(p1);
    pedido.adicionarProduto(p2);

    cliente.adicionarPedido(pedido);

    int opcao;

    do {
      tecladoScanner.nextLine();
      System.out.println("\n==== SISTEMA E-COMMERCE ====");
      System.out.println("1 - Ver pedidos do cliente");
      System.out.println("2 - Ver produtos do pedido");
      System.out.println("3 - Ver fornecedor de um produto");
      System.out.println("0 - Sair");
      System.out.print("Escolha: ");
      opcao = tecladoScanner.nextInt();

      switch (opcao) {
        case 1:
          for (Pedido ped : cliente.getPedidos()) {
            System.out.printf("Nota Fiscal: %d\n", ped.getNotaFiscal().getNumero());
          }
          break;

        case 2:
          for (Produto prod : pedido.getProdutos()) {
            System.out.printf("Produto: %s\n", prod.getNome());
          }
          break;

        case 3:
          System.out.printf("Fornecedor do Notebook: %s\n", p1.getFornecedor().getNome());
          break;

        case 0:
          break;

        default:
          System.out.println("Opção inválida!");
      }

    } while (opcao != 0);
  }
}

