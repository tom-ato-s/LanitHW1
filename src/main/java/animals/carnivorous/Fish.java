/* класс Рыба(хищник).
Расширяет Carnivorous(хищники), дополняет интерфейс Swim(плыть)*/

package main.java.animals.carnivorous;

import main.java.animals.Carnivorous;
import animals.behavior.Swim;

public class Fish extends Carnivorous implements Swim {

    @Override
    public void swim() {
        System.out.println("Рыба плывет");

    }
}
