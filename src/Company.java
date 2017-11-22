/**
 * Main class to demonstrate the program
 *
 * @author Kyle
 */
public class Company {
    public static void main(String[] args) {
        Manager m = new Manager("Manager", 999);
        Employee e = new Employee("Employee 1", 99);
        m.add(e);
        Manager m2 = new Manager("Top Manager", 999);
        Employee e2 = new Employee("Employee 2", 99);
        Employee e3 = new Employee("Employee 3", 99);
        m2.add(m);
        m2.add(e2);
        m2.add(e3);
        System.out.println("-----Top Manager hierarchy-----");
        m2.print();
        System.out.println("-----Big Boss hierarchy-----");
        Manager bigBoss = new Manager("Big Boss", 9999);
        bigBoss.add(m2);
        bigBoss.print();
//        System.out.println("-----Big Boss direct subordinates-----");
//        for (EmployeeGeneral emp : m2.getSubordinates()) {
//            System.out.println(emp.toString());
//        }
        System.out.println("-----Big Boss hierarchy after remove-----");
        m2.remove(e3);
        bigBoss.print();
    }
}
