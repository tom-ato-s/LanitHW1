package model;

import animals.Animal;

public class WrongSizeException extends RuntimeException{
    private Size size;

    public WrongSizeException( String message, Size num) {
        super(message);
        size = num;
    }
}
