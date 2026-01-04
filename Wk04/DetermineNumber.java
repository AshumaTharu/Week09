package Wk04;

import java.util.Scanner;

/**
 * Write a description of class DetermineNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DetermineNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + "is zero.");
        }
        scanner.close();
    }
}
