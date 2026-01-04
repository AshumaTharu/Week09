package Wk06;

import java.util.Scanner;

/**
 * Write a description of class Wk06Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wk06Q4
{
    public static void main(String[]args) {
        // defining initial array and variables
        int[] scores = {10, 20, 30, 40, 50};
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];
        // print numbers, compute sum, highest, and lowest
        System.out.println("Scores:");
        for ( int score : scores) {
            System.out.println(score);
            sum += score;
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
            // compute and print average
            double average = (double)sum / scores.length;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + highest);
            System.out.println("Highest score: " + highest);
            System.out.println("Lowest score: " + lowest); 
            
            // import scanner and prompt for number of subjects
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();
            
            //creating dynamic array and read scores
            int[] dynamicScores = new int[numSubjects];
            for (int i = 0; i < numSubjects; i++) {
                System.out.println("Enter score for subject " + (i + 1) + ": ");
                dynamicScores[i] = scanner.nextInt();
            }
            
            //print the updated array
            System.out.println("Updated scores array:");
                System.out.println(score);
            }
            }
            }