package _02_Java_Object_Oriented_Programming._35_LearnStringBuilder;

public class LearnStringBuilder {
    public static void main(String[] args) {
        //>> TODO StringBuilder 首先是可变的
        //>> TODO 而且对他进行操作的方法, 都会返回this自引用. 这样我们就可以一直点下去,对String进行构造
//        StringBuilder strBuilder1 = new StringBuilder("init 他可以进行重载");
        StringBuilder strBuilder = new StringBuilder();

        long longVal = 123456789;

        strBuilder.append(true).append("abc").append(longVal); //增加字符串, 可以是任何内容

        System.out.println(strBuilder.toString());
        System.out.println(strBuilder.reverse().toString());
        System.out.println(strBuilder.reverse().toString()); //倒转
        System.out.println(strBuilder.toString());

        System.out.println(strBuilder.delete(0, 4).toString());//删除 [0,3]索引的内容 [begin,end-1]

        System.out.println(strBuilder.insert(3, "LLLL").toString());

    }
}
