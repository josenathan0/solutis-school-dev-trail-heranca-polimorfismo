package empresa.service;

public class Vendedor extends Comissao {
    private final double comissaoVendedor = 250.00;

    public Vendedor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + comissaoVendedor;
    }

    @Override
    public String toString() {
        return " Vendedor - " + super.toString();
    }
}
