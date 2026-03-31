public class Corrida {
  private Motorista motorista;
  private Pagamento pagamento;
  private Passageiro passageiro;
  private String origem;
  private String destino;

  public Corrida(String origem, String destino, double valor, Motorista motorista, Passageiro passageiro){
    this.origem = origem;
    this.destino = destino;
    this.motorista = motorista;
    this.passageiro = passageiro;
    this.pagamento = new Pagamento(valor);

    motorista.adicionarCorrida(this);
    passageiro.adicionarCorrida(this);
  }

  public Motorista getMotorista() {
    return motorista;
  }

  public void setMotorista(Motorista motorista) {
    this.motorista = motorista;
  }

  public Pagamento getPagamento() {
    return pagamento;
  }

  public void setPagamento(Pagamento pagamento) {
    this.pagamento = pagamento;
  }

  public Passageiro getPassageiro() {
    return passageiro;
  }

  public void setPassageiro(Passageiro passageiro) {
    this.passageiro = passageiro;
  }

  public String getOrigem() {
    return origem;
  }

  public void setOrigem(String origem) {
    this.origem = origem;
  }

  public String getDestino() {
    return destino;
  }

  public void setDestino(String destino) {
    this.destino = destino;
  }
}
