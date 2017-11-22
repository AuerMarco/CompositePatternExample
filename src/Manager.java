import java.util.ArrayList;

public class Manager extends EmployeeGeneral implements IManagerGeneral {


    private ArrayList<EmployeeGeneral> subordinates;

    public Manager(String name, double gehalt) {
        super(name, gehalt);
        subordinates = new ArrayList<>();
    }

    public ArrayList<EmployeeGeneral> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(ArrayList<EmployeeGeneral> subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public void add(EmployeeGeneral employee) {
        subordinates.add(employee);
    }

    @Override
    public void remove(EmployeeGeneral employee) {
        subordinates.remove(employee);
    }

    @Override
    public void print() {
        System.out.println("Name: " + super.getName() + " Gehalt: " + super.getGehalt());
        getAllSubordinates();
    }

    @Override
    public void getAllSubordinates() {
        for (EmployeeGeneral employee : subordinates) {
            employee.print();
        }
    }
}
