package _00_University_Java;

import java.util.Scanner;

public class _00_Experiment1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //计算已知半径的圆的面积
        System.out.println("请输入圆的半径");
        double r = in.nextDouble();
        double s = 0.0;
        s = Math.PI * r * r;
        System.out.println("圆的面积为: " + s);

        // 计算 1-20的偶数和
        System.out.printf("1-20的偶数和: ");
        int sum = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) sum += i;
        }
        System.out.println(sum);
    }
}
