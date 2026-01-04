package Wk08;


/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int accno;
    private double balance;
    private String name;
    
    public BankAccount(int accno, double balance, String name){
        this.accno=accno;
        this.balance=balance;
        this.name=name;
    }
    public void setBalance(){
         this.balance=balance;
    }
    public void deposit(double amt){
        if(amt>0){
            balance=balance+amt;
        }
    }
    
    public boolean withdrawl(double amt){
            if(amt>0&& amt<=balance)            {
                balance=balance-amt;
                return true;
            }
            else{
                return false;
            }
        }
    public void display(){
            System.out.println("AccountNumber:"+this.accno);
            System.out.println("Final Balance:"+balance);
        }
    }
