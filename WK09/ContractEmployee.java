package WK09;


/**
 * Write a description of class ContractEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContractEmployee extends Employees {
    private int workingDays;
    private double dailyRate;
    public ContractEmployee(String id, String n, double salary, int days, double rate){
        super(id,n,salary);
        this.workingDays = days;
        this.dailyRate = rate;
    }
    public double
    calculateContractSalary() {
        return workingDays * dailyRate;
    }
}