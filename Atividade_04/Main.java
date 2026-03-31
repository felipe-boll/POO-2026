public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto(1, "Perfume do Cebolinha", 25.30);
        Produto prod2 = new Produto(2, "Heaven", 189.00);
        Produto prod3 = new Produto(3, "Clash", 119.90);

        ProdutoDAOLista produtos = new ProdutoDAOLista();
        produtos.inserir(prod1);
        produtos.inserir(prod2);
        produtos.inserir(prod3);

        for (Produto p : produtos.listar()) {
            System.out.printf("[%d] Nome: %s | Preço: %.2f\n", p.getId(), p.getNome(), p.getPreco());
        }

        int idDesejado = 3;
        for (Produto p : produtos.listar()) {
            if (p.getId() == idDesejado) {
                System.out.printf("[%d] Nome: %s | Preço: %.2f\n", p.getId(), p.getNome(), p.getPreco());
                idDesejado = 0;
                break;
            }
        }

        if (idDesejado != 0) {
            System.out.println("Produto não encontrado");
        }

        produtos.remover(1);
    }
}
