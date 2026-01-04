package Wk06;

import java.util.Scanner;
/**
 * Write a description of class Wk06Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wk06Q5 {
    public static void main(String[] args) {
        // Creating and printing a fixed String array
        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        System.out.println("Initial list of districts:");
        for (int i = 0; i < districts.length; i++) {
            System.out.println((i + 1) + ". " + districts[i]);
        }

        // Using Scanner to read new number of districts and their names
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the number of new districts to add: ");
        int numNewDistricts = scanner.nextInt();
        scanner.nextLine(); 

        String[] newDistricts = new String[numNewDistricts];
        System.out.println("Enter the names of the " + numNewDistricts + " districts:");
        for (int i = 0; i < numNewDistricts; i++) {
            System.out.print("District " + (i + 1) + ": ");
            newDistricts[i] = scanner.nextLine();
        }
        scanner.close();

        // Printing the updated array (the new array)
        System.out.println("\nUpdated list of districts:");
        for (int i = 0; i < newDistricts.length; i++) {
            System.out.println((i + 1) + ". " + newDistricts[i]);
        }
    }
}