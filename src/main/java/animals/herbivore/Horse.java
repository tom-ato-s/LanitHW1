/* класс Лошадь.
Расширяет Herbivore(травоядные), дополняет интерфейс Run(бежать), Voice(говорить)
*/

package main.java.animals.herbivore;

import main.java.animals.Herbivore;
import animals.behavior.Run;
import animals.behavior.Voice;

public class Horse extends Herbivore implements Run, Voice {

    @Override
    public void run() {
        System.out.println("Лошадь бежит");
    }

    @Override
    public String getVoice() {
        String vois = "Иго-го";
        return vois;
    }

}
