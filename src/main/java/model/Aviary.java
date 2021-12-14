package main.java.model;
import animals.Animal;
import animals.Carnivorous;
import animals.Herbivore;
import java.util.HashMap;

public class Aviary <T extends Animal> {

    private Size size;
    private HashMap <String, T> groupAnimals;

    Aviary(Size size) {
        groupAnimals = new HashMap<>();
        this.size = size;
    }

    public void addAnimal(T animal){
      //  throw  new WrongSizeException ("Размер животного не совпадает с размером вальера");
        groupAnimals.put(animal.getName(), animal);

    }

    public T getAnimal(String name) {
            return groupAnimals.get(name);
        }

    public boolean removeAnimal(String name) {
        return groupAnimals.remove(name, groupAnimals.get(name));
    }
}
