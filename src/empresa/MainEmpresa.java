package empresa;

import empresa.model.Funcionario;
import empresa.model.FuncionarioEnsinoBasico;
import empresa.model.FuncionarioEnsinoMedio;
import empresa.model.FuncionarioGraduacao;
import empresa.service.Comissao;
import empresa.service.Gerente;
import empresa.service.Supervisor;
import empresa.service.Vendedor;

public class MainEmpresa {
    public static void main(String[] args) {

        /* QUESTÕES 5 e 6
        Funcionario f1 = new Funcionario("João", 101);
        FuncionarioEnsinoBasico f2 = new FuncionarioEnsinoBasico("Maria", 102, "Escola Municipal Porto Seguro");
        FuncionarioEnsinoMedio f3 = new FuncionarioEnsinoMedio("Pedro", 103, "Escola Municipal Alegria", "Instituro Federal da Paraíba");
        FuncionarioGraduacao f4 = new FuncionarioGraduacao("Ana", 104, "Escola Municipal Porto Seguro", "Instituro Federal da Paraíba", "UFPB");

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        System.out.println();

         */


        /* Adicionando 10 novos funcionários com diferentes níveis de escolaridade - QUESTÃO 7

        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new FuncionarioEnsinoBasico("Maria", 101, "Escola Diego Dantas");
        funcionarios[1] = new FuncionarioEnsinoBasico("João", 102, "Escola Maria Cecília");
        funcionarios[2] = new FuncionarioEnsinoBasico("Carlos", 103, "Escola Camarado");
        funcionarios[3] = new FuncionarioEnsinoBasico("Ana", 104, "Escola Maria Amélia");

        funcionarios[4] = new FuncionarioEnsinoMedio("Pedro", 105, "Escola Diego Dantas", "IFPB");
        funcionarios[5] = new FuncionarioEnsinoMedio("José", 106, "Escola Maria Cecília", "IFPB);
        funcionarios[6] = new FuncionarioEnsinoMedio("Paula", 107, "Escola Maria Amélia", "IFPB");
        funcionarios[7] = new FuncionarioEnsinoMedio("Clara", 108, "Escola Básica Nélio Alves", "IFPB");

        funcionarios[8] = new FuncionarioGraduacao("Rafael", 109, "Escola Básica I", "IFPB", "Universidade X");
        funcionarios[9] = new FuncionarioGraduacao("Fernanda", 110, "Escola Básica J", "IFPB", "Universidade Y");

        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoSuperior = 0;

        for (Funcionario funcionario : funcionarios) {
            custoTotal += funcionario.rendaTotal;

            if (funcionario instanceof FuncionarioGraduacao) {
                custoSuperior += funcionario.rendaTotal;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoMedio += funcionario.rendaTotal;
            } else if (funcionario instanceof FuncionarioEnsinoBasico) {
                custoBasico += funcionario.rendaTotal;
            }
        }

        System.out.println("Custo total com salários: R$ " + custoTotal);
        System.out.println("Custo total com funcionários de ensino básico: R$ " + custoBasico);
        System.out.println("Custo total com funcionários de ensino médio: R$ " + custoMedio);
        System.out.println("Custo total com funcionários de nível superior: R$ " + custoSuperior);

        */

        // Criando comissões
        Comissao comissaoGerente = new Gerente(1000.00);
        Comissao comissaoSupervisor = new Supervisor(1000.00);
        Comissao comissaoVendedor = new Vendedor(1000.00);

        // Criando funcionários com diferentes níveis de escolaridade e comissões
        Funcionario f1 = new FuncionarioEnsinoBasico("Maria", 101, "Escola Diego Dantas", comissaoVendedor);
        Funcionario f2 = new FuncionarioEnsinoBasico("João", 102, "Escola Maria Cecília", comissaoVendedor);
        Funcionario f3 = new FuncionarioEnsinoBasico("Carlos", 103, "Escola Camarado", comissaoVendedor);
        Funcionario f4 = new FuncionarioEnsinoBasico("Ana", 104, "Escola Maria Amélia", comissaoVendedor);

        Funcionario f5 = new FuncionarioEnsinoMedio("Pedro", 105, "Escola Diego Dantas", "IFPB", comissaoVendedor);
        Funcionario f6 = new FuncionarioEnsinoMedio("José", 106, "Escola Maria Cecília", "IFPB", comissaoVendedor);
        Funcionario f7 = new FuncionarioEnsinoMedio("Paula", 107, "Escola Maria Amélia", "IFPB", comissaoVendedor);
        Funcionario f8 = new FuncionarioEnsinoMedio("Clara", 108, "Escola Básica Nélio Alves", "IFPB", comissaoSupervisor);

        Funcionario f9 = new FuncionarioGraduacao("Rafael", 109, "Escola Rita Lee", "IFPB", "UFPB", comissaoSupervisor);
        Funcionario f10 = new FuncionarioGraduacao("Fernanda", 110, "Escola Básica João Pessoa", "IFPB", "UFPB", comissaoGerente);

        // Imprimindo os funcionários usando o toString sobrescrito
        Funcionario[] funcionarios = {f1,f2,f3,f4,f5,f6,f7,f8,f9,f10};

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
