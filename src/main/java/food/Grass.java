/*класс Трава.
расширяет класс Food.
переопределяет метод getEnergy
 */

package food;

import food.Food;

public class Grass extends Food {

    @Override
    public int getEnergy(){
        return 2;
    }
}
