package _03_Java_Exception_Handling._68_ThrowExceptionGrammar;

public class ThrowIt {

    // >> TODO 可以使用throws关键字，抛出一个异常。
    // >> TODO 抛出的异常类型，可以是实际异常的父类或者本身。
    // >> TODO 可以抛出多种类型的异常，用逗号分开就可以。
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        // forName是想找一个类名叫做"abc"的类的实例
        Class clazz = Class.forName("abc");
        // 获取clazz这个类的名字叫做 ""的成员变量
        clazz.getField("");
    }
}

