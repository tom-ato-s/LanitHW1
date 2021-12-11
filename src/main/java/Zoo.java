/*
Главный класс homework2
В клсассе создаются экземпляры классов животных, действий, виды еды
 */

package main.java;

import animals.behavior.Swim;
import food.Grass;
import food.Meat;
import main.java.animals.carnivorous.*;
import main.java.animals.herbivore.Duck;
import main.java.animals.herbivore.Horse;
import main.java.animals.herbivore.Rabbit;
import main.java.animals.zoo.herbivore.*;
import main.java.employee.Worker;

public class Zoo {

    //создаем массив животных из пруда
    private static Swim[] createPond(){

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Fish fish1 = new Fish();
        Fish fish2 = new Fish();
        Fish fish3 = new Fish();
        Fish fish4 = new Fish();
        Fish fish5 = new Fish();

        //создает масив для пруда
        Swim[] an = new Swim[7];
        GrupAnimal<Swim> pond = new GrupAnimal<>(an);
        pond.add(0, duck1);
        pond.add(1, duck2);
        pond.add(2, fish1);
        pond.add(3, fish2);
        pond.add(4, fish3);
        pond.add(5, fish4);
        pond.add(6, fish5);
        return pond.getArr();
    }

    public static void main(String[] args) {
        //травоядные
        Duck duck = new Duck();
        Horse horse = new Horse();
        Rabbit rabbit = new Rabbit();
        //хищники
        Eagle eagk = new Eagle();
        Fish fish = new Fish();
        Kotik kotik = new Kotik();

        //виды еды
        food.Grass grass = new Grass();
        food.Meat meat = new Meat();
        //работник зоопарка
        Worker worker = new Worker();

        //кормим котика мясом смотрим на сытость
        System.out.println("Сытость: " + kotik.getSatiety() + " у " + kotik.getClass().getSimpleName());
        worker.feed(kotik, meat);
        System.out.println("Сытость: " + kotik.getSatiety() + " у " + kotik.getClass().getSimpleName());
        //кормим котика травой смотрим на сытость
        worker.feed(kotik, grass);
        System.out.println("Сытость: " + kotik.getSatiety() + " у " + kotik.getClass().getSimpleName());



        //кормим утку мясом смотрим на сытость
        System.out.println("Сытость: " + duck.getSatiety() + " у " + duck.getClass().getSimpleName());
        worker.feed(duck, meat);
        System.out.println("Сытость: " + duck.getSatiety() + " у " + duck.getClass().getSimpleName());
        //кормим утрку травой смотрим на сытость
        worker.feed(duck, grass);
        System.out.println("Сытость: " + duck.getSatiety() + " у " + duck.getClass().getSimpleName());

        //рабочий просит подать голос котика
        worker.getVoice(kotik);

        //рабочий просит подать голос рыбу - ошибка компиляции
       //worker.getVoice(fish);

        //получение массива водоплавающих из createPond()
        Swim[] pond = createPond();
        //применение метода swim() к элементам
        for(Swim el: pond) {
            el.swim();
        }
    }
}
