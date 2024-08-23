package empresa.model;

import empresa.service.Comissao;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    protected String escolaMedia;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaBasica, String escolaMedia, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasica, comissao);
        this.escolaMedia = escolaMedia;
        this.rendaTotal += this.rendaTotal * 0.50;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Média: " + escolaMedia;
    }
}
