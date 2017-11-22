import java.util.ArrayList;

/**
 * @author Kyle
 * <p>
 * Class for managers
 */
public class Manager extends EmployeeGeneral implements IManagerGeneral {


    private ArrayList<EmployeeGeneral> subordinates;

    /**
     * Sets the name and salary for the manager
     *
     * @param name   name of the manager
     * @param salary salary of the manager
     */
    public Manager(String name, double salary) {
        super(name, salary);
        subordinates = new ArrayList<>();
    }

    /**
     * Returns the current ArrayList of (direct) subordinates
     *
     * @return list of (direct) subordinates
     */
    public ArrayList<EmployeeGeneral> getSubordinates() {
        return subordinates;
    }

    /**
     * Sets the current ArrayList of (direct) subordinates to a new list
     *
     * @param subordinates list of (direct) subordinates
     */
    public void setSubordinates(ArrayList<EmployeeGeneral> subordinates) {
        this.subordinates = subordinates;
    }

    /**
     * Adds an employee to an ArrayList of (direct) subordinates
     *
     * @param employee employee / manager to be added as subordinate
     */
    @Override
    public void add(EmployeeGeneral employee) {
        subordinates.add(employee);
    }

    /**
     * Removes an employee from the ArrayList of (direct) subordinates
     *
     * @param employee employee / manager to be removed as subordinate
     */
    @Override
    public void remove(EmployeeGeneral employee) {
        subordinates.remove(employee);
    }

    /**
     * Prints the manager and their subordinates
     */
    @Override
    public void print() {
        System.out.println(super.toString());
        getAllSubordinates();
    }

    /**
     * Prints all of the subordinates, including subs of subs
     */
    @Override
    public void getAllSubordinates() {
        for (EmployeeGeneral employee : subordinates) {
            employee.print();
        }
    }
}
