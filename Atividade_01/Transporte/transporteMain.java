import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class transporteMain {
  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void main(String[] args) {
    List<Motorista> motoristas = new ArrayList<>();
    List<Passageiro> passageiros = new ArrayList<>();
    List<Corrida> corridas = new ArrayList<>();

    int opcao;
    do {
      tecladoScanner.nextLine();
      System.out.println("\n==== TRANSPORTE ====");
      System.out.println("1 - Cadastrar motorista");
      System.out.println("2 - Cadastrar passageiro");
      System.out.println("3 - Solicitar corrida");
      System.out.println("4 - Listar corridas do motorista");
      System.out.println("5 - Listar corridas do passageiro");
      System.out.println("6 - Mostrar pagamento de uma corrida");
      System.out.println("0 - Sair");
      opcao = Integer.parseInt(tecladoScanner.nextLine());

      switch (opcao) {

        case 1:
          System.out.print("Nome do motorista: ");
          motoristas.add(new Motorista(tecladoScanner.nextLine()));
          break;

        case 2:
          System.out.print("Nome do passageiro: ");
          passageiros.add(new Passageiro(tecladoScanner.nextLine()));
          break;

        case 3:
          if (motoristas.isEmpty() || passageiros.isEmpty()) {
            System.out.println("Cadastre motorista e passageiro primeiro!");
            break;
          }
          System.out.println("Escolha passageiro:");
          for (int i = 0; i < passageiros.size(); i++)
            System.out.println(i + " - " + passageiros.get(i).getNome());
            int p = Integer.parseInt(tecladoScanner.nextLine());

            System.out.println("Escolha motorista:");
            for (int i = 0; i < motoristas.size(); i++)
              System.out.printf("%d - %s\n", i, motoristas.get(i).getNome());
              int m = Integer.parseInt(tecladoScanner.nextLine());

              System.out.print("Origem: ");
              String origem = tecladoScanner.nextLine();
              System.out.print("Destino: ");
              String destino = tecladoScanner.nextLine();
              System.out.print("Valor: ");
              double valor = Double.parseDouble(tecladoScanner.nextLine());

              Corrida corrida = new Corrida(origem, destino, valor, motoristas.get(m), passageiros.get(p));
              corridas.add(corrida);
              break;

        case 4:
          System.out.println("Escolha motorista:");
          for (int i = 0; i < motoristas.size(); i++)
            System.out.println(i + " - " + motoristas.get(i).getNome());
            int mi = Integer.parseInt(tecladoScanner.nextLine());
            motoristas.get(mi).getCorridas()
            .forEach(c -> System.out.println(c.getOrigem() + " -> " + c.getDestino()));
            break;

        case 5:
          System.out.println("Escolha passageiro:");
          for (int i = 0; i < passageiros.size(); i++)
            System.out.println(i + " - " + passageiros.get(i).getNome());
            int pi = Integer.parseInt(tecladoScanner.nextLine());
            passageiros.get(pi).getCorridas()
            .forEach(c -> System.out.println(c.getOrigem() + " -> " + c.getDestino()));
          break;

          case 6:
            if (corridas.isEmpty()) {
              System.out.println("Nenhuma corrida registrada!");
              break;
            }
            System.out.println("Escolha corrida:");
            for (int i = 0; i < corridas.size(); i++)
              System.out.println(i + " - " + corridas.get(i).getOrigem() + " -> " + corridas.get(i).getDestino());
              int ci = Integer.parseInt(tecladoScanner.nextLine());
              System.out.println("Pagamento: R$ " + corridas.get(ci).getPagamento().getValor());
              break;
      }

    } while (opcao != 0);
  }
}

