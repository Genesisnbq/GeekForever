package _00_University_Java.MidtermTest;

import _00_University_Java.MidtermTest.student.*;

public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("倪彬琪", 20, "计科18104");
        Student student3 = new Student(student2);
        student1.output();
        System.out.println(student1.getCount());
        System.out.println("-----------------");
        student2.output();
        System.out.println(student2.getCount());
        System.out.println("-----------------");
        student3.output();
        System.out.println(student3.getCount());
        System.out.println("-----------------");
        CollageStudent collageStudent = new CollageStudent("倪彬琪", 20, "计科18104",
                "计算机科学与技术");
        collageStudent.output();
    }
}
