public class Bispo extends Peca implements Movimentavel {
  public Bispo(String cor, Posicao posicao){
    super(cor, posicao);
  }

  @Override
  public void mover(Posicao origem, Posicao destino){
    int diferencaLinha = Math.abs(destino.getLinha() - origem.getLinha());
    int diferancaColuna = Math.abs(destino.getColuna() - origem.getColuna());

    if (diferencaLinha == diferancaColuna) {
      setPosicao(destino);
      System.out.println("Bispo moveu na diagonal");
    } else{
      System.out.println("Movimento inválido para o Bispo");
    }
  }
}
