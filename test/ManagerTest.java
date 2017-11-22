import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

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

    @Test
    void add() {
        bigBoss.add(emp1);
        bigBoss.add(viceCaptain);
        assertEquals(2, bigBoss.getSubordinates().size());
    }

    @Test
    void remove() {
        add();
        bigBoss.remove(emp1);
        assertEquals(1, bigBoss.getSubordinates().size());
    }

}