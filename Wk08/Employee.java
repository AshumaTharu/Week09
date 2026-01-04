package Wk08;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    private double basicSalary;
    
    public Employee(double Salary){
        this.basicSalary = Salary;
    }

    public double grossSalary(){
        return this.basicSalary + 0.20 * this.basicSalary;
    }
    public void displayInfo()
    {
        System.out.println(grossSalary());
    }
    }
