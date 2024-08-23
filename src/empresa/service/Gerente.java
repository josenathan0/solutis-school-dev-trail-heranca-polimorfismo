package empresa.service;

public class Gerente extends Comissao {
    private final double comissaoGerente = 1500.00;

    public Gerente(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + comissaoGerente;
    }

    @Override
    public String toString() {
        return " Gerente - " + super.toString();
    }
}
