package WK09;


/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass {
    public static void main(String[] args) {
        // Set the static college name
        Person.collegeName = "Islington College";

        Teacher t1 = new Teacher(1, "Sandesh Tamrakar", 100000, "Computer Science");
        Staff s1 = new Staff(2, "Thomas Tamrakar", 90000, "English");

        System.out.println("College Name: " + Person.collegeName);
        System.out.println("Teacher " + t1.getName() + " annual salary: $" + t1.calculateAnnualSalary());
        System.out.println("Staff " + s1.getName() + " annual salary: $" + s1.calculateAnnualSalary());
    }
}

