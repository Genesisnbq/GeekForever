package _00_University_Java;

import java.util.Scanner;

public class _00_Experiment2 {
    public static void main(String[] args) {
        // 石头剪刀布
        Scanner in = new Scanner(System.in);
        int User1Win = 0, User2Win = 0;
        System.out.println("石头剪刀布游戏开始啦!");
        String[] record = {"剪刀", "石头", "布"};
        String UserOp = "";
        while (true) {
            System.out.println("请玩家先出拳! 请输入 石头,剪刀,布(三者之一)");
            System.out.print("玩家: ");
            UserOp = in.nextLine();
            int ComputerOp = 0;
            ComputerOp = (int) (Math.random() * 3);// 0-2
            System.out.printf("电脑: %s\n", record[ComputerOp]);
            int UserOpNum = 0;
            for (int i = 0; i < 3; i++) {
                if (UserOp.equals(record[i])) {
                    UserOpNum = i;
//                    System.out.println(i);
                    break;
                }
            }
            if (((UserOpNum - ComputerOp + 4) % 3 - 1) < 0) {//记住
                User2Win++;
                System.out.println("电脑获胜一局,当前胜场:" + User1Win + ":" + User2Win);
            } else if (((UserOpNum - ComputerOp + 4) % 3 - 1) == 0) {
                System.out.println("平局");
            } else {
                User1Win++;
                System.out.println("玩家获胜一局,当前胜场:" + User1Win + ":" + User2Win);
            }
            if (User1Win > 1) {
                System.out.println("玩家获胜!");
                break;
            }
            if (User2Win > 1) {
                System.out.println("电脑获胜!");
                break;
            }
        }
    }
}
