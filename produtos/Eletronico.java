class Eletronico extends Produto{
    private int garantia;

    public Eletronico(String nome, double preco, int garantia){
        super(nome, preco);
        setGarantia(garantia);
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public double calcularPrecoComDesconto(){
        return getPreco() * 0.9;
    }
}