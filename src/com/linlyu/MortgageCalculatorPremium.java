package com.linlyu;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorPremium {

    public static void main (String[] args) {
        mySolution();
    }

    public static void mySolution () {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        final int MIN_PRINCIPAL = 1000;
        final int MAX_PRINCIPAL = 1_000_000;
        final int MIN_ANNUAL_INTEREST = 0;
        final int MAX_ANNUAL_INTEREST = 30;
        final int MIN_PERIOD = 1;
        final int MAX_PERIOD = 30;
        float monthlyInterest = 0;
        int principal = 0;
        float annualInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal < MIN_PRINCIPAL || principal > MAX_PRINCIPAL) {
                System.out.println("Enter a number between " + MIN_PRINCIPAL + " and " + MAX_PRINCIPAL);
                continue;
            }
            // if the variable principal is defined in the block, it's not available outside the block.
            else
                break;
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest <= MIN_ANNUAL_INTEREST || annualInterest > MAX_ANNUAL_INTEREST) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
                continue;
            }
            else {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years < MIN_PERIOD || years > MAX_PERIOD) {
                System.out.println("Enter a value between 1 and 30.");
                continue;
            }
            else {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
        }

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }

    public static void correctSolution () {
        Scanner scanner = new Scanner(System.in);

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float annualInterest = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        System.out.println("Calculate your Mortgage");

        //get principal
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter a value between 1k and 1M");
        }

        //get monthly interest
        while (true) {
            System.out.print("Annual Interest: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        //get number of payments
        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        //  Mortgage formula:
        //  P( r(1 + r)^n  /  ((1 + r)^n) - 1) )

        double mortgage = principal
                * (monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfPayments)))
                / ((Math.pow((1 + monthlyInterest), numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }

}
