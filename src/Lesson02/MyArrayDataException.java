package Lesson02;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(String message) {
        super("Преобразование не удалось" +message);
    }
}
