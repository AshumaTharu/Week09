package Wk05;

import java.util.*;

/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleCalculatorQ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exist = true;
        
        while (exist) {
            System.out.println("Enter two numbers:");
            if (scanner.hasNextDouble() && scanner.hasNextDouble()) {
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                
                System.out.println("Choose an operation (+, -, *, /) or type 'exit' to quit:");
                String operation = scanner.next();
                
                if (operation.equalsIgnoreCase("exist")) {
                    exist = true;
                    System.out.println("Existing calculator.");
                    continue;
                }
                double result = 0;
                boolean validOperation = true;
                
                switch (operation) {
                    case "+":
                    result = num1 + num2;
                    break;
                    case "-":
                        result = num1 + num2;
                        break;
                        case "*":
                            result = num1 + num2;
                            break;
                            case "/":
                                if (num2 != 0) {
                                    result = num1 / num2;
                                } else {
                                    System.out.println("Error: Invalid operation.");
                                    validOperation = false;
                                }
                                break;
                                default:
                                    System.out.println("Error: Invalid operation.");
                                    validOperation = false;
                                }
                                if (validOperation) {
                                    System.out.println("Result: " + result);
                                }
                            }else {
                                System.out.println("Invalid input. Please enter numbers.");
                                scanner.next();  // Clear invalid input
                            }
                            System.out.println("--------------");
                        }
                        scanner.close();
                    }
                }