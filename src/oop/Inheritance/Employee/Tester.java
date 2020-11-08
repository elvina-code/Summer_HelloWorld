package oop.Inheritance.Employee;

import oop.Inheritance.Employee.Employee;

public class Tester extends Employee {

    private String SeleniumVersion = "2.3.x";

    public String getSeleniumVersion() {
        return SeleniumVersion;
    }

    public void setSeleniumVersion(String seleniumVersion) {
        SeleniumVersion = seleniumVersion;
    }








    //    private final int PERCENTAGE = 25;
//
    public Tester(String firstName, String lastName, String[] tasks) {
        super(firstName, lastName, tasks, 25);
    }
}
