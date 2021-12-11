/*класс Мясо.
расширяет класс Food.
переопределяет метод getEnergy
 */

package food;
import food.Food;
public class Meat extends Food {

    @Override
    public int getEnergy(){
        return 5;
    }
}
