public class Cavalo extends Peca implements Movimentavel {
  public Cavalo(String cor, Posicao posicao){
    super(cor, posicao);
  }

  @Override
  public void mover(Posicao origem, Posicao destino){
    int diferencaLinha = Math.abs(destino.getLinha() - origem.getLinha());
    int diferancaColuna = Math.abs(destino.getColuna() - origem.getColuna());

    if ((diferencaLinha == 2 && diferancaColuna == 1) || (diferencaLinha == 1 && diferancaColuna == 2)) {
      setPosicao(destino);
      System.out.println("Cavalo morreu em L");
    } else{
      System.out.println("Movimento inválido para o cavalo");
    }
  }
}
