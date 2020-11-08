package oop.Inheritance;

public class StudentAdminDriver {
    public static void main(String[] args) {
        HighAchiever johnDoe = new HighAchiever("John", 12, 4.9);
        System.out.println(johnDoe.getName() + " " + johnDoe.getRollNo());
        System.out.println(johnDoe.getGpa());

        Student student = new Student("Elon", 3);
        System.out.println(student.getName() + " " + student.getRollNo());


    }
}
