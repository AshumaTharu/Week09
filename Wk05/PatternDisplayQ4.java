package Wk05;

/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PatternDisplayQ4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j =1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

