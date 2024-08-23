package empresa.model;

import empresa.service.Comissao;

public class FuncionarioEnsinoBasico extends Funcionario {
    protected String escolaBasica;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasica, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.escolaBasica = escolaBasica;
        this.rendaTotal += this.rendaTotal * 0.10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Básica: " + escolaBasica;
    }
}

