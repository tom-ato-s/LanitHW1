/* класс Утка.
Расширяет Herbivore(травоядные), дополняет интерфейс Run(бежать), Swim(плыть), Fly(лететь), Voice(говорить),
getSize() (возврящает размер животного).
*/

package animals;

import animals.Run;
import animals.Swim;
import animals.Fly;
import animals.Voice;
import model.Size;

public class Duck extends Herbivore implements Run, Swim, Fly, Voice {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Утка бежит");
    }

    @Override
    public void swim() {
        System.out.println("Утка плывет");
    }

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public String getVoice() {
        String vois = "Кря-кря";
     return vois;
    }
    @Override
    public Size getSize() {
        Size s = Size.SMALL;
        return s;
    }
}
