package exception;

public class ArraySizeException extends CustomException{
    public ArraySizeException() {
        super(String.format("\"Исключение,размер должен быть 4х4\""));
    }
}
