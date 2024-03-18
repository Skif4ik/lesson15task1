package model;

//создаем checked исключение
public class DivideByZeroException extends Exception {
    public DivideByZeroException() {
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}
