public class Produto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularPrecoComDesconto(){
        return preco;
    }
}