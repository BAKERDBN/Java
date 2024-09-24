public class Veiculo {

    private String marcaVeiculo;
    private String modeloVeiculo;
    private int anoVeiculo;

    public Veiculo(String marcaVeiculo, String modeloVeiculo, int anoVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        setAnoVeiculo(anoVeiculo);
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public int getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(int anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }
    
    public void exibirDetalhes() {
        System.out.println("Marca: " + marcaVeiculo + ", Modelo: " + modeloVeiculo + ", Ano Veiculo: " + anoVeiculo);
    }

}
