public class EmployeeGeneral implements IEmployeeGeneral {

    private String name;
    private double salary;

    public EmployeeGeneral(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + " Gehalt: " + salary;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name + " Gehalt: " + salary);
    }
}
