/* Абстрактный класс Хищников
 * переопределяет метод eat() для хищников
 * */
package animals;

import animals.Animal;
import  food.Food;
import  food.Grass;

public abstract class Herbivore extends Animal{

//травоядное ест только траву
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            this.setSatiety(food.getEnergy());
            System.out.println("Поел: " + food.getClass().getSimpleName());
        } else {
            System.out.println("Еда не подходит для данного животного. Травоядные не едят мясо");
        }
    }
}
