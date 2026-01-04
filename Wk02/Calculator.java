package Wk02;

import java.util.Scanner;

/**
 * Write a description of class Wk02Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("First number entered: " + num1);
        System.out.println("Second number entered: " + num2);
    }
}