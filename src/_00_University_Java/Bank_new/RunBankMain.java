package _00_University_Java.Bank_new;

import _00_University_Java.Bank_new.Bank.*;

import java.util.Scanner;

public class RunBankMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bank bank = new Bank("彬琪银行", "天堂路1号", "+86 17681533618");
        CreditCard creditCard = new CreditCard();
        bank.welcome();
        bank.first(bank, creditCard);
        creditCard.op(bank, creditCard);
        System.out.println("欢迎下次光临!");
    }
}
