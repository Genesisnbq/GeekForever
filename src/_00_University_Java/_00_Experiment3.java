package _00_University_Java;

import java.util.Scanner;
import java.util.Arrays;

public class _00_Experiment3 {
    public static void main(String[] args) {
        /* 1）统计班级中某学生的平均成绩。
           2）某门课程的最高分、平均分。
           3）对班级中每位学生的成绩进行排序。
           4）根据评三好学生或优秀班干部的条件输入学生成绩，判断该生是否能够被评为三好学生或优秀班干部。
           5）随机选取5名同学，进行姓名的输出（类似于云班课中的随机选人）。
        */
        Scanner in = new Scanner(System.in);
        String[] LastName = {"倪", "王", "刘", "李",
                "蒋", "沈", "许", "范", "云", "龙", "余", "吕", "苏", "高",
                "谢", "柳", "徐", "赵", "罗", "史", "尹", "毛", "黄", "殷",
                "韦", "杜", "阮", "项", "邱", "万", "孟", "丁", "朱", "田", "孔"};//.length
        String[] FirstName = {"彬琪", "小峰", "成效", "凯", "杰",
                "浩", "冠翔", "娟", "诗倩", "卫英", "月明", "飞",
                "丹阳", "海涛", "月春", "官森", "南山", "澈", "晨曦",
                "志宇", "成宁", "浩聪", "俊春", "云华", "思举", "兴旭",
                "秋浩", "紫凝", "康文", "晨文"};
        String[] names = new String[30];
        for (int i = 0; i < 30; i++) {
            names[i] = LastName[(int) (Math.random() * LastName.length)];
            names[i] += FirstName[(int) (Math.random() * FirstName.length)];
//            System.out.println(names[i]);
        }
        String[] scoreNames = {"Java", "高数", "大英", "Web网页设计", "软件工程", "Linux"};
        int[][] score = new int[30][6]; //假定班级有30人,6门成绩
        int rangeStart = 60;
        int rangeEnd = 100;
        int mod = rangeEnd - rangeStart;
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 6; j++) {
                score[i][j] = (int) (Math.random() * mod) + rangeStart + 1;//60-100
            }
        }
        while (true) {
            System.out.println("请输入对应的操作: \n1.班级中某学生的平均成绩\n2.某门课程的最高分\n" +
                    "3.对班级中某位学生的成绩进行排序\n" + "4.输入三好学生的成绩范围，判断该生是否能够被评为三好学生\n" +
                    "5.随机抽取5名同学,将姓名输出");
            int op = in.nextInt();
            int sum = 0;
            switch (op) {
                case 1:
                    System.out.print("请输入班级中某学生的学号: ");
                    int id = in.nextInt();//1-30   0-29
                    System.out.println("开始计算" + names[id - 1] + "的平均成绩!");
                    for (int i = 0; i < 6; i++) {
                        sum += score[id - 1][i];
                    }
                    System.out.println(names[id - 1] + "的平均成绩为: " + ((double) sum / 6));
                    break;
                case 2:
                    System.out.println("请输入课程名: (Java,高数,大英,Web网页设计,软件工程,Linux)");
                    int course_id = 0;
                    String course = in.next();
                    for (int i = 0; i < 6; i++) {
                        if (scoreNames[i].equals(course)) {
                            course_id = i;
                            break;
                        }
                    }
                    int max_score = 0;
                    int mark_name = 0;
                    for (int i = 0; i < 30; i++) {
                        if (max_score < score[i][course_id]) {
                            max_score = score[i][course_id];
                            mark_name = i;
                        }
                    }
                    System.out.println(scoreNames[course_id] + "的最高分是" + names[mark_name] + ", " +
                            "分数为" + max_score + "分");
                    break;
                case 3:
                    System.out.print("请输入学生编号(1-30): ");
                    int StudentId = in.nextInt();
                    Arrays.sort(score[StudentId - 1]);
                    System.out.println(names[StudentId - 1] + "的成绩排序后为: ");
                    for (int i = 0; i < 6; i++) System.out.printf("%d ", score[StudentId - 1][i]);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("请输入评三好学生的条件: (m门课大于等于n分,请输入m,n)");
                    System.out.print("请输入m: ");
                    int m = in.nextInt();
                    System.out.print("请输入n: ");
                    int n = in.nextInt();
                    System.out.print("可以评选为三好学生的同学有: ");
                    for (int i = 0; i < 30; i++) {
                        int count_score = 0;
                        for (int j = 0; j < 6; j++) {
                            if (score[i][j] >= n) count_score++;
                        }
                        if (count_score >= m) System.out.print(names[i] + " ");
                    }
                    System.out.println("");
                    break;
                case 5://随机抽取5名同学,输出姓名 0-29
                    System.out.print("请这5名同学发言: ");
                    boolean[] st = new boolean[100];
                    boolean judge = true;
                    while (judge) {
                        int[] num = new int[5];
                        int count = 0;
                        for (int i = 0; i < 5; i++) {
                            int temp = (int) (Math.random() * 29) + 1;
                            if (!st[temp]) {
                                st[temp] = true;
                                judge = false;
                                num[count++] = temp;
                            } else {
                                judge = true;
                            }
                            if (count == 5) {
                                for (int z = 0; z < 5; z++) {
                                    System.out.printf("%s ", names[z]);
                                }
                            }
                        }
                    }
                    break;
            }
            System.out.println("");
            System.out.println("是否继续? 输入 q 退出, 输入其他继续!");
            String op_finally = in.next();
            if (op_finally.equals("q")) break;
        }
    }
}