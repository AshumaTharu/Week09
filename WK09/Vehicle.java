package WK09;


/**
 * Write a description of class here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle {
    protected int vehicleId;
    protected String brand;
    protected double basePrice; 

    public Vehicle(int vehicleId, String brand, double basePrice) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.basePrice = basePrice;
    }

    public void displayVehicleInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Base Price: $" + basePrice);
    }

    public double calculateTax() {
        return 0.10 * basePrice;
    }

    // Getter for basePrice to be used in child class
    public double getBasePrice() {
        return basePrice;
    }
}

