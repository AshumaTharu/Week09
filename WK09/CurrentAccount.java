package WK09;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw to support overdraft
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance + overdraftLimit) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Withdrawal amount exceeds overdraft limit.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    }


