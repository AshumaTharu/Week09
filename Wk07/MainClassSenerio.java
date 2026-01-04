package Wk07;


/**
 * Write a description of class MainClassSenerio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClassSenerio
{
    public static void main(String[] args){
        BankAccount Customer1=new BankAccount(0111,"Jasmin",500000);
        Customer1.displayDetails();
        Customer1.depositamt(175000);
        Customer1.withdrawl(100000);
        Customer1.currentbalance();
        
        System.out.println();
        
        BankAccount Customer2=new BankAccount(0011, "Pratibha",700000);
        Customer2.displayDetails();
        Customer2.depositamt(1000000);
        Customer2.withdrawl(1000000);
        Customer2.currentbalance();
        
    }
}