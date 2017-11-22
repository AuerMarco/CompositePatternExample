import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

/**
 * Test class for the manager class
 *
 * @author Kyle
 */
class ManagerTest {

    Manager bigBoss;
    Employee emp1;
    Manager viceCaptain;
    Employee emp2;
    Employee emp3;

    @BeforeEach
    void setUp() {
        bigBoss = new Manager("Big Boss", 9999);
        emp1 = new Employee("Sekretariat", 99);
        viceCaptain = new Manager("Vice Captain", 999);
        emp2 = new Employee("Employee 2", 99);
        emp3 = new Employee("Employee 3", 99);
//        bigBoss.setSubordinates(new ArrayList<>());
    }

    /**
     * Adds two employees as subordinates and then checks if the array-size is 2
     */
    @Test
    void add() {
        bigBoss.add(emp1);
        bigBoss.add(viceCaptain);
        assertEquals(2, bigBoss.getSubordinates().size());
    }

    /**
     * Adds 2 employees using the above method. Then removes one and checks if the array-size is 1
     */
    @Test
    void remove() {
        add();
        bigBoss.remove(emp1);
        assertEquals(1, bigBoss.getSubordinates().size());
    }

}