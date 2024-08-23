package animal.service;

import animal.model.Animal;
public class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando o animal...");
        animal.emitirSom();
    }
}
