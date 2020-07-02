package _00_Algorithm;

import java.util.Scanner;

public class _00_日期计算器_递归 {
    static int year, month, day;
    static int x;

    public static boolean isLeap() {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int calcMonth() {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeap()) return 29;
                return 28;
            default:
                return 30;
        }
    }

    public static void calc(int x) {
        int surplus = calcMonth() - day;
        if (surplus >= x) {
            System.out.println(year + " " + month + " " + (day + x));
            return;
        }
        x -= surplus;
        day = 0;
        month++;
        if (month > 12) {
            year++;
            month = 1;
        }
        calc(x);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the date!");
        year = in.nextInt();
        month = in.nextInt();
        day = in.nextInt();
        System.out.println("Please enter the number of days!");
        x = in.nextInt();
        calc(x);
    }
}
