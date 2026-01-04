package Wk07;


/**
 * Write a description of class MainClass5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass5
{
    public static void main(String[] args)
    {
        // 2. Create three objects in Main class.
        Mobile phone1 = new Mobile();
        Mobile phone2 = new Mobile();
        Mobile phone3 = new Mobile();

        // Provide values for demonstration
        phone1.brand = "Samsung";
        phone1.price = 15000.0;

        phone2.brand = "Apple";
        phone2.price = 80000.0;

        phone3.brand = "Nokia";
        phone3.price = 19999.99;

        // Demonstrate the isAffordable() method
        System.out.println(phone1.brand + " is affordable: " + phone1.isAffordable());
        System.out.println(phone2.brand + " is affordable: " + phone2.isAffordable());
        System.out.println(phone3.brand + " is affordable: " + phone3.isAffordable());
    }
}

