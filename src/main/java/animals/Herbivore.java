/* Абстрактный класс Хищников
 * переопределяет метод eat() для хищников
 * */
package animals;

import animals.Animal;
import  food.Food;
import  food.Grass;
import main.java.food.WrongFoodException;

public abstract class Herbivore extends Animal{

    Herbivore(String name) {
        super(name);
    }

//травоядное ест только траву
    @Override
    public void eat(Food food) {
        try{
            if (food instanceof Grass)
            throw new WrongFoodException("Еда не подходит для данного животного", food);
            this.setSatiety(food.getEnergy());
            System.out.println("Поел: " + food.getClass().getSimpleName());
        } catch (WrongFoodException e) {
            System.out.println(e + " Еда не подходит для данного животного. Травоядные не едят мясо");
           // throw e;
        }
    }
}
