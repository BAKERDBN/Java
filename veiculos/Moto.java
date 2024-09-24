class Moto extends Veiculo {
    private String tipoGuidon;

    public Moto(String marcaVeiculo, String modeloVeiculo, int anoVeiculo, String tipoGuidon) {
        super(marcaVeiculo, modeloVeiculo, anoVeiculo);
        this.tipoGuidon = tipoGuidon;
    }

    public String getTipoGuidon() {
        return tipoGuidon;
    }

    public void setTipoGuidon(String tipoGuidon) {
        this.tipoGuidon = tipoGuidon;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Tipo do guidon: " + tipoGuidon);
    }
}