package Wk10;


/**
 * Write a description of class savingaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class savingaccount extends account
{
    public savingaccount(int accountno, String holdername, double balance)
    {
        super(accountno, holdername, balance);
    }
    
    @Override
    public double calculateinterest(){
        return 2.0;
    }
}