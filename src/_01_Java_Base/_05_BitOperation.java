package _01_Java_Base;

public class _05_BitOperation {
    public static void main(String[] args) {
        // 0开头的为 8进制
        // 0x开头的是 16进制
        int a = 05; //二进制的 0000 0101
        int b = 011; // 二进制的 0000 1001
        // 二进制的 1111 0000
        int c = 0xFF; //二进制的1111 0000
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // 位运算
        //  二进制的 1111 0000  我们习惯用4个bit作为一个小单元, 这样不容易眼花
        System.out.println(10 >> 3 & 1);
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~c);
        int num = 16;
        System.out.println(num >> 1); // 相当于整数2
        int base = 1; //0001
        int is_student_mask = base;
        int is_programmer_mask = base << 1; //0010
        int is_driver_mask = base << 2;
        int is_painter_mask = base << 3;
        int data = 5; //0101
        boolean isStudent = (data & is_student_mask) != 0;
        System.out.println(isStudent);
        boolean isProgrammer = (data & is_programmer_mask) != 0;
        System.out.println(isProgrammer);
        boolean isDriver = (data & is_driver_mask) != 0;
        System.out.println(isDriver);
        boolean isPainter = (data & is_painter_mask) != 0;
        System.out.println(isPainter);
    }
}
