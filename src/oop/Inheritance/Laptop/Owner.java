package oop.Inheritance.Laptop;

import java.util.List;

public class Owner {
private String fullName;
private String password;
private int age;
private List<String> classes;

    public Owner(String fullName, String password, int age) {
        this.fullName = fullName;
        this.password = password;
        this.age = age;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", classes=" + classes +
                '}';
    }
}
