/* класс Котик.
Расширяет Carnivorous(хищники), дополняет интерфейс Run(бежать), Voice(говорить)*/

package main.java.animals.carnivorous;

import main.java.animals.Carnivorous;
import animals.behavior.Run;
import animals.behavior.Voice;

public class Kotik extends Carnivorous implements Run, Voice {

    @Override
    public void run() {
        System.out.println("Котик бежит");
    }

    @Override
    public String getVoice() {
        String vois = "Мяу-Мяу";
        return vois;
    }
}
