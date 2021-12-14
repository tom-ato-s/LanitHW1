/*Класс Работник. Он кормит и просит сказать жывотных
* */

package employee;

import animals.Animal;
import food.Food;
import animals.Voice;
import main.java.food.WrongFoodException;

public class Worker {

//покормить животное
    public void feed(Animal animal, Food food) {
        try{
        animal.eat(food);
        } catch (Exception e) {
            System.out.println("Не получилось покормить");
            e.printStackTrace();
            throw e;
        }
    }

    //заставить подать голос животного
    public void getVoice(Voice animal) {
            System.out.println(animal.getVoice());
    }
}
