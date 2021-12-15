/*
Главный класс homework2, homework3
В клсассе создаются экземпляры классов животных, действий, виды еды
Также для homework3 вальеры для животных
 */

import employee.Worker;
import animals.Swim;
import food.Grass;
import food.Meat;
import animals.Kotik;
import animals.Fish;
import animals.*;
import animals.Duck;
import animals.Eagle;
import animals.Rabbit;
import food.WrongFoodException;
import model.Aviary;
import model.Size;
import model.WrongSizeException;
import animals.Herbivore;
import animals.Carnivorous;

public class Zoo {
    //моздание вальеров для животных Carnivorous и Herbivore
   private static Aviary<Carnivorous> carnivorousAviary = new Aviary(Size.MEDIUM);
   private static Aviary<Herbivore> herbivoreAviary = new Aviary(Size.SMALL);
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

        //кормим котика мясом смотрим на сытость
        System.out.println("Сытость: " + kotik.getSatiety() + " у " + kotik.getClass().getSimpleName());
        worker.feed(kotik, meat);
        System.out.println("Сытость: " + kotik.getSatiety() + " у " + kotik.getClass().getSimpleName());
        //кормим котика травой смотрим на сытость
        worker.feed(kotik, grass);
        System.out.println("Сытость: " + kotik.getSatiety() + " у " + kotik.getClass().getSimpleName());

        System.out.println("Сытость: " + duck.getSatiety() + " у " + duck.getClass().getSimpleName());
        worker.feed(duck, meat);
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


        fillCarnivorousAviary();
        System.out.println(getCarnivorous("fish1"));

        fillHerbivoreAviary();
        System.out.println(getHerbivore("duck").toString());

    }

    /*
    Статический метод, создает обьекты животных Хищники для вальера carnivorousAviary
     и пытается добавить их в вальер
     */
    private static void fillCarnivorousAviary() {
        Fish fish1 = new Fish("fish1");
        Kotik kot1 = new Kotik("kot1");
       carnivorousAviary.addAnimal(fish1);
       // carnivorousAviary.addAnimal(eagle1);

    }
    /*
     Статический метод, создает обьекты животных Твавоядные для вальера herbivoreAviary
     и пытается добавить их в вальер
     */
    private static void fillHerbivoreAviary() {
        Duck duck1 = new Duck("duck");
      //  Rabbit rabbit1 = new Rabbit("Rabbit1");
        herbivoreAviary.addAnimal(duck1);
        //herbivoreAviary.addAnimal(rabbit1);
    }
    /*
    Статический метод принимает хначение имени животного и возвращает ссылку на его обьект,
    хранящийся в вальере carnivorousAviary
    */
    private static Carnivorous getCarnivorous( String name) {
        Carnivorous c = carnivorousAviary.getAnimal(name);
        return c;
    }
    /*
    Статический метод принимает хначение имени животного и возвращает ссылку на его обьект,
    хранящийся в вальере carnivorousAviary
    */
    private static Herbivore getHerbivore(String name) {
        Herbivore h = herbivoreAviary.getAnimal(name);
        return h;
    }
}
