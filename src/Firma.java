public class Firma {
    public static void main(String[] args) {
        Manager m = new Manager("Msster", 999);
        EmployeeGeneral e = new Employee("Slave1", 99);
        m.add(e);
        Manager m2 = new Manager("SuperMaster", 999);
        EmployeeGeneral e2 = new Employee("Slave2", 99);
        m2.add(e2);
        m2.add(m);
        m2.getSubordinates();
        System.out.println("-----");
        m2.print();
        System.out.println("-----");
        Manager m3 = new Manager("UltraMaster", 9999);
        m3.add(m2);
        m3.print();
    }
}
