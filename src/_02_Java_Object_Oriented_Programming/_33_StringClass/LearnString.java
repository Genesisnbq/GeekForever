package _02_Java_Object_Oriented_Programming._33_StringClass;

public class LearnString {
    public static void main(String[] args) {
        String content = "0123456789ABCDefghijk";
        // String 的 length() 是一个方法而不是一个属性    数组的.length是一个属性
        System.out.println(content.length());

        // 其实是生成了一个新的String对象
        System.out.println(content.toUpperCase());

        System.out.println(content.toLowerCase());

        // content 指向对象的内容没有改变
        System.out.println(content);

        System.out.println(content.charAt(1));
//        System.out.println(content.charAt(99));

        System.out.println(content.substring(5));
        System.out.println(content.substring(0)); //从第i个下标开始 包括i
        System.out.println(content.substring(0, 5)); //[0,5) == [0,4]

        String str = "     abc ";
        System.out.println(str);
        System.out.println(str.trim()); // 去掉开头的空白符
    }
}
