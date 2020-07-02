package _00_University_Java;

public class Student_Main {
    public static void main(String[] args){
//        Student student = new Student();
//        student.set("倪彬琪",45418225);
//        student.output();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.set("张三",1);
        s2.set(2);
        s3.set(0);
        s1.set("倪彬琪",45418225);
        s1.output();
        s2.output();
        s3.output();
        s1.getId();
        s1.getName();

    }
}
