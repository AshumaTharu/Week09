package Wk07;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    int accountnumber;
    String accholdername;
    double balance;
    
public BankAccount(int acc,String owner, double balance)
    {
        this.accountnumber=acc;
        this.accholdername=owner;
        this.balance=balance;
    }
    void depositamt(double deposit){
        if(deposit<=0)
        {
            System.out.println("INVALID AMOUNT for deposit!!"+"RS."+deposit);
    }
    else
    {
        balance+=deposit;
        System.out.println("Deposit successful!!"+"RS."+deposit);
    }
}

    void withdrawl(double withdraw)
{
    if(withdraw<=0)
    {
        System.out.println("INVALID AMOUNT for withdrawl!!"+"RS."+ withdraw);
    }
    else if (balance<withdraw)
    {
        System.out.println("Insufficient Amount in account for withdrawl!!");
    }
    else
    {
        balance=withdraw;
        System.out.println("Withdrawl successful!!"+"RS."+withdraw);
    }
}

    void currentbalance(){
    System.out.println("your closure balance is"+balance);
}

    void displayDetails()
{
    System.out.println();
    System.out.println("Account Number:" + accountnumber);
    System.out.println("Account Holder:" + accholdername);
    System.out.println("Opening Balance:Rs." + balance);
    System.out.println();
    }
}
    
