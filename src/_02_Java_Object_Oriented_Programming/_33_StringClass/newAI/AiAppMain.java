package _02_Java_Object_Oriented_Programming._33_StringClass.newAI;

import java.util.Scanner;

public class AiAppMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Ai ai = new Ai();
        while (true) {
            String input = in.next();
            if ("exit".equals(input)) {
                System.out.println("再见! ");
                break;
            }
            String answer = ai.answer(input);
            System.out.println(answer);
        }
    }
}
