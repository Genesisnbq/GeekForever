package _01_Java_Base;

public class _10_ForLoop {
    public static void main(String[] args) {
        char ch = '我';
        for (int i = 0; i < 26; i++) {
            System.out.println(ch++);
        }
        int divided = 100;
        int divisor = 3;
        for (int i = 0; i < 100; i++, divided++) {
            if (divided % divisor == 0) {
                System.out.println(divided + "可以整除" + divisor + ", 商为" + divided / divisor);
            }
            // break 会跳出整个循环,  continue是跳过本次循环
        }
    }
}
