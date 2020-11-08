package Recap.Inheritance;

public class Demo {
    public static void main(String[] args) {

        Manager boss = new Manager("Carl", 80000);
        boss.setBonus(5000);


        Employee [] staff = new Employee [3];
        staff[0] = boss;
        staff[1] = new Employee("Harry", 50000);
        staff[2] = new Employee("Tommy", 30000);

        for(Employee e : staff){
            System.out.println("name: " + e.getName() + " salary: " + e.getSalary());
        }

    }
}
