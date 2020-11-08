package oop.Inheritance.Employee;

import oop.Inheritance.Employee.Employee;

public class Developer extends Employee {

//   private final int PERCENTAGE = 20;

    public Developer(String firstName, String lastName) {
        super(firstName, lastName, new String[] { "develop", "implement", "run"},20);
    }

    @Override
    public Double getBaseSalary() {
        Double devSalary = super.getBaseSalary()+(super.getBaseSalary()* getPercentage()/100);
//        return super.getBaseSalary();
        return devSalary;
    }

    //    public Developer(String firstName, String lastName, String[] tasks) {
//        super(firstName, lastName, tasks);
//    }


}
