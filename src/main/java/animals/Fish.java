/* класс Рыба(хищник).
Расширяет Carnivorous(хищники), дополняет интерфейс Swim(плыть)
getSize() (возврящает размер животного).*/
package animals;

import animals.Swim;
import model.Size;

public class Fish extends Carnivorous implements Swim {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Рыба плывет");

    }

    @Override
    public Size getSize() {
        Size s = Size.MEDIUM;
        return s;
    }
}
