package Wk08;


/**
 * Write a description of class StudnetClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
        //attributes
        
        private int id;
        private String name;
        private String address;
        private long phoneNumber;
        private static String collegename = "Islington College";
        
        public Student(int id, String name, String address, long phoneNumber){
            this.id = id;
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }
        
        public void displayInfo(){
            System.out.println("Student Details:");
            System.out.println("ID:" + id);
            System.out.print("Name:" + name);
            System.out.print("Address:" + address);
            System.out.print("Phone Number:" + phoneNumber);
            System.out.println("College Name:" + collegename);
        }
    }
