/* класс Рыба(хищник).
Расширяет Carnivorous(хищники), дополняет интерфейс Swim(плыть)*/

package animals;
import animals.Swim;

public class Fish extends Carnivorous implements Swim {

    @Override
    public void swim() {
        System.out.println("Рыба плывет");

    }
}
