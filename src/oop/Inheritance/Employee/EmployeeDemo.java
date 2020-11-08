package oop.Inheritance.Employee;

public class EmployeeDemo {
    public static void main(String[] args) {
//        String [] tasks = {"develop","implement", "run"};
//        Developer d = new Developer("John","Smith",tasks);
        Developer d = new Developer("John", "Smith");
        System.out.println(d.toString());


        Tester t = new Tester("Elon", "Musk", new String[]{" testing", "unit testing"});
        System.out.println(t);

        System.out.println(d.getBaseSalary());
        System.out.println(t.getBaseSalary());
        System.out.println(t.getSeleniumVersion());



    }
}
