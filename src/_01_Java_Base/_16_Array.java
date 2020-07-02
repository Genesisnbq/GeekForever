package _01_Java_Base;

public class _16_Array {
    public static void main(String[] args) {
        int[] a = new int[10]; // 数据类型[] 变量名 = new 数据类型[大小]
        double[] doubleArray = new double[10]; // new的意思是创建的意思 不是新
        System.out.println(a[9]);
        for (int i = 0; i < 10; i++) System.out.printf(doubleArray[i] + " ");
        System.out.println("");
        //每门成绩对应的索引
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
        for (int i = 0; i < 6; i++) System.out.printf(ScoreNames[i] + " ");
        System.out.println("");
        int[] Score = new int[6];
        int Max_Score = 0;
        for (int i = 0; i < 6; i++) {
            Score[i] = 80 + (int) (Math.random() * 21);
            System.out.println(ScoreNames[i] + "的分数是: " + Score[i]);
            if (Max_Score < Score[i]) Max_Score = Score[i];
        }
        System.out.println("最高分是: " + Max_Score);
    }
}

