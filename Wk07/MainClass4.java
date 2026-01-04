package Wk07;


/**
 * Write a description of class MainClass4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass4
{
    public static void main(String[] args)
    {
        // 3. Create three objects of class Laptop, in main method Main Class.
        Laptop laptop1 = new Laptop("Dell", 16, 999.99);
        Laptop laptop2 = new Laptop("HP", 8, 750.50);
        Laptop laptop3 = new Laptop("Apple", 32, 1499.00);

        // 5. Display laptops with RAM greater than 8GB.
        System.out.println("Laptops with RAM greater than 8GB:");
        System.out.println("");

        if (laptop1.RAM > 8) {
            System.out.println("Brand: " + laptop1.brand + ", RAM: " + laptop1.RAM + "GB, Price: $" + laptop1.price);
        }

        if (laptop2.RAM > 8) {
            System.out.println("Brand: " + laptop2.brand + ", RAM: " + laptop2.RAM + "GB, Price: $" + laptop2.price);
        }

        if (laptop3.RAM > 8) {
             System.out.println("Brand: " + laptop3.brand + ", RAM: " + laptop3.RAM + "GB, Price: $" + laptop3.price);
        }
         System.out.println("");
    }
}

