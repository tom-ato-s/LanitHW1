/* класс Кролик.
Расширяет Herbivore(травоядные), дополняет интерфейс Run(бежать), Voice(говорить)
*/

package main.java.animals.zoo.herbivore;

import animals.zoo.herbivore.Herbivore;
import animals.behavior.Run;
import animals.behavior.Voice;

public class Rabbit extends Herbivore implements Run, Voice {

    @Override
    public void run() {
        System.out.println("Кролик бежит");
    }

    @Override
    public String getVoice() {
        String vois = "Ик-ик";
        return vois;
    }
}
