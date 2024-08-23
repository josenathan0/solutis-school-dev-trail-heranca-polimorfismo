package animal;

import animal.model.Animal;
import animal.model.Cachorro;
import animal.model.Cavalo;
import animal.model.Preguica;
import animal.service.Veterinario;
import animal.service.Zoologico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Liberdade", 7);
        Animal preguica = new Preguica("Dorminhoco", 3);

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(cavalo);
        animais.add(preguica);

        System.out.println("--------------------");
        System.out.println("Sons animais: \n");

        // Invocando o método emitirSom() de forma polimórfica
        for (Animal animal : animais) {
            animal.emitirSom();
        }

        System.out.println("\n--------------------");

        Veterinario veterinario = new Veterinario();
        System.out.println("Na clínica veterinária: \n");

        // Examinando os animais
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        System.out.println("\n--------------------");
        System.out.println("No Zoológico: \n");

        Animal cachorro2 = new Cachorro("Scott", 4);
        Animal cavalo2 = new Cavalo("Corsel", 8);
        Animal preguica2 = new Preguica("Devagar", 2);
        Animal cachorro3 = new Cachorro("Max", 6);
        Animal cavalo3 = new Cavalo("Dourado", 9);
        Animal preguica3 = new Preguica("Dorminhoco", 4);
        Animal cachorro4 = new Cachorro("Spike", 3);

        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimalNaJaula(0, cachorro);
        zoologico.adicionarAnimalNaJaula(1, cavalo);
        zoologico.adicionarAnimalNaJaula(2, preguica);
        zoologico.adicionarAnimalNaJaula(3, cachorro2);
        zoologico.adicionarAnimalNaJaula(4, cavalo2);
        zoologico.adicionarAnimalNaJaula(5, preguica2);
        zoologico.adicionarAnimalNaJaula(6, cachorro3);
        zoologico.adicionarAnimalNaJaula(7, cavalo3);
        zoologico.adicionarAnimalNaJaula(8, preguica3);
        zoologico.adicionarAnimalNaJaula(9, cachorro4);

        // Percorrendo as jaulas e acionando os comportamentos dos animais
        zoologico.percorrerJaulas();
    }
}