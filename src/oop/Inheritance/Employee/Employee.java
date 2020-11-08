package oop.Inheritance.Employee;

import java.util.Arrays;

public class Employee {
    private String firstName;
    private String lastName;
    private String [] tasks;
    private Double baseSalary;
    private int percentage;


    public Employee(String firstName, String lastName, String[] tasks, int percentage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tasks = tasks;
        this.baseSalary = 1000.0;
        this.percentage = percentage;


    }

    public Double getBaseSalary(){
        return  baseSalary;
    }
    public void setBaseSalary(Double baseSalary){
        this.baseSalary = baseSalary;
    }
    public int getPercentage(){
       return percentage;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getTasks() {
        return tasks;
    }

    public void setTasks(String[] tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tasks=" + Arrays.toString(tasks) +
                '}';
    }
}
