package animal.model;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Rirrr rirr");
    }

    public void comportamento() {
        System.out.println("Cavalo está correndo");
    }
}

