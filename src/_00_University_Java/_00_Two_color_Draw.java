package _00_University_Java;// 游戏:
// 双色球彩票投注区分为 [红色球号码区] 和 [蓝色球号码区]
// 双色球每注号码由 6个红色球号码和一个蓝色球号码组成, 红色球从1-33选择, 蓝色球从1-16中选择
// 双色球每注 2元
// 双色球采取全国统一奖池计奖
// 双色球每周销售三期, 期号以开奖日界定, 按日历年度编排
// 投注:
// 方法分为自选和机选, 由单式投注和复式投注
// todo 自选是指投注者自己选择号码进行投注
// todo 机选号码是指由投注机随机产生投注号码进行投注
// 单式投注指从红色号码中选择6个号码, 从蓝色中选择1个号码,组合为一组进行投注
// 复式:
//     1.红色号码复式: 从红色中选择7-20个号码, 从蓝色号码中选择1个, 组合为一注
//     2.蓝色号码复式: 从红色号码中选择6个号码, 从蓝色中选择2-16个号码, 组合多注号码的投注
//     3.全复式: 从红色中选择7-20个, 从蓝色中选择2-16个号码, 组合成多注投注号码的投注
//开奖:
//     1.先摇出6个红色号码, 再摇出一个蓝色号码, 对红色号码进行排序, 然后和蓝色号码一起公布(号码不能重复)
//     2.一周开奖三次, 蓝色球可能和红色球的颜色一样
// 一等奖: 7个 (6红, 1蓝)相同, 红色顺序不限
// 二等奖: 6个红色号码相同
// 三等奖: 5个红色号码和1个蓝色号码相同
// 四等奖: 5个红色号码相同, 或者4个号码和1个蓝色号码
// 五等奖: 4个红色号码或 3个红色号码和 1蓝
// 六等奖: 1个蓝色号码相同(红色有没有都无所谓)

import java.util.Scanner;
import java.util.Arrays;

public class _00_Two_color_Draw {
    public static void main(String[] args) {
        System.out.println("欢迎购买双色球!");
        System.out.println("目前只能单式投注, 复式的介绍没有看懂.....");
        System.out.println("规则是选择6个红色号码,不能重复  然后选择一个蓝色号码\n" +
                "红色从1-33中选择, 蓝色从1-16中选择");
        System.out.println("请输入选项: 1自选 2机选");
        Scanner in = new Scanner(System.in);
        boolean judge = true;
        int op_select = 0; //TODO java中要记得初始化(苦逼脸)
        while (judge) {
            op_select = in.nextInt();
            if (op_select < 1 || op_select > 2) {
                System.out.println("没有此选项, 请重新输入!");
            } else judge = false;
        }
        int[] redNumber = new int[6];
        int blueNumber = 0; // 初始化
        judge = true;
        switch (op_select) {
            case 1:
                System.out.println("请从1-33中选择6个红色号码的编号");
                while (judge) {
                    int[] st = new int[1000000];
                    boolean cur = false;
                    for (int i = 0; i < 6; i++) {
                        redNumber[i] = in.nextInt();
                        st[redNumber[i]]++;
                    }
                    for (int i = 1; i <= 33; i++) {
                        if (st[i] > 1) {
                            System.out.println("编号重复了, 请重新输入6个编号!");
                            cur = true;
                            break;
                        }
                    }
                    if (!cur) judge = false;
                }
                System.out.println("请从1-16号中选择一个蓝色球!");
                while (true) {
                    blueNumber = in.nextInt();
                    if (blueNumber < 1 || blueNumber > 16) {
                        System.out.println("编号不存在, 请重新输入!");
                    } else break;
                }//redNumber[] 和 blueNumber
                for (int count = 0; count < 3; count++) { //一周三次
                    int[] stdredNumber = new int[6];
                    int stdblueNumber = (int) (Math.random() * 16) + 1;//[1,16];
                    boolean[] std_st = new boolean[34]; //false
                    for (int i = 0; i < 6; i++) {
                        while (true) {
                            stdredNumber[i] = (int) (Math.random() * 33) + 1;
                            if (!std_st[stdredNumber[i]]) {
                                std_st[stdredNumber[i]] = true;
                                break;
                            }
                        }
                    }
                    Arrays.sort(stdredNumber);
                    System.out.println("本周第" + (count + 1) + "次开奖啦!");
                    System.out.println("红色为: ");
                    for (int i = 0; i < 6; i++) {
                        System.out.printf("%d ", stdredNumber[i]);
                    }
                    System.out.println("\n蓝色为:" + stdblueNumber);
                    int countRed = 0, countBlue = 0;
                    for (int i = 0; i < 6; i++)
                        for (int j = 0; j < 6; j++) {
                            if (redNumber[i] == stdredNumber[j]) countRed++;
                        }
                    System.out.println("您的号码为:\n红:");
                    for (int i = 0; i < 6; i++) {
                        System.out.printf("%d ", redNumber[i]);
                    }
                    System.out.println("\n蓝:");
                    System.out.println(blueNumber);
                    if (stdblueNumber == blueNumber) countBlue++;
                    if (countBlue == 1 && countRed == 6) {
                        System.out.println("恭喜你在本周第" + (count + 1) + "次开奖中获得了一等奖!");
                    } else if (countRed == 6) {
                        System.out.println("恭喜你在本周第" + (count + 1) + "次开奖中获得了二等奖!");
                    } else if (countRed == 5 && countBlue == 1) {
                        System.out.println("恭喜你在本周第" + (count + 1) + "次开奖中获得了三等奖!");
                    } else if (countRed == 5 || (countRed == 4 && countBlue == 1)) {
                        System.out.println("恭喜你在本周第" + (count + 1) + "次开奖中获得了四等奖!");
                    } else if (countRed == 4 || (countRed == 3 && countBlue == 1)) {
                        System.out.println("恭喜你在本周第" + (count + 1) + "次开奖中获得了五等奖!");
                    } else if (countBlue == 1) {
                        System.out.println("恭喜你在本周第" + (count + 1) + "次开奖中获得了六等奖!");
                    } else {
                        System.out.println("很遗憾你在本周第" + (count + 1) + "次开奖中没有获奖,请在再接再励!");
                    }
                }
                break;
            case 2:
                System.out.println("系统为您生成!");
                boolean[] _st = new boolean[34]; //false
                for (int i = 0; i < 6; i++) {
                    while (true) {
                        redNumber[i] = (int) (Math.random() * 33) + 1;
                        if (!_st[redNumber[i]]) {
                            _st[redNumber[i]] = true;
                            break;
                        }
                    }
                }
                blueNumber = (int) (Math.random() * 16) + 1;
                System.out.println("系统为您生成的是:");
                System.out.println("红: ");
                for (int i = 0; i < 6; i++) {
                    System.out.printf("%d ", redNumber[i]);
                }
                System.out.println("\n蓝: " + blueNumber);
                for (int count = 0; count < 3; count++) { //一周三次
                    int[] stdredNumber = new int[6];
                    int stdblueNumber = (int) (Math.random() * 16) + 1;//[1,16];
                    boolean[] std_st = new boolean[34]; //false
                    for (int i = 0; i < 6; i++) {
                        while (true) {
                            stdredNumber[i] = (int) (Math.random() * 33) + 1;
                            if (!std_st[stdredNumber[i]]) {
                                std_st[stdredNumber[i]] = true;
                                break;
                            }
                        }
                    }
                    Arrays.sort(stdredNumber);
                    System.out.println("本周第" + (count + 1) + "次开奖啦!");
                    System.out.println("红色为: ");
                    for (int i = 0; i < 6; i++) {
                        System.out.printf("%d ", stdredNumber[i]);
                    }
                    System.out.println("\n蓝色为:" + stdblueNumber);
                    int countRed = 0, countBlue = 0;
                    for (int i = 0; i < 6; i++)
                        for (int j = 0; j < 6; j++) {
                            if (redNumber[i] == stdredNumber[j]) countRed++;
                        }
                    System.out.println("您的号码为:\n红:");
                    for (int i = 0; i < 6; i++) {
                        System.out.printf("%d ", redNumber[i]);
                    }
                    System.out.println("\n蓝:" + blueNumber);
                    if (stdblueNumber == blueNumber) countBlue++;
                    if (countBlue == 1 && countRed == 6) {
                        System.out.println("恭喜你在本周第" + (count + 1) + "次开奖中获得了一等奖!");
                    } else if (countRed == 6) {
                        System.out.println("恭喜你在本周第" + (count + 1) + "次开奖中获得了二等奖!");
                    } else if (countRed == 5 && countBlue == 1) {
                        System.out.println("恭喜你在本周第" + (count + 1) + "次开奖中获得了三等奖!");
                    } else if (countRed == 5 || (countRed == 4 && countBlue == 1)) {
                        System.out.println("恭喜你在本周第" + (count + 1) + "次开奖中获得了四等奖!");
                    } else if (countRed == 4 || (countRed == 3 && countBlue == 1)) {
                        System.out.println("恭喜你在本周第" + (count + 1) + "次开奖中获得了五等奖!");
                    } else if (countBlue == 1) {
                        System.out.println("恭喜你在本周第" + (count + 1) + "次开奖中获得了六等奖!");
                    } else {
                        System.out.println("很遗憾你在本周第" + (count + 1) + "次开奖中没有获奖,请在再接再励!");
                    }
                }
                break;
        }
    }
}
