package Wk10;


/**
 * Write a description of class examapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class examapp
{
   public static void main (String[] args)
   {
        sciencestudent sc1 = new sciencestudent(12, "Maria", 100);
        System.out.println(sc1.toString());
        System.out.println("Result: "+sc1.calculateresult());
        
        managementstudent m1 = new managementstudent(10, "Jane Doe", 30);
        System.out.println(m1.toString());
        System.out.println("Result: "+m1.calculateresult());

}
}