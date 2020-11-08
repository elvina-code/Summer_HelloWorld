package oop.Inheritance.StudentA;

public class CourseA {

    private String name;
    private int credits;
    private  int grades;



    public CourseA(String name, int credits, int grades) {
        this.name = name;
        this.credits = credits;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public String toString(){
        return this.name + " "+this.credits+ " " + this.grades;
    }
}


