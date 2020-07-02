package _01_Java_Base;// 使用 alt + 4  可以来回切换 terminal

import java.util.Scanner;

public class _14_Loop_Judge_Summary_Part1 {
    public static void main(String[] args) {
        //单行注释
        // 注释不会对程序有任何影响
        /* 多行注释*/
        double randNum = 0;
        while (randNum < 0.5) {
            // 使用java中的Math.random() 生成一个随机数
            randNum = Math.random();
            System.out.println(randNum);
        }
        System.out.println("生成的大于0.5的随机数: " + randNum);

        int rangeStart = 30;
        int rangeEnd = 100;  //输出一个 30 -100 之间的数  [30,100)
        int mod = rangeEnd - rangeStart;
        if (mod <= 1) {
            System.out.println("非法数字范围: (" + rangeStart + ", " + rangeEnd + ")");
        }
        for (int i = 0; i < 50; i++) {
            int bigRandom = (int) (Math.random() * (rangeEnd * 100)); // 30-90之间
            int NumToGuess = bigRandom % mod + rangeStart;
            System.out.println("mod=" + mod + ", NumToGuess=" + NumToGuess);
        }
        Scanner in = new Scanner(System.in); // 需要 import java.util.Scanner;
        System.out.println("请问你的名字是?");
        String str = in.nextLine(); // 如果没有enter键, 程序会一直等
        System.out.println(str + ", 你好!");
        System.out.println("请问你几岁了?");
        int age = in.nextInt();
        System.out.println("这么大了啊, " + str + "都" + age + "岁了~");
    }
}
