public class IngressoP extends Ingresso implements Imprimivel{
    public IngressoP(int preco){
        super(preco);
    }

    @Override
    public void imprimirLocalizacao(){}
    public void imprimirTaxa(){}
    public void imprimirPreco(){
        System.out.printf("Preço: %d\n", preco);
    }
}
