package model;

import animals.Animal;
import animals.Carnivorous;
import animals.Herbivore;
import java.util.HashMap;
import model.Size;

public class Aviary <T extends Animal> {
    private Size size;
    private HashMap <String, T> groupAnimals;

   public Aviary(Size size) {
        groupAnimals = new HashMap<>();
        this.size = size;
    }

    public void addAnimal(T animal) {
       if (animal.getSize().equals(size)) {
           groupAnimals.put(animal.getName(), animal);
       } else{
           throw new WrongSizeException(" животного размер не совпадает с размером вальера", animal.getSize());
       }
    }

    public T getAnimal(String name) {
       return groupAnimals.get(name);
        }

    public boolean removeAnimal(String name) {
        return groupAnimals.remove(name, groupAnimals.get(name));
    }
}
