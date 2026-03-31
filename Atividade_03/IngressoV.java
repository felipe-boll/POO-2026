public class IngressoV extends Ingresso implements Imprimivel {
    private int taxaVip;

    public IngressoV(int preco, int taxaVip){
        super(preco);
        this.taxaVip = taxaVip;
    }

    public int getTaxaVip(){
        return  taxaVip;
    }

    public void setTaxaVip(int taxaVip) {
        this.taxaVip = taxaVip;
    }

    @Override
    public  void imprimirLocalizacao(){}
    public void imprimirTaxa(){
        System.out.printf("Taxa Vip: %d\n", taxaVip);
    }

    public void imprimirPreco(){
        System.out.printf("Preco: %d\n", preco);
    }
}
