package _02_Java_Object_Oriented_Programming._55_Interface.MyTest;

public interface test {
    // public abstract

    /**
     * 返回一个String类型的字符串
     *
     * @return
     */
    String toString();

    /**
     * 返回一个String类型的字符串
     *
     * @param n
     * @return
     */
    String toString(String n);

    /**
     * 保质期
     * public static final 可以省略
     */
    int shelfLife = 12;
}
