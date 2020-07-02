package _02_Java_Object_Oriented_Programming._33_StringClass;

public class LearnString2 {
    public static void main(String[] args) {
        String content = "Orange_Apple_Banana";

        char[] chars = content.toCharArray();  // 转换成字符数组
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        System.out.println("------------------------------");
        String sp = "_";
        String[] s = content.split(sp); // 以 "_" 作为分割符
        for (String value : s) {
            System.out.println(value); // s[0]="Orange" s[1] ="Apple" s[2] = "Banana";
        }

        System.out.println("------------------------------");

        int indexOf = content.indexOf('_'); // 第一次出现在这个字符串中的位置
        System.out.println(indexOf);
        System.out.println(content.substring(indexOf + 1, content.length()));

        System.out.println("------------------------------");

        int lastIndexOf = content.lastIndexOf("_"); // 从后往前找第一次出现的位置
        System.out.println(lastIndexOf);
        System.out.println(content.substring(0, lastIndexOf));

        System.out.println("------------------------------");

        System.out.println(content.contains("apple"));
        System.out.println(content.contains("Apple"));
        System.out.println(content.startsWith("Orange"));
        System.out.println(content.endsWith("Banana"));

        System.out.println("------------------------------");

        String content2 = "Orange_Apple_Banana";
        String content3 = "   orange_Apple_banana   ";

        // TODO 两个String对象比较是否相等，一定要用equals方法
        System.out.println(content.equals(content2));

        System.out.println(content.equals(content3));

        System.out.println(content.equalsIgnoreCase(content3.trim()));

    }
}
