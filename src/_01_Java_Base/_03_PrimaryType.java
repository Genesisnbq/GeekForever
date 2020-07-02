package _01_Java_Base;

public class _03_PrimaryType {
    public static void main(String[] args) {
        // 整数
        byte a = -128;  // 1个byte
        byte b = 127;
        short c = -32728; // 2个byte
        short d = 32767;
        int e = -2147483648; // 4个byte
        int f = 2147483641;
        long g = -9223372036854774808L; //8个byte
        long h = 9223372036854774807L;

        // 浮点(小数) 类型
        float i = 1; //4个byte
        double j = 1.0; // float的两倍, 8个byte

        //符号位

        //布尔和字符数据类型
        System.out.println(1 < 2);
        System.out.println(2 < 1);
        System.out.println("ABC");
        System.out.println("AB");
        System.out.println('a'); // 单个字符可以单引号

        // 整数的缺省值是int, 浮点数缺省的值是 double
        long bigLongVar = 99999999999L; //默认书面还是 int, 所以要在后面加一个L

        float floatVar = 100.1f; // 因为浮点数缺省的值是 double, 所以要就加一个f

        char ch = 'A';
        System.out.println(ch);
    }
}
