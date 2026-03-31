public abstract  class Ingresso {
    protected  int preco;

    public Ingresso(int preco){
        this.preco = preco;
    }

    public int getPreco(){
        return preco;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }
}
