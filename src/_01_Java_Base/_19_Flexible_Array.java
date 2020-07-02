package _01_Java_Base;

import java.util.Scanner;

public class _19_Flexible_Array {
    public static void main(String[] args) {
        // 求某年最好成绩
        // 求某年平均成绩
        // 求所有年份最好成绩
        // 求某门课历年最好成绩
        String[] ScoreNames = {"语文", "数学", "英语", "历史", "物理", "生物"};
        Scanner in = new Scanner(System.in);
        System.out.println("请输入共有多少年的成绩");
        int count_year = in.nextInt();
        int count_course = 6;
        int[][] record = new int[count_year][count_course];
        int year = 0;
        for (int i = 0; i < count_year; i++)
            for (int j = 0; j < count_course; j++) {
                record[i][j] = (int) (Math.random() * 21) + 80;
            }
        boolean run = true;
        while (run) {
            System.out.println("☆请输入需要进行的操作编号");
            System.out.println("1: 求某年最好成绩\n" + "2: 求某年平均成绩\n" +
                    "3: 求所有年份中的最好成绩\n" + "4: 求某门课历年最好成绩");
            int option = in.nextInt();
            switch (option) { // 在switch 中声明的变量, 在其他case中不能使用,也不能再次声明
                case 1:
                    int max_score = 0;
                    System.out.println("请输入要求哪一年的最好成绩");
                    year = in.nextInt();
                    if (year < 1 || year > count_year) {
                        System.out.println("年份超限, 请重新输入!");
                        break;
                    }
                    int cur = 0;
                    for (int i = 0; i < count_course; i++) {
                        if (max_score < record[year][i]) {
                            max_score = record[year][i];
                            cur = i;
                        }
                    }
                    System.out.println("第" + year + "年的最好成绩是: " + max_score + "(" + ScoreNames[cur] + ")");
                    break;
                case 2:
                    System.out.println("请输入要求哪一年的平均成绩");
                    year = in.nextInt();
                    if (year < 1 || year > count_year) {
                        System.out.println("年份超限, 请重新输入!");
                        break;
                    }
                    int sum = 0;
                    for (int i = 0; i < count_course; i++)
                        sum += record[year][i];
                    double average = ((double) sum / 6.0);
                    System.out.println("第" + year + "年的平均成绩是: " + average);
                    break;
                case 3:
                    int ms = 0;
                    int course = 0;
                    for (int i = 0; i < count_year; i++)
                        for (int j = 0; j < count_course; j++) {
                            if (ms < record[i][j]) ms = record[i][j];
                        } //找出最大成绩
                    for (int i = 0; i < count_year; i++)
                        for (int j = 0; j < count_course; j++) {
                            if (record[i][j] == ms) {
                                System.out.println("第" + i + "年的" + ScoreNames[j] + "成绩" + ms + "分是最高分");
                            }
                        }
                    break;
                case 4://某门课历年最好成绩
                    System.out.println("请输入课程号: 语文1, 数学2, 英语3, 历史4, 物理5, 生物6");
                    int course_id = in.nextInt();
                    if (course_id < 1 || course_id > 6) System.out.println("课程号不存在!");
                    int big = 0;
                    for (int i = 0; i < count_year; i++) {
                        if (big < record[i][course_id - 1]) big = record[i][course_id - 1];
                    }
                    System.out.println("历年最高的" + ScoreNames[course_id - 1] + "成绩是" + big);
                    break;
                default:
                    System.out.println("程序结束");
                    run = false;
            }
        }
    }
}
