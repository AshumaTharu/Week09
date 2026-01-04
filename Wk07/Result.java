package Wk07;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    // 1. Include three attributes representing three subject's marks
    public double subject1;
    public double subject2;
    public double subject3;
    private double totalMarks;
    private double percentage;

    // 2. Calculate the total marks and total percentage using methods.
    public void calculateTotalMarks() {
        this.totalMarks = subject1 + subject2 + subject3;
    }

    public void calculatePercentage() {
        // Assuming total marks are out of 300 (100 marks per subject)
        this.percentage = (this.totalMarks / 300.0) * 100.0;
    }

    // 3. Create method to display the result.
    public void displayResult() {
        System.out.println("Student Result");
        System.out.println("Subject 1 Marks: " + subject1);
        System.out.println("Subject 2 Marks: " + subject2);
        System.out.println("Subject 3 Marks: " + subject3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("");
    }
}
