package _01_Java_Base;

public class _11_CodeBlock {
    public static void main(String[] args) {
        String line = ""; //初始化
        for (int i = 1; i <= 9; i++)
            for (int j = 1; j <= i; j++) {
                line += j + "*" + i + "=" + i * j + '\t';
                if (j == i) line += '\n';
            }
        System.out.println(line);
    }
    // 代码块的作用域(命名空间)
    // 同一代码块中, 变量名不能重复
}
