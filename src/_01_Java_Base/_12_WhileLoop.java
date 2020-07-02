package _01_Java_Base;

public class _12_WhileLoop {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        int dividend = 100;
        int divisor = 45;
        while (count < n) {
            if (dividend % divisor == 0) {
                System.out.println(count + 1 + ": " + dividend + "可以整除" + divisor + ", 商为" + dividend / divisor);
                count++;
            }
            dividend++;
        }
        // do-while
        do {
            System.out.println("世界首发, 就在这里!");
        } while (false);
    }
}
