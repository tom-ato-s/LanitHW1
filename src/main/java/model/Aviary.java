/*
Обобщенный (generic) класс Aviary<> - создает вольер для животных с помощю HashMap.
Есть возможность создать вальер для хищников и травоядных (наследников Animal).
 */

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
    /* метод добавляет животного в вальер с проверкой размера животного и значение размера вальера.
        Есть проверка еквивалентности размера вальера и животного
    */
    public void addAnimal(T animal) {
       if (animal.getSize().equals(size)) {
           groupAnimals.put(animal.getName(), animal);
       } else{
           throw new WrongSizeException(" животного размер не совпадает с размером вальера", animal.getSize());
       }
    }

    //возвращает объект животного из вальера по имени
    public T getAnimal(String name) {
       return groupAnimals.get(name);
        }
    //возвращает объект животного из вальера по имени

    public boolean removeAnimal(String name) {
        return groupAnimals.remove(name, groupAnimals.get(name));
    }
}
