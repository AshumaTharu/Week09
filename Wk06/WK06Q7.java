package Wk06;


/**
 * Write a description of class WK06Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WK06Q7
{
    public static void main(String[] args) {
        String[][] seats = {
            {"Alice", "Bob", "Charlie"},
            {"", "", ""}
        };

        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                if (seats[row][col].isEmpty()) {
                    System.out.print("[empty] ");
                } else {
                    System.out.print(seats[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
    }