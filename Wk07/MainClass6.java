package Wk07;


/**
 * Write a description of class MainClass6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass6
{
    public static void main(String[] args) {
        // 4. Create two objects
        Result student1 = new Result();
        Result student2 = new Result();

        // Set marks for student 1
        student1.subject1 = 85.5;
        student1.subject2 = 78.0;
        student1.subject3 = 92.5;

        // Set marks for student 2
        student2.subject1 = 60.0;
        student2.subject2 = 71.0;
        student2.subject3 = 65.5;

        // Calculate total and percentage for both students
        student1.calculateTotalMarks();
        student1.calculatePercentage();

        student2.calculateTotalMarks();
        student2.calculatePercentage();

        // 5. Display the information for both objects
        student1.displayResult();
        student2.displayResult();
    }
}
