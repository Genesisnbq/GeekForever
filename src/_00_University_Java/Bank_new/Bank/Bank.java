package _00_University_Java.Bank_new.Bank;

import java.util.Scanner;

public class Bank {
    private String bankName;
    private String address;
    private String contactNum;

    Scanner in = new Scanner(System.in);

    public Bank(String bankName, String address, String contactNum) {
        this.bankName = bankName;
        this.address = address;
        this.contactNum = contactNum;
    }

    public Bank() {
        this("无名", "天堂1号", "10086");
    }

    public void describe() {
        System.out.println("银行名称是: " + bankName + "\n地址: " + address +
                "\n联系电话: " + contactNum);
    }

    public void welcome() {
        System.out.println("欢迎来到" + bankName);
    }

    public void getName() {
        System.out.println(bankName);
    }

    public void getAddress() {
        System.out.println(address);
    }

    public void getContactNum() {
        System.out.println(contactNum);
    }

    public String inPassword() {
        String password;
        while (true) {
            System.out.println("请输入密码: ");
            password = in.nextLine();
            System.out.println("请再次输入密码: ");
            String password2 = in.nextLine();
            if (password.equals(password2)) {
                return password;
            } else {
                System.out.println("很抱歉, 两次密码不同, 请重新输入");
            }
        }
    }

    public void toulan(CreditCard creditCard, String account, String password, String phoneNum) {
        creditCard.setAccountName(account);
        creditCard.setPassword(password);
        creditCard.setPhoneNum(phoneNum);
    }

    public void first(Bank bank, CreditCard creditCard) {
        System.out.println("请先开户!");
        String account;
        String password;
        String phoneNum;
        System.out.println("请输入账户名: ");
        account = in.nextLine();
        password = bank.inPassword();
        System.out.println("请输入手机号: ");
        phoneNum = in.nextLine();
        bank.toulan(creditCard, account, password, phoneNum);
    }

    public void setName(String bankName) {
        this.bankName = bankName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
}
