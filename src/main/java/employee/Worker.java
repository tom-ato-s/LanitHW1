/*Класс Работник. Он кормит и просит сказать жывотных
* */

package employee;

import animals.Animal;
import food.Food;
import animals.Voice;

public class Worker {

//покормить животное
    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    //заставить подать голос животного
    public void getVoice(Voice animal) {
            System.out.println(animal.getVoice());
    }
}
