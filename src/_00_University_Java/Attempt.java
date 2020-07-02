package _00_University_Java;

import java.util.Scanner;

public class Attempt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "aaa";
        String b = "ccc";// [1,2)   'a' 97   'A' 65   'b' 98
//        System.out.println(a.substring(4,6)); // 从索引为1到最后 aaiiiii
        System.out.println(a.compareTo(b)); // 5
        //>>TODO 1. 如果字符串长度相等, 就找到第一个不一样的[字符对], 然后返回ASCII码的差值
        //>>TODO 2. 如果字符串长度不相等, 在可比较的长度中(min(a.length,b.length))发现有不同的字符对, 就返回字符对的差值
        //  TODO                       在可比较的长度中,没有发现不同的字符对, 就返回 字符串长度的差值(abs(a.length-b.length))
    }
}