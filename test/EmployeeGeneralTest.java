import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeGeneralTest {
    EmployeeGeneral emp = new Employee("Employee", 99);

    @BeforeEach
    void setUp() {
        emp = new Employee("Employee", 99);
    }

    @Test
    void setSalaryTest() {
        double temp = -99;
        emp.setSalary(temp);
        assertEquals(99, emp.getSalary());
    }


    @Test
    void toStringTest() {
        assertEquals("Name: Employee Gehalt: 99.0", emp.toString());
    }


}