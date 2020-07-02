package _01_Java_Base;

public class _13_Switch {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++)
            switch (i) {
                case 1:
                    System.out.println("一");
                    break;
                case 2:
                    System.out.println('二');
                    break;
                case 3:
                    System.out.println('三');
                    break;
                case 4:
                    System.out.println('四');
                    break;
                default:
                    break;
            }
        // 在合适的地方一定要使用 break
        char ch = 'z';
        switch (ch) {
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            default:
                System.out.println("None");
        }
    }
}