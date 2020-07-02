package _03_Java_Exception_Handling._70_CustomizeException.myexceptions;

public class MyException extends Exception {
    public MyException() {

    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}
