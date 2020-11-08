package Recap;

public class Employee {
    private String name;
    private long salary;
    private static int lastEmployeeId;
    private int id;


    {
        System.out.println("Instance initializer");
        id = ++lastEmployeeId;

    }

    static {
        System.out.println("Static initializer");

        lastEmployeeId = 0;
    }

    public Employee(String name, long salary) {
        System.out.println("Constructor");
        this.name = name;
        this.salary = salary;
//        this.id = id;
    }

    public long employeeSalary() {
        return this.salary;
    }

    public String getEmployeeName() {
        return this.name;

    }
    public int getLastEmployeeId(){
        return lastEmployeeId;
    }
    public void setLastEmployeeId(int id){
        lastEmployeeId = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

    class Demo{
        public static void main(String[] args) {
            Employee e1 = new Employee("John", 2000);
            Employee e2 = new Employee("Smith", 3000);
            Employee e3 = new Employee("Kia", 1000);

            // instance
            System.out.println(e1.getId());
            System.out.println(e2.getId());
            System.out.println(e3.getId());

            // static
            System.out.println(e1.getLastEmployeeId());
//            System.out.println(e2.getLastEmployeeId());
//            e1.setLastEmployeeId(12);
//            System.out.println(e1.getLastEmployeeId());
//            System.out.println(e2.getLastEmployeeId());
//
//            e1.setId(5);
//            System.out.println(e1.getId());
//            System.out.println(e2.getId());





        }


    }

