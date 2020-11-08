package oop.Inheritance.Abstractclass;

public class Student extends Person{

    private String firstName;

    @Override
    String getFirstName() {
        return "student first name "+ firstName;
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
