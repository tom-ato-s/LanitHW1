/* Абстрактный класс Хищников
* переопределяет метод eat() для хищников
* */

package animals;

import animals.Animal;
import food.Food;
import  food.Meat;

public abstract class Carnivorous extends Animal {

//хищники едят только мясо
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            this.setSatiety(food.getEnergy());
            System.out.println("Поел: " + food.getClass().getSimpleName());
        } else {
            System.out.println("Еда не подходит для данного животного. Хищники не любят траву");
        }
    }
}
