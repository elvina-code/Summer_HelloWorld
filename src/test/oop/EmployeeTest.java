package oop;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
public class EmployeeTest {

    @Test
    public void testRaiseSalary(){
        Employee employee = new Employee(1, "Name", "lastName", 200);
        int annualSalary = employee.getAnnualSalary();
        //assertEquals(2400, annualSalary);
        assertEquals(200,employee.getSalary(), 0.0);

        employee.raiseSalary(-50);
        assertEquals(400, employee.getSalary());

        employee.raiseSalary(-50);
        assertEquals(800, employee.getSalary());


    }
}
