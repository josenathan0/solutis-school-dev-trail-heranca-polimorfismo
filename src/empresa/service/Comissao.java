package empresa.service;
public abstract class Comissao {
    protected double salarioBase;

    public Comissao(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioFinal();

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Salário base: R$ " + salarioBase + ", Salário final: R$ " + calcularSalarioFinal();
    }
}

