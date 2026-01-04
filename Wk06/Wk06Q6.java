package Wk06;


/**
 * Write a description of class Wk06Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wk06Q6
{
    public static void main(String[] args) {
        int[][] marks = {{80, 75}, {90, 85}};
        String[] students = {"Student 1", "Student 2"};
        String[] subjects = {"Nepali", "English"};
        
        System.out.printf("%-15s%-10s%-10s%-10s%n", "Student", subjects[0], subjects[1], "Total");

        // Print marks and calculate total for each student
        for (int i = 0; i < marks.length; i++) {
            int totalMarks = 0;
            System.out.printf("%-15s", students[i]);
            for (int j = 0; j < marks[i].length; j++) {
                System.out.printf("%-10d", marks[i][j]);
                totalMarks += marks[i][j];
            }
            System.out.printf("%-10d%n", totalMarks);
        }
    }
}