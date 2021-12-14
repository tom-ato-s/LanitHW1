/* класс Котик.
Расширяет Carnivorous(хищники), дополняет интерфейс Run(бежать), Voice(говорить)*/

package animals;

import animals.Run;
import animals.Voice;
import model.Size;
import animals.Carnivorous;

public class Kotik extends Carnivorous implements Run, Voice {

    @Override
    public void run() {
        System.out.println("Котик бежит");
    }

    @Override
    public String getVoice() {
        String vois = "Мяу-Мяу";
        return vois;
    }

    /* поля класса
    name (имя), voice (голос, как мяукает),
    satiety (сытость), weight (вес).
    */
    private String voice;
    private int satiety;
    private int weight;
    private static int count;
    private static final int METHODS = 5;

    /* конструктор с параметрами: name (имя), voice (голос, как мяукает),
     satiety (сытость), weight (вес).
     со счетчиком созданных экземпляров класса
     */
    public Kotik(String name, String voice, int satiety, int weight) {
        super(name);
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    /*  конструктор без параметров
    со счетчиком созданных экземпляров класса
    */
    public Kotik(String name) {
        super(name);
        count++;
    }


    /*
    Методы play(), sleep(), wash(), walk(), hunt () без входящих параметров
    возвращаают значение true, если котик не голоден
    и уменьшает сытость на 1;
    возвращает false, если котик голоден -
    выводит на печать голос кота
     */
    private boolean play() {
        if (satiety > 0) {
            System.out.println("Котик играет");
            satiety--;
            return true;
        } else {
            System.out.println(voice);
            return false;
        }
    }


    private boolean sleep() {
        if (satiety > 0) {
            System.out.println("Котик спит");
            satiety--;
            return true;
        } else {
            System.out.println(voice);
            return false;
        }
    }

    private boolean wash() {
        if(satiety >0) {
            System.out.println("Котик умывается");
            satiety--;
            return true;
        } else {
            System.out.println(voice);
            return false;
        }
    }

    private boolean walk() {
        if(satiety >0) {
            System.out.println("Котик гуляет");
            satiety--;
            return true;
        } else {
            System.out.println(voice);
            return false;
        }
    }

    private boolean hunt () {
        if(satiety >0) {
            System.out.println("Котик охотится");
            satiety--;
            return true;
        } else {
            System.out.println(voice);
            return false;
        }
    }

    /*
    3 перегруженных метода eat()
     */
    /*
    первый принимет количество сытости, ничего не возвращает,
    увеличивает количество сытости на введенное значение
     */

    private void eat(int satiety) {
        this.satiety += satiety;
    }

    /*
     второй метод eat() принимет количество сытости, тип еды, ничего не возвращает,
    увеличивает количество сытости на введенное значение
     */

    private void eat(int satiety, String typeEat) {
        this.satiety += satiety;
    }

    /*
     третий метод eat() ничего не принимае, ничего не возвращает,
    вызывает своей метод с 2 параметрами
    Содержит значения для вызываемого метода с 2-мя параметрами
     */
    private void eat() {
        int satietyIn =10;
        String tipeEatIn = "Мясо";
        eat(satietyIn, tipeEatIn);
    }

    /*
    Медод liveAnotherDay() ничего не принимает,
    возвращает массив данных из 24 строк о том,
    что делал котик в течении 24 часов
    содержит переменную n которой случайто присваеваются значения от 1 до 5
    (количество действий котика)
    содержит метод switch(n) который случайто выбирает действие котика
     */
    public String[]  liveAnotherDay() {
        String[] arr = new String[24];
        for(int i = 0; i<24; i++) {
            int n = (int) ((int) (Math.random() * METHODS) + 1);
            switch(n) {
                case (1):
                    if (play() == true) {
                        arr[i] = (i + " - играл");
                    } else {
                        eat(n, "рыба");
                        arr[i] = (i + " - ел");
                    }
                    break;
                case (2):
                    if (sleep() == true) {
                        arr[i] = (i + " -  спал");
                    } else {
                        eat(n);
                        arr[i] = (i + " - ел");
                    }
                    break;
                case (3):
                    if (wash() == true) {
                        arr[i] = (i + " - умывался");
                    } else {
                        eat();
                        arr[i] = (i + " - ел");
                    }
                    break;
                case (4):
                    if (walk() == true) {
                        arr[i] = (i + " - гулял");
                    } else {
                        eat(n);
                        arr[i] = (i + " - ел");
                    }
                    break;
                case (5):
                    if (hunt() == true) {
                        arr[i] = (i + " - охотился");
                    } else {
                        eat();
                        arr[i] = (i + " - ел");
                    }
                    break;
            }
        }
        return arr;
    }

    // get-ры и set-ры для полей данного класса

    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        super.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Kotik.count = count;
    }

    @Override
    public Size getSize() {
        Size s = Size.SMALL;
        return s;
    }

}
