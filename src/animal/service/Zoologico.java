package animal.service;

import animal.model.Animal;
import animal.model.Cachorro;
import animal.model.Cavalo;

public class Zoologico {
    private Animal[] jaulas = new Animal[10];
    public void adicionarAnimalNaJaula(int indice, Animal animal) {
        if (indice >= 0 && indice < jaulas.length) {
            jaulas[indice] = animal;
        }
    }
    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            if (animal != null) {
                animal.emitirSom();
                if (animal instanceof Cachorro || animal instanceof Cavalo) {
                    animal.comportamento();
                }
                System.out.println();
            }
        }
    }
}
