/*
Главный класс homework2
В клсассе создаются экземпляры классов животных, действий, виды еды
 */


import employee.Worker;
import animals.Swim;
import food.Grass;
import food.Meat;
import animals.Kotik;
import animals.Fish;
import animals.*;
import animals.Duck;
import main.java.food.WrongFoodException;
import main.java.model.WrongSizeException;

public class Zoo {

    //создаем массив животных из пруда
    private static Swim[] createPond(){

        Duck duck1 = new Duck("Утя-утя");
        Duck duck2 = new Duck("Уточка");
        Fish fish1 = new Fish("Рыба");
        Fish fish2 = new Fish("Рыбка");
        Fish fish3 = new Fish("Рыбочка");
        Fish fish4 = new Fish("Малек");
        Fish fish5 = new Fish("Рыбище");

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
        Duck duck = new Duck("Утка");
        Horse horse = new Horse("Лошадь");
        Rabbit rabbit = new Rabbit("Кролик");
        //хищники
        Eagle eagk = new Eagle("Орел");
        Fish fish = new Fish("Рыба");
        animals.Kotik kotik = new Kotik("Котик");

        //виды еды
        food.Grass grass = new Grass();
        food.Meat meat = new Meat();
        //работник зоопарка
        Worker worker = new Worker();

//        WrongFoodException wfe = new WrongFoodException();
//        WrongSizeException wse = new WrongSizeException();

        //кормим котика мясом смотрим на сытость
        System.out.println("Сытость: " + kotik.getSatiety() + " у " + kotik.getClass().getSimpleName());
        worker.feed(kotik, meat);
        System.out.println("Сытость: " + kotik.getSatiety() + " у " + kotik.getClass().getSimpleName());
        //кормим котика травой смотрим на сытость
        worker.feed(kotik, grass);
        System.out.println("Сытость: " + kotik.getSatiety() + " у " + kotik.getClass().getSimpleName());


        System.out.println("Сытость: " + duck.getSatiety() + " у " + duck.getClass().getSimpleName());worker.feed(duck, meat);
        System.out.println("Сытость: " + duck.getSatiety() + " у " + duck.getClass().getSimpleName());
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
