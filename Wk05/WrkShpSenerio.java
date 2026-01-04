package Wk05;

import java.util.Scanner;

/**
 * Write a description of class senerio1 here.
 * FixedDepositNIB
 * @author (Ashuma Tharu)
 * @version (06/12/2025)
 */ 
public class WrkShpSenerio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String continueCalculation = "yes";

        // 1. using while loop perform multiple FD calculations
        while (continueCalculation.equalsIgnoreCase("yes")) {
            System.out.println(" New FD Calculation ");
            
            // 2. Interest rates: 8-12%(current Nepal rates)
            System.out.print("Enter annual interest rate (8-12%): ");
            double annualRate = scanner.nextDouble();
            
              // 3. monthly compound interest calculate
            double principal = 10000;
            int years = 5;
            int n = 12;
            double monthlyRate = annualRate / 100.0 / n;
            int totalMonths = years = years * n;
              
            // 4. minimum deposit: Rs.1000, maximum duration:5 years
            System.out.print("Enter principal amount (min Rs. 1000): Rs. ");
            System.out.print("Enter duration in years (max 5 years): ");

            // 5. Include(0.5%) processing fee in calculations
            double processingFeeRate = 0.005; // 0.5%
        }
    }
}