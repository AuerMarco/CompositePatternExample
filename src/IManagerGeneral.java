/**
 * @author Kyle
 * <p>
 * Interface for the manager class
 */
public interface IManagerGeneral {


    /**
     * Mehtod to add an employee to an ArrayList of (direct) subordinates
     *
     * @param employee employee / manager to be added as subordinate
     */
    void add(EmployeeGeneral employee);

    /**
     * Method to remove an employee from the ArrayList of (direct) subordinates
     *
     * @param employee employee / manager to be removed as subordinate
     */
    void remove(EmployeeGeneral employee);

    /**
     * Method to print all of the subordinates, including subs of subs
     */
    void getAllSubordinates();
}
