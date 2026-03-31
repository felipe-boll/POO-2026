public class Cantor extends Artista {
    private Banda banda;

    public Cantor(String nome) {
        super(nome);
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

}
