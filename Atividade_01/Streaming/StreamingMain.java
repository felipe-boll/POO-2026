import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamingMain {

  public static void main(String[] args) {
    Scanner tecladoSacScanner = new Scanner(System.in);

    System.out.print("Nome do usuário: ");
    Usuario usuario = new Usuario(tecladoSacScanner.nextLine());

    List<Filme> filmes = new ArrayList<>();

    int opcao;

    do{
      tecladoSacScanner.nextLine();
      System.out.println("\n==== STREAMING ====");
      System.out.println("1 - Criar perfil");
      System.out.println("2 - Cadastrar filme");
      System.out.println("3 - Assistir filme");
      System.out.println("4 - Ver perfis");
      System.out.println("5 - Ver filmes assistidos de um perfil");
      System.out.println("6 - Ver elenco de um filme");
      System.out.println("0 - Sair");
      opcao = Integer.parseInt(tecladoSacScanner.nextLine());

      switch (opcao) {
        case 1:
          System.out.print("Nome do perfil: ");
          usuario.adicionarPerfil(new Perfil(tecladoSacScanner.nextLine()));
          break;

        case 2:
          System.out.print("Título do Filme: ");
          String titulo = tecladoSacScanner.nextLine();

          System.out.print("Diretor do filme: ");
          Pessoa diretor = new Pessoa(tecladoSacScanner.nextLine());

          Filme filme = new Filme(titulo, diretor);

          System.out.print("Quantos atores tem? ");
          int qtd = Integer.parseInt(tecladoSacScanner.nextLine());

          for(int i = 0; i < qtd; i++){
            System.out.printf("Ator %d: ", i+1);
            filme.adicionarAtor(new Pessoa(tecladoSacScanner.nextLine()));
          }

          filmes.add(filme);
          break;

        case 3:
          if (usuario.getPerfils().isEmpty() || filmes.isEmpty()) {
            System.out.println("Cadastre perfil e filme primeiro!");
            break;
          }

          System.out.println("Escolha um perfil: ");
          for(int i = 0; i < usuario.getPerfils().size(); i++){
            System.out.printf("%d - %s\n", i, usuario.getPerfils().get(i).getNome());
          }
          int p = Integer.parseInt(tecladoSacScanner.nextLine());

          System.out.println("Escolha um filme: ");
          for(int i = 0; i < filmes.size(); i++){
            System.out.printf("%d - %s\n", i, filmes.get(i).getTitulo());
          }
          int f = Integer.parseInt(tecladoSacScanner.nextLine());

          usuario.getPerfils().get(p).assitir(filmes.get(f));
          break;
        
        case 4:
          usuario.getPerfils().forEach(perfil -> System.out.println(perfil.getNome()));
          break;
        
        case 5:
          System.out.println("Escolha um perfil: ");
          for(int i = 0; i < usuario.getPerfils().size(); i++){
            System.out.printf("%d - %s\n", i, usuario.getPerfils().get(i).getNome());
          }
          int index = Integer.parseInt(tecladoSacScanner.nextLine());
          usuario.getPerfils().get(index).getAssistidos().forEach(c -> System.out.println(c.getTitulo()));
          break;
        
        case 6:
          System.out.println("Escolha um filme: ");
          for(int i = 0; i < filmes.size(); i++){
            System.out.printf("%d - %s\n", filmes.get(i).getTitulo());
          }
          int idx = Integer.parseInt(tecladoSacScanner.nextLine());
          filmes.get(idx).getElenco().forEach(a -> System.out.println(a.getNome()));
          break;
      }
    } while(opcao != 0);

    tecladoSacScanner.close();
  }
}
