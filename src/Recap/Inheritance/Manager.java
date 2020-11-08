package Recap.Inheritance;

public class Manager extends Employee{

    private int bonus;

    public Manager(String name, int salary) {
        super(name, salary);

    }

    public int getBonus() {
        return bonus;
    }
    // overriding method:
    // -can be overridden inherited methods
    // final and static can not be overridden
    // overridden method must have same signature


    @Override
    public int getSalary() {
        int baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

}
