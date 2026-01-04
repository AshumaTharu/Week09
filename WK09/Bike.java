package WK09;


/**
 * Write a description of class here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(int vehicleId, String brandName,double basePrice, int engineCapacity) {
        super(vehicleId,brandName,basePrice); 
        this.engineCapacity = engineCapacity;
    }

    public double calculateFinalPrice() {
        return basePrice + calculateTax(); 
    }

    }


