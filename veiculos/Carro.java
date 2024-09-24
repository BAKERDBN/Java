class Carro extends Veiculo {
    
    private int numeroDePortas;

    public Carro(String marcaVeiculo, String modeloVeiculo, int numeroDePortas ,int anoVeiculo) {
        super(marcaVeiculo, modeloVeiculo, anoVeiculo);
        setNumeroDePortas(numeroDePortas);
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + numeroDePortas);
    }
}