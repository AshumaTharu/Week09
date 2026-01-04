package Wk03;


public class MathOperationsJavaQ1
{
    public static void main(String[] args) {
        
        int a = 10, b = 5;
        
        // 1. Arithmetic Operators:");
        System.out.println("Arithmetic OPerators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
        // 2. Unary Operators (Pre- increament and post-increament)
        System.out.println("\nUnary Operators:");
        int x = 10;
        System.out.println("Post- increament x++ = " + (x++)); // prints then increaments
        System.out.println("After post-increament, x = " + x);
        System.out.println("Pre-increament ++x = " + (++x)); // increament then prints
        System.out.println("Logical NOT !x: " + (x)); // Inverts the value of x
    
        // Relational Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        
        // Logical Operators

    
        int y = 20;

        System.out.println("\n--- Logical Operators ---");
        System.out.println("x && y: " + (a & b)); // Logical AND
        System.out.println("x || y: " + (x | y)); // Logical OR
        System.out.println("!x: " + (x));         // Logical NOT

        //Ternary Operator
        System.out.println("\n--- Ternary Operator ---");
        int min = (a < b) ? a : b;
        System.out.println("Minimum of a and b: " + min);
    
    }
}