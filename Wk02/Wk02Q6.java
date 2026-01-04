package Wk02;


/**
 * Write a description of class Wk02Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wk02Q6
{
    public static void main(String[] args) {
        double waterLevel = 950.0; // Sample data
        System.out.println("Current Water Level: " + waterLevel + "L");
        String message = (waterLevel >= 1000) ? "Warning: Waterlevel has reached 1000L or more!" : "Status: Normal";
        
    }
}