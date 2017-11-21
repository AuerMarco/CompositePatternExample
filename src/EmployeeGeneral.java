import java.util.ArrayList;

public class EmployeeGeneral implements IEmployeeGeneral {

    private String name;
    private double gehalt;

    public EmployeeGeneral(String name, double gehalt) {
        this.name = name;
        this.gehalt = gehalt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        if (gehalt >= 0) {
            this.gehalt = gehalt;
        }
    }

    @Override
    public void print() {
        System.out.println("Name: " + name + " Gehalt: " + gehalt);
    }
}
