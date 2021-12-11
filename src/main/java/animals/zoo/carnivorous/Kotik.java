package main.java.animals.zoo.carnivorous;

import animals.zoo.carnivorous.Carnivorous;
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
