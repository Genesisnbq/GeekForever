package _01_Java_Base;

import java.util.Scanner;

public class _15_Loop_Judge_Summary_Part2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // 创建Scanner来读取用户的键盘输入
        int count = 1;
        // 游戏设置
        while (true) {
            System.out.println("第" + count++ + "局");
            System.out.println("请输入要猜测的开始值(左边界)!");
            int rangeStart = in.nextInt();
            System.out.println("请输入要猜测的结束值(右边界)");
            int rangeEnd = in.nextInt();
            int guessTotal = 5;
            int mod = rangeEnd - rangeStart; //控制range的范围
            if (rangeStart < 0 || rangeEnd < 0) {
                System.out.println("开始和结束必须是正数或者0");
            }
            if (mod <= 1) {
                System.out.println("非法数字范围: (" + rangeStart + ", " + rangeEnd + ")");
            }// mod <= 1 的时候就是非法的
            int bigRandom = (int) (Math.random() * rangeEnd * 100); //产生一个大数
            int numberToGuess = (bigRandom % mod) + rangeStart;
            int ToGuess = guessTotal;
            boolean GuessTrue = false;
            while (ToGuess > 0) {
                System.out.println("请输入要猜测的数字, 剩余猜测次数" + ToGuess);
                int guess = in.nextInt();
                ToGuess--;
                if (guess > numberToGuess) {
                    System.out.println("输入的数字比目标数字大!范围在:(" + rangeStart + "," + rangeEnd + ")");
                } else if (guess < numberToGuess) {
                    System.out.println("输入的数字比目标数字小!范围在:(" + rangeStart + "," + rangeEnd + ")");
                } else {
                    System.out.println("恭喜你! 猜对了!");
                    GuessTrue = true;
                    break;
                }
            }
            if (!GuessTrue) System.out.println("很抱歉, 你没有猜对~,请再接再励");
        }
    }
}
