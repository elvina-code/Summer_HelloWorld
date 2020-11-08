package oop.Inheritance.StudentA;

import java.util.ArrayList;

public class StudentA {

    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<CourseA> courses = new ArrayList<>();
    private int numberOfcourses;

    public StudentA(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.numberOfcourses = this.courses.size();
    }

    public void addCourse(CourseA course) {
        this.courses.add(course);
        this.numberOfcourses++;
    }

    public void removeCourse(CourseA course){
        this.courses.remove(course);
        this.numberOfcourses--;
    }

    public void updateGrade(CourseA course, int grade){
        for (CourseA c: this.courses) {
            if (c.equals(course)){
                course.setGrades(grade);
            }
        }
    }

    public Double calculateGradeAverage(){
        int sum = 0;
        for (CourseA c: this.courses){
            sum += c.getGrades();
        }
        return (double) sum / (double) this.numberOfcourses;
    }

    public String toString(){
        String result = this.firstName + " "+this.lastName+" "+this.email + "\n";
        for (CourseA c: this.courses)
            result += c.toString()+"\n";

        return result;
    }

}

