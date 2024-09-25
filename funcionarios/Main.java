public class Main{
    public static void main(String[] args) {
        Gerente g = new Gerente("Fimoses", 3000, 200);
        System.out.println("Salario gerente " + g.getNome() + ": " + g.calcularSalario());

        Assistente ass = new Assistente("Escravo", 600);
        System.out.println("Salario do assistente " + ass.getNome() + ": " + ass.salarioBase);
    }
}