/* класс Кролик.
Расширяет Herbivore(травоядные), дополняет интерфейс Run(бежать), Voice(говорить)
*/

package animals;

import animals.Run;
import animals.Voice;

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
