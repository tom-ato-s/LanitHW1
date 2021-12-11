package main.java;

public class GrupAnimal<T> {
    T[] grupAnimal;
    GrupAnimal(T[] grupAnimal) {
        this.grupAnimal = grupAnimal;
    }

    public void info() {
        for (T el: grupAnimal) {
            System.out.println(el.toString());
        }
    }

    void add(int i, T var){
        grupAnimal[i] = var;
    }

    public T[] getArr() {
        return grupAnimal;
    }

}