package Wk06;

import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a description of class Wk06Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wk06Q3
{
    public static void main(String[] args) {
        String[] studentNames = {"Ashu", "Sanu", "Jassu", "Sudi"};
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Printing all name using a for loop:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]);
            
            System.out.println("\nName at index 2 (third element):");
            System.out.println(studentNames[2]);
            
            studentNames[4] = "UpdatedAshu";
            System.out.println("\nUpdated name at index 4:");
            System.out.println(studentNames[4]);
            
            System.out.println("\nEnter a new name to update the arrays:");
            String newName = scanner.nextLine();
            studentNames[0] = newName; // Updating the first element as an example
            
            System.out.println("\nUpdated array:");
            System.out.println(Arrays.toString(studentNames));
            scanner.close();
        }
        }
    }