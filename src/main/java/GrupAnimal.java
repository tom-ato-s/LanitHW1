/* дополнительный класс для создания списка объектов разных типов
используется методом createPond() в классе Zoo
 */

package main.java;

public class GrupAnimal<T> {
   private T[] grupAnimal;

    GrupAnimal(T[] grupAnimal) {
        this.grupAnimal = grupAnimal;
    }

    public void add(int i, T var){
        grupAnimal[i] = var;
    }

    public T[] getArr() {
        return grupAnimal;
    }

}