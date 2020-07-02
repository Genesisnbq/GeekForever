package _01_Java_Base;

public class _09_If_Else {
    public static void main(String[] args) {
        int bun = 3;
        boolean steamed = true;
        if (steamed) {
            bun += 2;
            System.out.println("包子刚出笼, 买了" + bun + "个肉包子");
        } else System.out.println("包子不是刚出笼, 买了" + bun + "个肉包子");

        //  求 a, b, c 三个数中的最大数
        int a = 1;
        int b = 2;
        int c = 3;
        if (a >= b) {
            if (a >= c) System.out.println("最大的数是: " + a);
        } else {
            if (b >= c) System.out.println("最大的数是: " + b);
            else System.out.println("最大的数是: " + c);
        }
    }
}
