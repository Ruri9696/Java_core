package Lesson02;

public class MyArraySizeException extends RuntimeException {
    public  MyArraySizeException(String message) {
        super("Не корректный размер массива" +message);
    }

    public MyArraySizeException() {

    }
}
