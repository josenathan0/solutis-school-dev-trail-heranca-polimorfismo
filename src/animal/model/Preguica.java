package animal.model;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Zzz");
    }

    public void comportamento() {
        System.out.println("A preguiça está subindo em árvores");
    }
}
