package _00_University_Java.Bank_new.Bank;

import java.util.Scanner;

public class CreditCard extends Bank {
    private String accountName;
    private String password;
    private String phoneNum;
    private double balance;
    private double[] record;
    private int count;

    Scanner in = new Scanner(System.in);

    public CreditCard(String accountName, String password, String phoneNum,
                      int balance, double[] record, int count) {
        this.accountName = accountName;
        this.password = password;
        this.phoneNum = phoneNum;
        this.balance = balance;
        this.record = new double[100000];
        this.count = count;
    }

    public CreditCard(String bankName, String address, String contactNum,
                      String accountName, String password, String phoneNum, double balance, double[] record,
                      int count) {
        this.accountName = accountName;
        this.password = password;
        this.phoneNum = phoneNum;
        this.balance = balance;
        this.record = new double[100000];
        this.count = count;
        super.setName(bankName);
        super.setAddress(address);
        super.setContactNum(contactNum);
    }

    public CreditCard(String accountName, String password, String phoneNum, double balance, double[] record,
                      int count) {
        super("彬琪银行", "天堂一号", "10086");
    }

    public CreditCard(String accountName, String password, String phoneNum) {
        this(accountName, password, phoneNum, 0, new double[100000], 0);
    }

    public CreditCard() {
        this("测试账号", "123456", "10086", 0, new double[100000], 0);
    }

    //存钱, 取钱, 记录(第几次干了什么)
    public void saveMoney(double money) {
        balance += money;
        record[count++] = money;
    }

    public void withdrawMoney(double money) {
        System.out.println("请输入密码: ");
        String inPassword = in.nextLine();
        if (inPassword.equals(password)) {
            if (money > balance) {
                System.out.println("当前余额为: " + balance + ", 取款失败!");
                return;
            }
            balance -= money;
            record[count++] = money;
            System.out.println("您本次取款" + money + "元, 余额为: " + balance);
        } else {
            System.out.println("密码错误!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void describe() {
        System.out.println("信用卡账户: " + accountName + "\n持卡人手机: " + phoneNum
                + "\n余额: " + balance);
    }

    public void op(Bank bank, CreditCard creditCard) {
        while (true) {
            System.out.println("请输入您要进行的操作!(1.存钱 2.取钱 3.银行介绍 4.银行卡信息)");
            int op = Integer.parseInt(in.nextLine());
            double money;
            switch (op) {
                case 1:
                    System.out.println("请输入要存的钱的数量: ");
                    money = Double.parseDouble(in.nextLine());
                    creditCard.saveMoney(money);
                    System.out.println("存钱成功, 余额为: " + creditCard.getBalance());
                    break;
                case 2:
                    System.out.println("请输入要取得钱的数量");
                    money = Double.parseDouble(in.nextLine());
                    creditCard.withdrawMoney(money);
                    break;
                case 3:
                    bank.describe();
                    break;
                case 4:
                    creditCard.describe();
                    break;
                default:
                    System.out.println("很抱歉, 没有该操作! 请重新输入!");
            }
            System.out.println("是否继续操作? 1/0");
            int cur = Integer.parseInt(in.nextLine());
            if (cur != 1) {
                break;
            }
        }
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNum(String phoneNum) {
        phoneNum = phoneNum;
    }
}
