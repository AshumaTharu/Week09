package Wk07;


/**
 * Write a description of class TutorialQ1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
       Student S1= new Student();
       S1.collegeId= "np014sp10";
       S1.name="Ashu";
       S1.age=22;
       S1.study();
       
       System.out.println(S1.collegeId);
       System.out.println(S1.name);
       System.out.println(S1.age);
       
       Student S2= new Student();
       S2.name="Asmi";
       S2.laugh();
       
       System.out.println(S2.collegeId);
       System.out.println(S2.name);
       System.out.println(S2.age);
       
    }
}