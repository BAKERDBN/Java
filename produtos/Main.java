class Main{
    public static void main(String[] args) {
        Eletronico e = new Eletronico("PC Positivo.", 30000, 12);
        System.out.println("Produto: " + e.getNome() + " Valor: " + e.getPreco() + " Garantia(meses): " + e.getGarantia());

        Alimento a = new Alimento("Banana.", 24, "Amanhã");
        System.out.println("Produto: " + a.getNome() + " Valor: " + a.getPreco() + " Valido até: " + a.getDataDeValidade());
    }
}