/* Абстрактный класс Хищников
* переопределяет метод eat() для хищников
* */
package animals;

import animals.Animal;
import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {

    Carnivorous(String name) {
        super(name);
    }

//хищники едят только мясо
    @Override
    public void eat(Food food) {
       try {
           //проверяет, что бы тип еды был Meat
           if (food instanceof Meat)
            throw new WrongFoodException ("Ошибочка!", food);
            this.setSatiety(food.getEnergy());
            System.out.println("Поел: " + food.getClass().getSimpleName());
        } catch (WrongFoodException e){
            System.out.println(e + " Еда не подходит для данного животного. Хищники не любят траву");
        }
    }
}
