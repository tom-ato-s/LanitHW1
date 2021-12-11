/* класс Рыба(хищник).
Расширяет Carnivorous(хищники), дополняет интерфейс Swim(плыть)*/

package main.java.animals.zoo.carnivorous;

import animals.zoo.carnivorous.Carnivorous;
import animals.behavior.Swim;

public class Fish extends Carnivorous implements Swim {

    @Override
    public void swim() {
        System.out.println("Рыба плывет");

    }
}
