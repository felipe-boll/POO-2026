import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalMain {
  public static Scanner tecladoScanner = new Scanner(System.in);

  public static void main(String[] args) {
    List<Medico> medicos = new ArrayList<>();
    List<Paciente> pacientes = new ArrayList<>();

    int opcao;

    do {
      System.out.println("\n==== HOSPITAL ====");
      System.out.println("1 - Cadastrar médico");
      System.out.println("2 - Cadastrar paciente");
      System.out.println("3 - Registrar consulta");
      System.out.println("4 - Listar consultas de paciente");
      System.out.println("0 - Sair");
      opcao = Integer.parseInt(tecladoScanner.nextLine());

      switch (opcao) {

        case 1:
          System.out.print("Nome: ");
          String nome = tecladoScanner.nextLine();
          System.out.print("Especialidade: ");
          String esp = tecladoScanner.nextLine();
          medicos.add(new Medico(nome, esp));
          break;

        case 2:
          System.out.print("Nome: ");
          pacientes.add(new Paciente(tecladoScanner.nextLine()));
          break;

        case 3:
          if (medicos.isEmpty() || pacientes.isEmpty()) {
            System.out.println("Cadastre médico e paciente primeiro!");
            break;
          }

          System.out.println("Escolha paciente:");
          for (int i = 0; i < pacientes.size(); i++)
            System.out.printf("%d - %s\n", i, pacientes.get(i).getNome());

            int p = Integer.parseInt(tecladoScanner.nextLine());

            System.out.println("Escolha médico:");
            for (int i = 0; i < medicos.size(); i++)
              System.out.printf("%d - %s\n", i, medicos.get(i).getNome());

              int m = Integer.parseInt(tecladoScanner.nextLine());

              System.out.print("Descrição do prontuário: ");
              String desc = tecladoScanner.nextLine();

              Consulta consulta = new Consulta(medicos.get(m), pacientes.get(p), desc);

              pacientes.get(p).adicionarConsultas(consulta);
              break;

          case 4:
            System.out.println("Escolha paciente:");
            for (int i = 0; i < pacientes.size(); i++)
              System.out.printf("%d - %s\n", i, pacientes.get(i).getNome());

              int idx = Integer.parseInt(tecladoScanner.nextLine());

              pacientes.get(idx).getConsultas().forEach(c -> {
              System.out.printf("Médico: %s\n", c.getMedico().getNome());
              System.out.printf("Prontuário: %s\n", c.getProntuario().getDescricao());
              System.out.println("----");
              });
              break;
      }

    } while (opcao != 0);
  }
}
