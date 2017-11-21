import java.util.ArrayList;

public class Manager extends EmployeeGeneral implements IManagerGeneral {


    private ArrayList<EmployeeGeneral> subordinates;

    public Manager(String name, double gehalt) {
        super(name, gehalt);
    }

    @Override
    public void add(EmployeeGeneral employee) {

    }

    @Override
    public void remove(EmployeeGeneral employee) {

    }

    @Override
    public void getSubordinates() {

    }
}
