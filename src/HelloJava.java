import java.util.ArrayList;
import java.util.List;

public class HelloJava {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("hello");
        a.add("world");
//        b.add("hello"); //会报错
        for (String s : a) {
            System.out.println(s);
        }
        System.out.println("NBQ test");
        System.out.println("NBQ test");
    }
}