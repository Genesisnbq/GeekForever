package _03_Java_Exception_Handling._67_exceptions;


public class MustHandel {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class clazz = Class.forName("com.geekbang.exception.MustHandle");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
