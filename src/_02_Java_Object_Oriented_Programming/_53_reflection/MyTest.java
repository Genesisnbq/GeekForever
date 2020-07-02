package _02_Java_Object_Oriented_Programming._53_reflection;

import _02_Java_Object_Oriented_Programming._53_reflection.supermarket.*;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MyTest {
    public static void main(String... args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        LittleSuperMarket supermarket = new LittleSuperMarket("大卖场", "世纪大道1号",
                500, 600, 100);
        MerchandiseV2 m100 = supermarket.getMerchandiseOf(100);
        Class clazz = MerchandiseV2.class;
//        System.out.println(clazz);
        Field countField = clazz.getDeclaredField("count");//获取我声明的Field
        countField.setAccessible(true);
        System.out.println(countField.get(m100));// 获取对象的数据  传进来的参数必须是他本身的类型或者是他的子类才行
        countField.set(m100, 999);
//        System.out.println(m100.count);
        printField(clazz);
//        Field field = clazz.getField("STATIC_MEMBER"); // 静态的Field是和实例没有关系的
//        System.out.println(field.get(null));
//        Method descMethod = clazz.getMethod("describe");
//        descMethod.invoke(m100);
//        descMethod.invoke(supermarket.getMerchandiseOf(0));
        // TODO 使用反射访问静态方法
//        Method staticMethod = clazz.getMethod("getNameOf",MerchandiseV2.class);
//        String str = (String)staticMethod.invoke(null,m100);
//        System.out.println(str);
//        Method buyMethod = clazz.getMethod("buy",int.class); //传入的是参数类型的.class
//        buyMethod.invoke(m100,10);
    }

    public static void printField(Class clazz) {
        System.out.println(clazz.getName() + "里的Field");
        for (Field field : clazz.getFields()) {
            System.out.println(field.getType() + " " + field.getName());
        }
    }
}
