public class IngressoCI extends Ingresso implements Imprimivel{
    private  String localizacao;

    public IngressoCI(int preco, String localizacao){
        super(preco);
        this.localizacao = localizacao;
    }

    public String getLocalizacao(){
        return localizacao;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    @Override
    public void imprimirLocalizacao(){
        System.out.printf("Localização: %s", localizacao);
    }

    public void imprimirTaxa(){};
    public void imprimirPreco(){
        System.out.printf("Preço: %d", preco);
    }
}
