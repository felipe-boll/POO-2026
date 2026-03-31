import java.util.LinkedList;
import java.util.List;

public class Musica {
    private String nome;
    private String duracao;
    private String letra;
    private List<Instrumento> instrumentos = new LinkedList<>();
    private List<Banda> bandas = new LinkedList<>();
    private List<Estilo> estilos = new LinkedList<>();
    private List<Usuario> usuarios = new LinkedList<>();

    public Musica(String nome, String duracao, String letra) {
        this.nome = nome;
        this.duracao = duracao;
        this.letra = letra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(List<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }

    public List<Banda> getBandas() {
        return bandas;
    }

    public void setBandas(List<Banda> bandas) {
        this.bandas = bandas;
    }

    public List<Estilo> getEstilos() {
        return estilos;
    }

    public void setEstilos(List<Estilo> estilos) {
        this.estilos = estilos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
