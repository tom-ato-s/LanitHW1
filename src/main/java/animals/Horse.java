/* класс Лошадь.
Расширяет Herbivore(травоядные), дополняет интерфейс Run(бежать), Voice(говорить)
*/

package animals;
import animals.Run;
import animals.Voice;

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
