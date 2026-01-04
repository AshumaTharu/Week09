package Wk08;


/**
 * Write a description of class Employee1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee1
{
    public static void main(String[] args){
        Employee e1=new
        Employee(45000.25);
        System.out.println(e1.grossSalary());
        e1.displayInfo();
    }
}