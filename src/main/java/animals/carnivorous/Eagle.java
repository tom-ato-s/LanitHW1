/* класс Оерел.
Расширяет Carnivorous(хищники), дополняет интерфейс Run(бежать), Fly(летель), Voice(говорить)*/

package main.java.animals.carnivorous;

import main.java.animals.Carnivorous;
import animals.behavior.Run;
import animals.behavior.Fly;
import animals.behavior.Voice;

public class Eagle extends Carnivorous implements Run, Fly, Voice {

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


}
