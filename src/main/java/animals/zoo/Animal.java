/* Абстрактный класс Животные
Главный родительский класс животных
имеет абстрактный метод eat() (еда) и
и реализованный клас  setSatiety() - добавление сытоски
 */

package animals.zoo;

import food.Food;

public abstract class Animal {
    private int satiety;

   public abstract void eat(Food food);

    public int getSatiety() {
        return satiety;
    }

    //добавляется количество сытосли к существующему
    public void setSatiety(int satiety) {
        this.satiety += satiety;
    }
}
