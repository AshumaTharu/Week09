package Wk05;

import java.util.*;

/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TableGeneratorQ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number to generate its multiplication table:");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            System.out.println("Multiplication Table for " + number + ":");
            for (int i = 1; i<= 10; i++) {
                int result = number * i;
                System.out.println(number + " * " + i + " = " + result);
            }
        }else {
            System.out.println("Invalid input. Please enter an integer number.");
        }
        scanner.close();
            }
    }




