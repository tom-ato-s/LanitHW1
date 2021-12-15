/*
Класс создает исключение WrongFoodExceptionб когда тип еды животного не соответствует животному
 */


package food;

import food.Food;

public class WrongFoodException extends Exception{
    private Food food;

    public WrongFoodException(String message, Food num){
        super(message);
        food = num;
    }
}