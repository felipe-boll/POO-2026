import java.util.LinkedList;
import java.util.Scanner;

public class ALendaDeFlavius {
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = tecladoScanner.nextInt();

        for (int i = 1; i <= t; i++) {
            LinkedList<Integer> lista = new LinkedList<Integer>();
            int quantidade = tecladoScanner.nextInt();
            int salto = tecladoScanner.nextInt();

            Circulo pessoas = new Circulo(salto, lista, quantidade);
            pessoas.preencherCirculo(quantidade, lista);
            pessoas.suicidio(salto, pessoas);

            System.out.printf("Case %d: %d\n", i, pessoas.getCirculo().get(0));
        }
    }
}

class Circulo{
    private LinkedList<Integer> circulo;
    private int salto;
    private int quantidade;
    
    public Circulo(int salto, LinkedList<Integer> circulo, int quantidade){
        this.salto = salto;
        this.quantidade = quantidade;
        this.circulo = circulo;
    }

    public void suicidio(int salto, Circulo pessoas){
        int i = 0;
        LinkedList<Integer> lista = pessoas.getCirculo();

        while (lista.size() > 1) {
            i = (i + salto - 1) % lista.size();
            lista.remove(i);
        }
    }

    public LinkedList<Integer> preencherCirculo(int quantidade, LinkedList<Integer> lista){
        for(int i = 1; i <= quantidade; i++){
            lista.add(i);
        }
        return lista;
    }

    public int getSalto() {
        return salto;
    }

    public void setSalto(int salto) {
        this.salto = salto;
    }

    public LinkedList<Integer> getCirculo() {
        return circulo;
    }

    public void setCirculo(LinkedList<Integer> circulo) {
        this.circulo = circulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
