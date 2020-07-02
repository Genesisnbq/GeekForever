package _02_Java_Object_Oriented_Programming._34_LearnMainAndSystem;

public class InvokeMain {
    public static void main(String[] args) {
        System.out.println("进入了 InvokeMain的main方法");
        LearnMain.main(args); // 类名+方法+参数就可以调用了
        System.out.println("InvokeMain的main方法执行结束");
    }
}
