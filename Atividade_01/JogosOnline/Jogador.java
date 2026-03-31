import java.util.ArrayList;
import java.util.List;

public class Jogador {
  private String nome;
  private List<Personagem> personagems = new ArrayList<>();

  public Jogador(String nome){
    this.nome = nome;
  }

  public void adicionarPersonagem(Personagem p){
    personagems.add(p);
  }

  public String getNome() {
    // TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getNome'");
  }

  public Personagem[] getPersonagems(){
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPersonagens'");
  }
}
