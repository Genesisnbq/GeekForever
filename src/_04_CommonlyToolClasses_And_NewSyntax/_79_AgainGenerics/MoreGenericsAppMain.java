package _04_CommonlyToolClasses_And_NewSyntax._79_AgainGenerics;

import _04_CommonlyToolClasses_And_NewSyntax._79_AgainGenerics.ext.*;

import java.util.ArrayList;
import java.util.List;

public class MoreGenericsAppMain {
    public static void main(String[] args) {
        List<Children> g3List = new ArrayList<>();
        List<Parent> test1 = new ArrayList<>();
        List<GrandParent> test = new ArrayList<>();
        // >> TODO 这么传递参数不行, 泛型类型不管继承关系, 只管严格匹配
        // >> TODO 换句话说, Children是Parent的子类, 但是List<Children> 不是List<Parent> 的子类
//        justG2Method(test); //严格匹配, 子类和父类都不行

        //>> TODO 那么怎么办呢? 要让接收方,也就是形参, 声明为协变泛型
        extMethod(g3List);
        extMethod(test1); // 声明为协变泛型, 他本身和他的子类都可以被接受了

        //>> TODO 同样的道理, 我们也可以创建协变的引用, 让他可以接受的List 引用的泛型类型为Parent 或者其子类
        List<? extends Parent> g2ListExt = null; // 本身或者他的子类

        g2ListExt = new ArrayList<Children>();
        g2ListExt = new ArrayList<Parent>();
//        g2ListExt = new ArrayList<GrandParent>();

        //>> TODO 但是使用这个带协变泛型的引用, 我们无法让具体的类型满足其参数要求
        //>> TODO 是不是感觉世界观被震碎了, 别着急崩坏, 这都是有原因的
//        g2ListExt.add(new GrandParent());
//        g2ListExt.add(new Parent());
//        g2ListExt.add(new Children());

        //>> TODO 原因是 如果java允许了, 那么就会造成潜在的错误
        List<Children> g3OnlyList = new ArrayList<>();
        g2ListExt = g3OnlyList;

        //>> TODO 我们再看下一行, 如果允许add 一个Parent的对象, 就代表着什么?
//        g2ListExt.add(new Parent());

        // >> TODO 那就代表着, 原本只应该有Children或者其子类的g3OnlyList 引用指向的对象, 结果通过使用g2ListExt, 被放进去一个Parent的实例

        // >>TODO 除了协变, Java还有逆变, 语法如下
        //>> TODO 逆变和协变正好相反, 允许的类型为Parent或者其父类
        List<? super Parent> g2ListSup = null;  //本身或者他的父类
//        g2ListSup = new ArrayList<Children>();
        g2ListSup = new ArrayList<Parent>();
        g2ListSup = new ArrayList<GrandParent>();

        //>> TODO 但是同样的原因, 无法让具体的类型满足其参数要求, 甚至是Object;
//        g2ListExt.add(new GrandParent());
//        g2ListExt.add(new Parent());
//        g2ListExt.add(new Children());
//        g2ListExt.add(new Object());
//        g2ListSup.add(new GrandParent());

        //>> TODO 无论是协变还是逆变, 都只能用在引用上, 而不能在创建对象时, 使用其作为泛型参数
//        List<? extends Parent> g2ListExt11 = new ArrayList<? extends Parent>();
//        List<? super Parent> g2ListSup11 = new ArrayList<? super Parent>();

    }

    //>> TODO 协变语法如下, 意思时这个参数可以接受的List引用的泛型类型为 Parent 或者其子类
    public static void justG2Method(List<Parent> extParam) {
    }

    public static void extMethod(List<? extends Parent> extParam) {

    }

    public static void supMethod(List<? super Parent> extParam) {
    }
}
