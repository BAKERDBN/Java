class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus){
        super(nome, salarioBase);
        setBonus(bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
}