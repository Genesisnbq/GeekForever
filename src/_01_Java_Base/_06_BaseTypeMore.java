package _01_Java_Base;

public class _06_BaseTypeMore {
    public static void main(String[] args) {
        // 变量要先赋值, 后使用 int a = 10;
        // 计算并赋值运算符 a = a + 10 -----> a+=10;
        int a = 16 >> 2;
        a >>= 2;
        System.out.println(a);
        // 数据类型自动转化 int -> long   小的可以转换为大的
        int intval = 99;
        long longval = intval;
        System.out.println(longval);
        float floatval = 11.32f;
        double doubleval = floatval;
        System.out.println(doubleval);
        char ch = 'A';
        int chval = ch;
        int chvalcalc = ch + 10;
        System.out.println(chval);
        System.out.println(chvalcalc);
        // 大的转小的要人去敲定, (int)  (char)
        System.out.println((char) chvalcalc);
        //强制类型转换可能会 失去意义, 或者精度丢失
        int num = 2000000000;
        System.out.println(num + num); //溢出了
    }
}
