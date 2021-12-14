/* класс Лошадь.
Расширяет Herbivore(травоядные), дополняет интерфейс Run(бежать), Voice(говорить)
*/

package animals;

import animals.Run;
import animals.Voice;
import model.Size;

public class Horse extends Herbivore implements Run, Voice {

    public Horse(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Лошадь бежит");
    }

    @Override
    public String getVoice() {
        String vois = "Иго-го";
        return vois;
    }

    @Override
    public Size getSize() {
        Size s = Size.LARGE;
        return s;
    }
}
