package _01_Java_Base;

// 字符编码和字符集
public class _07_Charset_Encoding {
    public static void main(String[] args) {
        // 每一个字符都是数字 数字是通过编码来一个一个映射到字符的
        // char 在java中占用 2个byte, 因为java的编码是 UTF-16
        // /uXXXXX unicode编码对应的字符
        char name = '倪';
        int name_to_int = name;
        System.out.println(name_to_int);
        //  字符串的"加法"(拼接)
        char a = '倪';
        char b = '彬';
        char c = '琪';
        System.out.println("a+b+c= " + a + b + c);
        System.out.println("a+b+c= " + (a + b + c)); // 使用括号, 或者 像* 这种优先级高于+的
        System.out.println("hello" + " " + "world" + "!");
        System.out.println("姓: " + a);
        System.out.println("a+b+c=" + (a + b + c)); //带括号就先进行加法, 输出的是数值

        System.out.println("****************************");

        int test = 10;
        String str = "test的值是: ";
        System.out.println(str);
        System.out.println(str + test);  //str 本身没有改变

    }
}
