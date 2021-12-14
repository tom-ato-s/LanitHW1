/* Абстрактный класс Животные
Главный родительский класс животных
имеет абстрактный метод eat() (еда) и
и реализованный клас  setSatiety() - добавление сытоски
 */

package animals;

import food.Food;
import main.java.food.WrongFoodException;
import main.java.model.Size;


public abstract class Animal    {
    public String name;
    private int satiety;

    Animal(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void eat(Food food);

    public abstract Size getSize();

    public int getSatiety() {
        return satiety;
    }

    //добавляется количество сытосли к существующему
    public void setSatiety(int satiety) {
        this.satiety += satiety;
    }


}
