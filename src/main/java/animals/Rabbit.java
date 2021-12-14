/* класс Кролик.
Расширяет Herbivore(травоядные), дополняет интерфейс Run(бежать), Voice(говорить)
*/

package animals;

import animals.Run;
import animals.Voice;
import main.java.model.Size;

public class Rabbit extends Herbivore implements Run, Voice {

    public Rabbit(String name) {
        super(name);
    }


    @Override
    public void run() {
        System.out.println("Кролик бежит");
    }

    @Override
    public String getVoice() {
        String vois = "Ик-ик";
        return vois;
    }
    @Override
    public Size getSize() {
        Size s = Size.SMALL;
        return s;
    }

}
