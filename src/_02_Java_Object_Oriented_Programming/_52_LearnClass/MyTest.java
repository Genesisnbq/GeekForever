package _02_Java_Object_Oriented_Programming._52_LearnClass;

import _02_Java_Object_Oriented_Programming._52_LearnClass.supermarket.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyTest {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Class clazz = ShellColorChangePhone.class;
        Field countField = clazz.getField("count");
        Method equalsMethod = clazz.getMethod("equals", Object.class);
        System.out.println(equalsMethod);
    }
}