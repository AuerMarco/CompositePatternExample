import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the employee super class
 *
 * @author Kyle
 */
class EmployeeGeneralTest {
    EmployeeGeneral emp;

    @BeforeEach
    void setUp() {
        emp = new Employee("Employee", 99);
    }

    /**
     * Checks if you can change the salary at all
     */
    @Test
    void setSalary() {
        double temp = 99;
        emp.setSalary(temp);
        assertEquals(temp, emp.getSalary());
    }

    /**
     * Checks if negative salary is successfully caught
     */
    @Test
    void setSalaryNegative() {
        emp.setSalary(-66);
        assertEquals(99, emp.getSalary());
    }

    /**
     * Checks if the toString method returns the proper value
     */
    @Test
    void toStringTest() {
        assertEquals("Name: Employee Salary: 99.0", emp.toString());
    }


}