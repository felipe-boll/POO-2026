
public class IngressoCV extends Ingresso implements Imprimivel {
    private String localizacao;
    private int taxaVip;

    public IngressoCV(int preco, String localizacao, int taxaVip){
        super(preco);
        this.localizacao = localizacao;
        this.taxaVip = taxaVip;
    }

    public String getLocalizacao(){
        return localizacao;
    }

    public int getTaxaVip() {
        return taxaVip;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setTaxaVip(int taxaVip) {
        this.taxaVip = taxaVip;
    }

    @Override
    public void imprimirLocalizacao(){
        System.out.printf("Localização: %s\n", localizacao);
    }

    public void imprimirTaxa(){
        System.out.printf("Taxa VIP: %d\n", taxaVip);
    }

    public void imprimirPreco(){
        System.out.printf("Preço: %d\n", preco);
    }
}
