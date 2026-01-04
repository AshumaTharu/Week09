package WK09;


/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person {
    // Additional attributes specific to Teacher can be added here
    private String subject;

    public Teacher(int id, String name, double basicSalary, String subject) {
        super(id, name, basicSalary);
        this.subject = subject;
    }

    public double calculateAnnualSalary() {
        // Using super to call the parent's method and adding a potential bonus/adjustment
        double baseAnnualSalary = super.calculateAnnualSalary();
        // Example adjustment: add a fixed bonus of 1000 per year
        return baseAnnualSalary + 1000; 
    }
    
    // Getter for subject
    public String getSubject() { return subject; }
}
