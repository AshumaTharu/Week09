package Wk07;
import javax.swing.Box;

/**
 * Write a description of class MainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass
{
    public static void main(String[] args){

        //creating two objects of the book class
        Book book1 = new Book();
        Book book2 = new Book();
        // providing value for the attributes of book1
        book1.title = "The Hitchhiker's Guide to the Galaxy";
        book1.author = "Douglas Adams";
        book1.price = 10.99;
        // Providing value of the attribute of Book2
        book2.title = "1984";
        book2.author = "George Orwell";
        book2.price = 15.50;
        //Displaying the calue of the attributes
        System.out.println("Book 1 Details:");
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Price: $" + book1.price);

        System.out.println("\nBook 2 Details:");
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);
        System.out.println("Price: $" + book2.price);
    }
}
    