package _00_University_Java;

import java.util.Scanner;


public class Student {
    public String name;
    public int id;
    Scanner in = new Scanner(System.in);

    public void set(String name, int num) {
        this.name = name;
        this.id = num;
    }

    public void set(int num) {
        this.id = num;
        this.name = null;
    }

    public void set() {
        this.id = 0;
        this.name = null;
    }

    public void getId() {
        System.out.println(this.id);
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void output() {
        System.out.println(this.name + " " + this.id);
    }
}
