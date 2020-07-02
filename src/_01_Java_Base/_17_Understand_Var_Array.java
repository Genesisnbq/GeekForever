package _01_Java_Base;// Scanner类, 对String输入:   String a = in.nextLine();
import java.util.Scanner;

public class _17_Understand_Var_Array {
    public static void main(String[] args) {
        // 定的是变量的名字, 动的是变量的值 in.
        Scanner in = new Scanner(System.in);
//        int a;
//        a = in.nextInt();
//        System.out.println(a);
//        a = in.nextInt();
//        System.out.println(a); // 在内存上 删除这个值之后, 重新写入一个新的值
        // 要输出的时候, 计算机就会查一下 内存中 a的位置, 然后读取内容
        // 把一堆 变量码在一起, 就有了连着的 与生俱来的编号
        // 变量的名就是地址, 变量的实就是地址内存的值
        int[] book = new int[10]; // book 保存了数组第一个元素的起始地址 想一想书本, book本身和数组没有任何关系
        System.out.println(book[8]); //不是直接索引, 而是通过book 找到数组首元素的地址, 然后索引是8,就在当前地址+8
        //恍然大悟
        System.out.println(book.length); // 一个数组的长度是固定的, 不能改变了
        int[] NewBook = book;
        book[8] = 10;
        book = new int[99]; //原来的就不见了, 不能再找回了
        System.out.println(NewBook[8]);
        // 非基本类型的变量都要通过"二级跳"的方式访问
        // 基本类型的方案只要"一跳"
    }
}
