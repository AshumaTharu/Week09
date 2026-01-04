package Wk06;


/**
 * Write a description of class Wk06Q08 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wk06QSenerioQuestion
{
    public static void main(String[] args) {
        // Create String[] categories
        String[] categories = {"Fiction", "Nepali"};

        // Create String[][] titles and double[][] prices (dimensions are correct)
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        // Put one title and price for each category
        titles[0][0] = "Asahamati - 5";
        prices[0][0] = 750.0;

        titles[1][0] = "Sample Nepali Title";
        prices[1][0] = 500.0;

        // Print each category, its title and price (format price with two decimals)
        System.out.println("Book Corner Inventory:");
        
        for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);
            System.out.println("Title: " + titles[i][0]); // Corrected index here
            // Use printf for price formatting
            System.out.printf("Price: %.2f%n", prices[i][0]); // Corrected index here
            
        }
    }
}

    