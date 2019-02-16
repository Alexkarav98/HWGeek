package exception;

public class ArrayDataException extends CustomException {
    public ArrayDataException(int row,int col) {
        super(String.format("\"Исключение,должен быть int\""));

    }
}
