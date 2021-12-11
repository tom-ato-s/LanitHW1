/* класс Утка.
Расширяет Herbivore(травоядные), дополняет интерфейс Run(бежать), Swim(плыть), Fly(лететь), Voice(говорить)
*/

package animals;

import animals.Run;
import animals.Swim;
import animals.Fly;
import animals.Voice;

public class Duck extends Herbivore implements Run, Swim, Fly, Voice {

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
}
