package _04_CommonlyToolClasses_And_NewSyntax._78_GenericsInJava.learngenericsPart1.ext;

public class GrandParent {
    private int num;

    public GrandParent(int num) {
        this.num = num;
    }

    public GrandParent() {
        this(-1);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
