package _00_University_Java.MidtermTest.student;

public class Student implements Person {
    private String name;
    private int age;
    private String className;
    private static int count = 0;

    @Override
    public void speak() {
        System.out.println("说话!");
    }

    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
        count++;
    }

    public Student() {
        this("", 0, "");
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.className = student.className;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }

    public void output() {
        System.out.println("姓名: " + name + "\n年龄: " + age
                + "\n班级: " + className);
    }

    public static int getCount() {
        return count;
    }
}
