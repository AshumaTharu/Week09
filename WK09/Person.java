package WK09;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person {
    private int id;
    private String name;
    private double basicSalary;
    public static String collegeName = "Islington College"; // Default value

    public Person(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateAnnualSalary() {
        return this.basicSalary * 12;
    }

    // Getters and setters 
    public int getId() { return id; }
    public String getName() { return name; }
    public double getBasicSalary() { return basicSalary; }
    public void setBasicSalary(double basicSalary) { this.basicSalary = basicSalary; }
}

