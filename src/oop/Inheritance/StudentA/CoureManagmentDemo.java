package oop.Inheritance.StudentA;

public class CoureManagmentDemo {
    public static void main(String[] args) {
        StudentA john = new StudentA("John", "Smith", "john_smith@gmail.com");
        CourseA courseJava =new CourseA("Java Programming", 9, 0);
        CourseA courseSoftSkills = new CourseA("Soft Skills", 3, 0);
        CourseA courseTools = new CourseA("Tools", 3, 0);

        john.addCourse(courseJava);
        john.addCourse(courseSoftSkills);
        john.addCourse(courseTools);

        System.out.println(john);

        john.updateGrade(courseJava, 95);
        john.updateGrade(courseSoftSkills, 50);
        john.updateGrade(courseTools, 45);

        System.out.println(john);

        System.out.println("Average is "+john.calculateGradeAverage());
    }
    }

