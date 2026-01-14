package Wk10;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
   public static void main (String[] args)
   {
       doctor d1 = new doctor(101, "John Doe", "Physician", 5000);
       System.out.println(d1.toString());
       System.out.println("Salary: "+d1.calculatesalary());
        
       nurse n1 = new nurse(201, "Jane Doe", "Morning", 2500);
        
       System.out.println(n1.toString());
       System.out.println("Salary: "+n1.calculatesalary());
   }
}