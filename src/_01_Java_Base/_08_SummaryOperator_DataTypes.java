package _01_Java_Base;

public class _08_SummaryOperator_DataTypes {
    public static void main(String[] args) {
        // 自增和自减操作符 ++ --
        // 打印26个连续的字符
        char ch = 'a';
        int num = ch;
        for (int i = 0; i < 26; i++)
            System.out.println(num + "\t" + (char) (num++));

        // 找 10到100 有多少个数可以整除4
        int divisor = 4;
        for (int i = 10; i <= 100; i++)
            if (i % divisor == 0) System.out.println(i);

        //布尔运算: ==
    }
}
