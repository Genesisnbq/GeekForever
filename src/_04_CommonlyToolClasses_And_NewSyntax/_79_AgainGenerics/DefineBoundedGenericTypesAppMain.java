package _04_CommonlyToolClasses_And_NewSyntax._79_AgainGenerics;

import _04_CommonlyToolClasses_And_NewSyntax._79_AgainGenerics.define.MyGenericClassBounded;

import java.lang.reflect.Field;

public class DefineBoundedGenericTypesAppMain {
    // >> TODO 如果在定义的时候就指定了类型, 那么引用的类型就是指定的类型的最父级的类型
    public static void main(String[] args) throws NoSuchFieldException {
        Field field = MyGenericClassBounded.class.getDeclaredField("myType");
        System.out.println(field.getType());
    }
}
