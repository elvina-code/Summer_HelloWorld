package oop.Inheritance.Abstractclass;

public class Employee extends Person{
    private String firstName;

    @Override
    String getFirstName() {
        return "Employee name " + firstName;
    }

    @Override
    int getAge() {
        return 0;
    }

    @Override
    String getSpecies() {
        return null;
    }
}
