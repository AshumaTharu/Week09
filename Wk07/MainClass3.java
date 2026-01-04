package Wk07;


/**
 * Write a description of class MainClass3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass3
{
    public static void main(String[] args) {
        
        // 3. Create three objects of class Employee
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        // 4. Provide the values of the attributes
        emp1.id = 101;
        emp1.name = "Alice";
        emp1.salary = 60000.00;

        emp2.id = 102;
        emp2.name = "Bob";
        emp2.salary = 75000.00;

        emp3.id = 103;
        emp3.name = "Charlie";
        emp3.salary = 50000.00;

        // 5. Display the values of the attributes of all employees
        System.out.println(" Employee Details ");
        System.out.println("ID: " + emp1.id + ", Name: " + emp1.name + ", Salary: $" + emp1.salary);
        System.out.println("ID: " + emp2.id + ", Name: " + emp2.name + ", Salary: $" + emp2.salary);
        System.out.println("ID: " + emp3.id + ", Name: " + emp3.name + ", Salary: $" + emp3.salary);
        System.out.println("");

        // 6. Display the details of the employee with the highest salary.
        Employee highestPaid = emp1; 

        if (emp2.salary > highestPaid.salary) {
            highestPaid = emp2;
        }

        if (emp3.salary > highestPaid.salary) {
            highestPaid = emp3;
        }

        System.out.println("\n Employee with Highest Salary ");
        System.out.println("ID: " + highestPaid.id);
        System.out.println("Name: " + highestPaid.name);
        System.out.println("Salary: $" + highestPaid.salary);
        System.out.println("");
    }
}

