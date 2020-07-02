package _01_Java_Base;

import java.util.Scanner;

//  多维数组  以二维数组作为例子
public class _18_MulArray {
    public static void main(String[] args) {
        int YuWen = 0;
        int ShuXue = 1;
        int HuaXue = 2;
        int YingYu = 3;
        int WuLi = 4;
        int LiShi = 5;

        String[] ScoreNames = new String[6];
        ScoreNames[YuWen] = "语文";
        ScoreNames[ShuXue] = "数学";
        ScoreNames[HuaXue] = "化学";
        ScoreNames[YingYu] = "英语";
        ScoreNames[WuLi] = "物理";
        ScoreNames[LiShi] = "历史";
        Scanner in = new Scanner(System.in);
        System.out.println("请问要保存几年的成绩?");
        int YearToUse = in.nextInt();
        int[][] Scores = new int[YearToUse][ScoreNames.length];
        for (int i = 0; i < YearToUse; i++)
            for (int j = 0; j < ScoreNames.length; j++) {
                Scores[i][j] = 80 + ((int) (Math.random() * 21));
            }
        System.out.println("请问你要查看第几年的成绩?");
        int year = in.nextInt() - 1;
        for (int i = 0; i < 6; i++) {
            System.out.println("第" + (year + 1) + "年的" + ScoreNames[i] + "成绩为: " + Scores[year][i]);
        }
        // 可以把二维数组看成是一维数组的累积
        int[][] multiDimensionArray = new int[3][5];
        multiDimensionArray[2] = new int[100];
        System.out.println(multiDimensionArray.length);  // 二维数组的.length是 一维的数量,[one-Dimension][two]
        System.out.println(multiDimensionArray[1].length); //对于二维数组的每一维来说的数组的长度
    }
}
