package Wk10;


/**
 * Write a description of class doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class doctor extends person
{
    private String specialization;
    private double consultationfee;
    
    public doctor(int id, String name, String specialization, double consultationfee)
    {
        super(id, name);
        this.specialization=specialization;
        this.consultationfee= consultationfee;
    }
    
    @Override
    public double calculatesalary()
    {
        return super.calculatesalary()+consultationfee;
    }
    
    public double calculatesalary(int emergencycases){
        return this.calculatesalary()+ (emergencycases * 500);
    }
    
    @Override
    public String toString()
    {
        return super.toString()+ "Doctors--> Specialization:"+specialization+",Consultation Fee:" +consultationfee;
    }    
}