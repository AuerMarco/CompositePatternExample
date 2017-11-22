import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeGeneralTest {
    EmployeeGeneral emp;

    @BeforeEach
    void setUp() {
        emp = new Employee("Employee", 99);
    }

    @Test
    void setSalary() {
        double temp = 99;
        emp.setSalary(temp);
        assertEquals(temp, emp.getSalary());
    }

    @Test
    void setSalaryNegative() {
        emp.setSalary(-666);
        assertEquals(99, emp.getSalary());
    }

    @Test
    void toStringTest() {
        assertEquals("Name: Employee Gehalt: 99.0", emp.toString());
    }


}