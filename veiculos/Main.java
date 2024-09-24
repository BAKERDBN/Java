public class Main {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Toyota", "Corolla", 2024);
        System.out.println("Detalhes do veiculo:");
        v.exibirDetalhes();
        Carro c = new Carro("Ferrari", "208", 2, 2018);
        System.out.println("Detalhes do veiculo:");
        c.exibirDetalhes();
        Moto m = new Moto("Honda", "XRE-300", 2023, "seca suvaco");
        System.out.println("Detalhes do veiculo");
        m.exibirDetalhes();

    }
}