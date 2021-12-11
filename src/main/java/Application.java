/*
Главный класс homework1
в нем осуществляется начало запуска программы
 */


import animals.Kotik;

public class Application {
    /* Cтатический метод
      преверяет одинаково ли говорят котики
      */
    private static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        String vois1 = kotik1.getVoice();
        String vois2 = kotik2.getVoice();
        if(vois1.equals(vois2) == true)
            return true;
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Создание объектов класса Kotik
        Kotik kotik1 = new Kotik("Max", "Mew", 10, 8);
        Kotik kotik2 = new Kotik();
        //присвоение значений полям объекта kotik2, созданному без параметров
        kotik2.setName("Kity");
        kotik2.setVoice("Mew-Mew");
        kotik2.setSatiety(2);
        kotik2.setWeight(6);

        // вывод на печать всего, что делал kotik1
        for(String s: kotik1.liveAnotherDay()) {
            System.out.println(s);
        }
        // вывод в консоль имени и веса kotik1
        System.out.println(kotik1.getName() + " " + kotik1.getWeight());
        /*
        вывод в консоль результат работы метода compareVoice() -
        одинаковы ли голоса котиков
         */
        System.out.println("Голоса одинаковые: " + compareVoice(kotik1, kotik2));
        // выводит в консоль количество созданных экземпляров класса Kotik
        System.out.println("Количество созданных котиков " + Kotik.getCount());
    }
}
