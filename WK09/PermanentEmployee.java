package WK09;


/**
 * Write a description of class PermanentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermanentEmployee extends Employees {
    private double HRA;
    private double DA;
    public PermanentEmployee(String id, String n, double salary, double hra, double da){
        super(id,n,salary);
        this.HRA = hra;
        this.DA = da;
    }
    public double calculateTotalSalary()
    {
      return getBasicSalary() + HRA + DA + calculateBonus();
    }
}