package WK09;


/**
 * Write a description of class Employees here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employees {
    private String employeeId;
    private String name;
    private double basicSalary;
    public Employees(String id, String n, double salary) {
        this.employeeId = id;
        this.name = n;
        this.basicSalary = salary;
    }
    public double calculateBonus() {
        return 0.10 * basicSalary;
    }
    public void displayEmployee() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
    public double getBasicSalary(){
        return basicSalary;
    }
}