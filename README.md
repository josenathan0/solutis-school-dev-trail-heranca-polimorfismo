# Herança e Polimorfismo em Java - Solutis School Dev Trail

Este projeto é uma demonstração prática dos conceitos de herança e polimorfismo em Java. Foi desenvolvido como parte de uma atividade para explorar como classes base e derivadas podem ser utilizadas para modelar diferentes tipos de entidades, tanto no contexto de um zoológico quanto no de uma empresa.

## Estrutura do Projeto

O projeto é dividido em dois módulos principais: um que modela um zoológico com diferentes tipos de animais, e outro que simula uma empresa com funcionários de diferentes níveis de escolaridade e cargos. As classes estão organizadas em pacotes dentro do diretório `src`.

### Pacote `animal`
- **Classes:**
  - **Animal.java**: A classe base que define os atributos e métodos comuns a todos os animais, como `nome` e `idade`. Esta classe é abstrata e serve como base para classes mais especializadas.
  - **Cachorro.java, Cavalo.java, Preguica.java**: Classes que estendem `Animal`, cada uma representando um tipo específico de animal com comportamentos únicos.
  - **Veterinario.java**: Classe que permite examinar os animais, invocando o método `emitirSom()` de forma polimórfica.
  - **Zoologico.java**: Classe que gerencia um conjunto de jaulas, cada uma contendo um animal, e permite percorrer essas jaulas, emitindo os sons dos animais e executando ações específicas como correr.
  - **Main**: Classe principal para simulação do Zoológico.

### Pacote `empresa`
- **Classes:**
  - **Funcionario.java**: Classe base que modela os atributos e métodos comuns a todos os funcionários, como `nome`, `codigoFuncional`, `rendaTotal`, e `comissao`. Inclui o método `calcularRendaTotal()`, que calcula o salário total do funcionário.
  - **FuncionarioEnsinoBasico.java, FuncionarioEnsinoMedio.java, FuncionarioGraduacao.java**: Classes que estendem `Funcionario`, cada uma representando um nível de escolaridade e ajustando a renda total conforme a formação do funcionário.
  - **Comissao.java**: Classe abstrata que define o cálculo da comissão baseada no salário base. Serve como base para classes de cargos específicos.
  - **Gerente.java, Supervisor.java, Vendedor.java**: Classes que estendem `Comissao`, cada uma representando um tipo de cargo na empresa com uma comissão específica.
  - **MainEmpresa.java**: Classe principal para simulação da empresa, onde são criados funcionários de diferentes níveis de escolaridade e cargos, calculadas as comissões, e exibidas as informações sobre cada funcionário.

## Funcionamento Geral

O projeto foi desenvolvido para demonstrar como herança e polimorfismo podem ser usados em Java para criar sistemas flexíveis e reutilizáveis. Cada classe especializada estende ou redefine métodos das classes base para adicionar comportamentos específicos, mostrando a força e flexibilidade da herança.

## Exemplo de Uso

Aqui está um exemplo de como uma instância de `FuncionarioGraduacao` pode ser criada e utilizada:

```java
FuncionarioGraduacao funcionario = new FuncionarioGraduacao(
    "Fernanda Silva", 
    110, 
    "Escola Básica João Pessoa", 
    "IFPB", 
    "UFPB", 
    new Gerente(5000.00)
);
System.out.println("Salário Total de Fernanda: " + funcionario.calcularRendaTotal());
```

## Compilação e Execução

### Para compilar e executar o projeto, siga as instruções abaixo:

1. **Compile todas as classes:**

    ```bash
    javac src/animal/*.java src/empresa/*.java
    ```

2. **Execute a classe principal do Zoológico:**

    ```bash
    java src.animal.Main
    ```

3. **Ou execute a classe principal da Empresa:**

    ```bash
    java src.empresa.MainEmpresa
    ```
## Conclusão

Este projeto é um exemplo prático de como herança e polimorfismo podem ser usados para criar um sistema de classes em Java que modela diferentes tipos de entidades e seus comportamentos. A flexibilidade oferecida por essas técnicas permite a criação de código reutilizável e de fácil manutenção, essencial em projetos de software mais complexos.



