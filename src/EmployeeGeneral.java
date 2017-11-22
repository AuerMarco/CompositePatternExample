/**
 * @author Kyle
 * <p>
 * Base class for regular employees and managers
 */
public class EmployeeGeneral implements IEmployeeGeneral {

    private String name;
    private double salary;

    /**
     * Sets the name and salary for the employee / manager
     *
     * @param name   name of the employee / manager
     * @param salary salary of the employee / manager
     */
    public EmployeeGeneral(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * @return name of the employee / manager
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a new name for the employee / manager
     *
     * @param name new name of the employee / manager
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return salary of the employee / manager
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets a new salary for the employee / manager, it's a positive value
     *
     * @param salary new salary for the employee / manager
     */
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary can't be negative.");
        }
    }

    /**
     * @return String-output with the name and salary of the employee / manager
     */
    @Override
    public String toString() {
        return "Name: " + name + " Salary: " + salary;
    }

    /**
     * Automatically prints the Stringed variables of the employee / manager
     */
    @Override
    public void print() {
        System.out.println(toString());
    }
}
