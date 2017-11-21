import java.util.ArrayList;

public class Manager extends EmployeeGeneral implements IManagerGeneral {


    private ArrayList<EmployeeGeneral> subordinates;

    public Manager(String name, double gehalt) {
        super(name, gehalt);
        subordinates = new ArrayList<>();
    }

    @Override
    public void add(EmployeeGeneral employee) {
        subordinates.add(employee);
    }

    @Override
    public void remove(EmployeeGeneral employee) {

    }

    @Override
    public void print() {
        System.out.println("Name: " + super.getName() + " Gehalt: " + super.getGehalt());
        getSubordinates();
    }

    @Override
    public void getSubordinates() {
        for (EmployeeGeneral employee : subordinates) {
            employee.print();
        }

    }
}
