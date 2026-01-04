package Wk07;


/**
 * Write a description of class MainClass2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass2
{
    public static void main(String[] args)
    {
        // 3. Create two objects of class Rectangle
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();

        // 4. Provide the values of the attributes
        rect1.length = 10.0;
        rect1.breadth = 5.0;

        rect2.length = 7.5;
        rect2.breadth = 3.0;

        // 5. Display the values of the attributes
        System.out.println("Rectangle 1 Details:");
        System.out.println("Length: " + rect1.length + ", Breadth: " + rect1.breadth);

        System.out.println("\nRectangle 2 Details:");
        System.out.println("Length: " + rect2.length + ", Breadth: " + rect2.breadth);

        // 6. Calculate and display the area of each rectangle
        double area1 = rect1.calculateArea();
        double area2 = rect2.calculateArea();

        System.out.println("\nRectangle 1 Area: " + area1);
        System.out.println("Rectangle 2 Area: " + area2);
    }
}

