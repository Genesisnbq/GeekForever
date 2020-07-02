package _02_Java_Object_Oriented_Programming;

public class _22_KnowArrayType {
    public static void main(String[] args) {
        //TODO  "数组变量"其背后真身就是引用。 数组类型就是一种特殊的类
        //TODO  数组的大小不决定数组的类型,  数组的类型是由元素类型决定的。
        int[] intArr; // 这就是一个引用, 创建一个int类型的引用
        intArr = new int[1];
        intArr = new int[2];

        //这个数组的元素就是二维的double数组, 既double[][]
        double[][][] double3DArray = new double[10][3][4];
        int[] a1 = new int[9];
        int[] a2 = new int[0];
        a2 = a1;
        System.out.println("a2.length = " + a2.length);
        double[] a3 = new double[3];
        // a3 是double[] 类型的引用, 不能用int[]类型的引用赋值
        // a3 = a1
        int[] test1 = new int[2];
        int[][] test2 = new int[2][2];
        test2[1] = test1;
        Merchandise[] merchandises = new Merchandise[9];
        merchandises[0] = new Merchandise();
        merchandises[1] = new Merchandise();
        merchandises[0].name = "记事本";
        System.out.println(merchandises[0].name);
        System.out.println(merchandises[2]);
        // 数组元素在这个元素被创建出来之后, 会被赋予这个类型的缺省值
        // 创建引用数组, 引用数组中的每一个值, 都会赋予引用的缺省值-> null
    }
}
