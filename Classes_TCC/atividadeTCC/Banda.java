import java.util.*;

public class Banda extends Artista {
    private List<Cantor> cantores = new ArrayList<>();

    public Banda(String nome) {
        super(nome);
    }

    public List<Cantor> getCantores() {
        return cantores;
    }

    public void setCantores(List<Cantor> cantores) {
        this.cantores = cantores;
    }
}
