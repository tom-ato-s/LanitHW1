package main.java.employee;
import animals.zoo.Animal;
import food.Food;
import animals.behavior.Voice;
import animals.zoo.carnivorous.Carnivorous;
import food.Meat;
import animals.zoo.herbivore.Herbivore;
import food.Grass;
public class Worker {

//покормить животное
    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    //заставить подать голос животного
    public void getVoice(Animal animal) throws Exception{
        if (animal instanceof Voice) {
            System.out.println(((Voice) animal).getVoice());
        } else {
            System.out.println("Данное животное не говорит");
        }
    }

}
