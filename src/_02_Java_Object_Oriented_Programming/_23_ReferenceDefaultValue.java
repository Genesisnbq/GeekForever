package _02_Java_Object_Oriented_Programming;

public class _23_ReferenceDefaultValue {
    public static void main(String[] args) {
        // 数组在创建出来之后,  会按照类型给数组中的每个元素赋缺省值
        // 引用类型的缺省值是 null
        Merchandise[] merchandises = new Merchandise[9];
        // 给索引为偶数的引用赋值
        for (int i = 0; i < merchandises.length; i++) {
            if (i % 2 == 0) {
                // todo 引用的实例没有指向对象, 就是一个 null
                merchandises[i] = new Merchandise();
            }
        }
//        merchandises[7].name = "不存在地商品, 不存在的名字"; //todo 不合法, 没有引用 Merchandise()
        // 依次输出数组的值
        for (int i = 0; i < merchandises.length; i++) {
            System.out.println(merchandises[i]);
        }
        System.out.println("******************************");
        for (int i = 0; i < merchandises.length; i++) {
            if (i % 2 == 0) {
                Merchandise m = merchandises[i];
                System.out.println(m.price);
                System.out.println(m.count);
                System.out.println(m.name);
                System.out.println(m.id);
            }
        }
        for (int i = 0; i < merchandises.length; i++) {
            if (merchandises[i] != null) {
                System.out.println(i + " " + merchandises[i].name);
            }
        }
    }
}
