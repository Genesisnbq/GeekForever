package _03_Java_Exception_Handling._71_ExceptionDliveryIsNotLinBoMicrostep;

import _03_Java_Exception_Handling._71_ExceptionDliveryIsNotLinBoMicrostep.myexceptions.MyException;

public class CallerExceptionAppMain {
    public static void main(String[] args) throws ClassNotFoundException, MyException {
        Caller1 caller1 = new Caller1();
        System.out.println("调用开始");

        caller1.call2Exception();

        System.out.println("调用结束");
    }
}
