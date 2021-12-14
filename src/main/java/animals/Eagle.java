/* класс Оерел.
Расширяет Carnivorous(хищники), дополняет интерфейс Run(бежать), Fly(летель), Voice(говорить)*/

package animals;

import animals.Run;
import animals.Fly;
import animals.Voice;
import main.java.model.Size;

public class Eagle extends Carnivorous implements Run, Fly, Voice {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Орел бежит");
    }

    @Override
    public void fly() {
        System.out.println("Орел летит");
    }

    @Override
    public String getVoice() {
       String vois = "Ис-ис";
        return vois;
    }

    @Override
    public Size getSize() {
        Size s = Size.MEDIUM;
        return s;
    }

}
