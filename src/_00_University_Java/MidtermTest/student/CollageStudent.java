package _00_University_Java.MidtermTest.student;

public class CollageStudent extends Student {
    private String major;

    public CollageStudent(String name, int age, String className, String major) {
        super(name, age, className);
        this.major = major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return this.major;
    }

    public void output() {
        System.out.println("姓名: " + super.getName() + "\n年龄: " + super.getAge()
                + "\n班级: " + super.getClassName() + "\n专业: " + major);
    }

    public void speak() {
        System.out.println("学生说的外语是英语");
    }

}
