package empresa.model;

import empresa.service.Comissao;

public class Funcionario {
    protected String nome;
    protected int codigoFuncional;
    protected double rendaTotal;
    protected Comissao comissao;

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaTotal = 1000.00;
        this.comissao = comissao;
    }

    public double calcularRendaTotal() {
        return rendaTotal + comissao.calcularSalarioFinal() - comissao.getSalarioBase();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Comissão: R$ " + (comissao.calcularSalarioFinal() - comissao.getSalarioBase()) + ", Salário Total: R$ " + calcularRendaTotal();
    }
}

