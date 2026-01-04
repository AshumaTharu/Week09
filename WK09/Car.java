package WK09;


/**
 * Write a description of class here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    public Car(int vehicleId, String brand, double basePrice, int numberOfDoors, String fuelType) {
        super(vehicleId, brand, basePrice); // Constructor chaining using super
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public double calculateFinalPrice() {
        double tax = calculateTax(); 
        double luxuryCharge = 0.05 * getBasePrice();
        return getBasePrice() + tax + luxuryCharge;
    }

    public void displayVehicleInfo() {
        super.displayVehicleInfo(); 
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Final Price (incl. tax & luxury): $" + calculateFinalPrice());
    }
}

    
