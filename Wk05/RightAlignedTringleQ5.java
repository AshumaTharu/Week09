package Wk05;


/**
 * Write a description of class Q5w5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RightAlignedTringleQ5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

