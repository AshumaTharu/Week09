package Wk05;


/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumofSquaresDowhileQ3{
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            sum += (i * i);
            i++;
        } while (i <= 10);
        System.out.println("Sum of the square of first 10 natural numbers is: " + sum);
        }
    }