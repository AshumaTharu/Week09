package Wk07;


/**
 * Write a description of class Laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Laptop
{
    // Attributes
    public String brand;
    public int RAM; 
    public double price;

    // 4. Use a constructor to initialize the values.
    public Laptop(String brandName, int ramSize, double laptopPrice)
    {
        this.brand = brandName;
        this.RAM = ramSize;
        this.price = laptopPrice;
    }
}

