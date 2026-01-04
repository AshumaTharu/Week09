package Wk07;


/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile
{
    // 1. Create a class Mobile with attributes: brand, price.
    public String brand;
    public double price;

    // 3. Create a method isAffordable() in Mobile class that checks if price < 20000.
    /**
     * Checks if the mobile phone's price is less than 20000.
     * @return true if affordable, false otherwise.
     */
    public boolean isAffordable()
    {
        // Check if the price is less than 20000.
        return this.price < 20000.0;
    }
}

