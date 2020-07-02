package _03_Java_Exception_Handling._67_exceptions;

public class NotHaveToHandle {
    public static void main(String[] args) {
        String str = null;
        try {
            str.toLowerCase();
        } catch (Exception ex) {
            System.out.println("该字符串是空字符串");
        }
        System.out.println("Hello world");
    }
}

