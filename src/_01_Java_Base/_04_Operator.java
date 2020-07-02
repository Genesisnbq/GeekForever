package _01_Java_Base;

public class _04_Operator {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num % 2);
        // 取模正数或是负数不会影响 结果的正负
        System.out.println(num % -3);
        int a = -10;
        System.out.println(a % -3);
        // 除法
        // 只要任意有一个是浮点数, 那么答案就会变成浮点数
        //比较运算符:  > <  == != >= <=
        //布尔运算符: ! &  && | ||
        // | 与 || 的区别
        boolean b = true;
        System.out.println(b || (10 / 0 > 1)); // || 只要前面为 true, 后面就不会进行计算了
        System.out.println(b | (10 / 0 > 1)); // 单个的 | 会算后面的
        //在老师十几年的工作经历中, 建议以后使用 && ||

        // 优先级
        // 为什么等号的优先级最低? 因为要左右计算出来后, 才能出结果
        // 为什么布尔运算符的优先级低于比较运算符?  因为除了自己输入true或者false 还有比较才能出boolean
        // 为什么比较运算符的优先级比算数运算符的优先级低? 因为比较运算符的进行比较的值, 是通过算数运算符计算出来的
    }
}
