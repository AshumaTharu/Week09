package WK09;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        // The problem description implies interest = balance * (InterestRate / 100)
        double interest = super.getBalance() * (interestRate / 100);
        // balance += interest;
        return interest;
    }

    public String toString() {
        return super.toString() + ", Interest Rate: " + interestRate + "%";
    }
}

