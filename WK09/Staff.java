package WK09;


/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Person {
    // Additional attributes specific to Staff
    private String department;

    public Staff(int id, String name, double basicSalary, String department) {
        super(id, name, basicSalary);
        this.department = department;
    }

    public double calculateAnnualSalary() {
        // Staff might have a different calculation, e.g., a smaller bonus
        double baseAnnualSalary = super.calculateAnnualSalary();
        return baseAnnualSalary + 500;
    }

    // Getter for department
    public String getDepartment() { return department; }
}

