package main.java;

import animals.behavior.Swim;
import animals.zoo.Animal;
import food.Grass;
import food.Meat;
import main.java.animals.zoo.carnivorous.*;
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

        animals.behavior.Swim[] an = new Swim[7];
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


     //   worker.feed(horse, grass);

        //кормим утрку мясом смотрим на сытость
        System.out.println(duck.getSatiety());
        worker.feed(duck, meat);
        System.out.println(duck.getSatiety());
        //кормим утрку травой смотрим на сытость
        worker.feed(duck, grass);
        System.out.println(duck.getSatiety());

        //голос котика
        worker.getVoice(kotik);

        //получение массива водоплавающих из createPond()
        Swim[] pond = createPond();
        //применение метода swim() к элементам
        for(Swim el: pond) {
            el.swim();
        }
    }
}
