import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrocaDeCartas {
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int x = tecladoScanner.nextInt();
            int y = tecladoScanner.nextInt();
            int trocas = 0;

            if (x == 0 && y ==0) {
                break;
            }

            Colecionador a = new Colecionador();
            Colecionador b = new Colecionador();

            for (int i = 0; i < x; i++) {
                int k = tecladoScanner.nextInt();
                a.addCartas(new Carta(k));
            }

            for (int i = 0; i < y; i++) {
                int k = tecladoScanner.nextInt();
                b.addCartas(new Carta(k));
            }

            for (int i = 0; i < Math.min(x, y); i++) {
                if (a.getCartas().get(i).equals(b.getCartas().get(i))) {
                    trocas++;
                }
            }

            System.out.println(trocas);
        }
    }
}

class Carta {
    private int numero;

    public Carta(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

class Colecionador{
    private List<Carta> cartas;

    public Colecionador(){
        this.cartas = new ArrayList<>();
    }

    public void addCartas(Carta c){
        cartas.add(c);
    }

    public void contemCarta(){

    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }


}