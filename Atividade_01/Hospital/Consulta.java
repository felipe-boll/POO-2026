public class Consulta {
  private Medico medico;
  private Prontuario prontuario;
  private Paciente paciente;

  public Consulta(Medico medico, Paciente paciente, String descricao){
    this.medico = medico;
    this.paciente = paciente;
    this.prontuario = new Prontuario(descricao);
  }

  public Medico getMedico() {
    return medico;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  public Prontuario getProntuario() {
    return prontuario;
  }

  public void setProntuario(Prontuario prontuario) {
    this.prontuario = prontuario;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }
}
