/**
 * Main class to demonstrate the program
 *
 * @author Kyle
 */
public class Company {
    public static void main(String[] args) {
        Manager m = new Manager("Manager", 999);
        Employee e = new Employee("Slave1", 99);
        m.add(e);
        Manager m2 = new Manager("Top Manager", 999);
        Employee e2 = new Employee("Slave2", 99);
        Employee e3 = new Employee("Slave3", 99);
        m2.add(m);
        m2.add(e2);
        m2.add(e3);
        m2.getAllSubordinates();
        System.out.println("-----");
        m2.print();
        System.out.println("-----Big Boss hirarchy-----");
        Manager bigBoss = new Manager("Big Boss", 9999);
        bigBoss.add(m2);
        bigBoss.print();
//        System.out.println("-----Big Boss direct subordinates-----");
//        for (EmployeeGeneral emp : m2.getSubordinates()) {
//            System.out.println(emp.toString());
//        }
        System.out.println("-----Big Boss hirarchy after remove-----");
        m2.remove(e3);
        bigBoss.print();
    }
}
