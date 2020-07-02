package _02_Java_Object_Oriented_Programming;

import java.util.Scanner;

public class _21_KnowReference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  所有用类创建的变量都是引用类型的变量
        Merchandise m1 = new Merchandise();
        Merchandise m2 = new Merchandise();
        Merchandise m3 = new Merchandise();
        Merchandise m4 = new Merchandise();
        Merchandise m5 = new Merchandise();

        int a = Integer.parseInt(in.nextLine());
        System.out.println(a + 19);
        //TODO 给一个引用赋值, 则两者的类型必须一样, m2 可以给 m1 赋值, 因为他们的类型一样
        m1 = m2;
        // 在java的世界中, 除了基本数据类型之外, 就是引用类型
        // 在 m1 的生命周期中, 他已经不能改变了, 他就是这么一个引用了
        m5 = m1;
        System.out.println("m1: " + m1);
        System.out.println("m2: " + m2);
        System.out.println("m3: " + m3);
        System.out.println("m4: " + m4);
        System.out.println("mt: " + m5);
    }
    // m1 不是实体本身, 而是实体在堆中的地址
}
