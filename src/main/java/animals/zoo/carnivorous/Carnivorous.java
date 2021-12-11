package animals.zoo.carnivorous;
import animals.zoo.Animal;
import food.Food;
import  food.Grass;
import  food.Meat;
public abstract class Carnivorous extends Animal {


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
