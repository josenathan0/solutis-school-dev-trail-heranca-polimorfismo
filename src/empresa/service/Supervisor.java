package empresa.service;

public class Supervisor extends Comissao {
    private final double comissaoSupervisor = 600.00;

    public Supervisor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + comissaoSupervisor;
    }

    @Override
    public String toString() {
        return " Supervisor - " + super.toString();
    }
}
