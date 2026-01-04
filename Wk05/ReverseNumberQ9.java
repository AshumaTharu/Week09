package Wk05;
import java.util.*;

/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReverseNumberQ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        int originalNumber = number;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println("The reversed number for " + originalNumber + " is: " + reversedNumber);
        scanner.close();
  }
}