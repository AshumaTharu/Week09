package Wk05;

import java.util.Scanner;
/**
 * Write a description of class sen here.
 *
 * @author (Ashuma Tharu)
 * @version (06/12/2025)
 */

public class FixedDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1.principle (deposit amount in Rs.) 
        System.out.println("Enter Principal amount (Rs.):");
        double principal = scanner.nextDouble();
        // 2. annual interest rate in %
        System.out.println("Enter Annual Interest Rate (%):");
        double annualRate = scanner.nextDouble();
        // 4. years
        System.out.println("Enter Duration in Years:");
        int years = scanner.nextInt();

        // 3. monthly rate
        double monthlyRate = annualRate / 1200.0; // 12 months * 100 for percentage
        
        //5. months
        int months = years * 12;
        
        // 6. maturity amount
        double maturityAmount = principal * Math.pow(1 + monthlyRate, months);
        
        // 7. fee rate
        double feeRate = 0.005; // 0.5%
        
        // 8. fee
        double fee = maturityAmount * feeRate;
        
        // 9. final amount
        double finalAmount = maturityAmount - fee;

        // Outputs
        System.out.println("\n--- Fixed Deposit Details ---");
        System.out.println("Principal (P): Rs. " + principal);
        System.out.println("Annual Rate: " + annualRate + "%");
        System.out.println("Duration: " + years + " years (" + months + " months)");
        System.out.println("Maturity Amount (A) before fee: Rs. " + maturityAmount);
        System.out.println("Processing Fee: Rs. " + fee);
        System.out.println("Final Amount customer receives: Rs. " + finalAmount);
    }
}