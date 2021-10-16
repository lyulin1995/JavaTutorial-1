package com.linlyu;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        // Project: Mortgage Calculator
        final int MONTHS_NUMBERS = 12;
        final int PERCENT = 100;

        Scanner principal = new Scanner(System.in);
        System.out.println("My solution");
        System.out.print("Principal: ");
        Integer principal_value = principal.nextInt();
        Scanner annual_interest_rate = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        Double air_value = annual_interest_rate.nextDouble();
        Scanner period = new Scanner(System.in);
        System.out.print("Period (Year): ");
        Integer period_value = period.nextInt();
        Double mortgage = (principal_value* (air_value / MONTHS_NUMBERS / PERCENT) * Math.pow((1 + (air_value / (MONTHS_NUMBERS * PERCENT))), (period_value * MONTHS_NUMBERS))) / (Math.pow((1 + (air_value / MONTHS_NUMBERS / PERCENT)), (period_value * MONTHS_NUMBERS)) - 1);
        NumberFormat mortgage_currency = NumberFormat.getCurrencyInstance();
        String mortgage_currency_result = mortgage_currency.format(mortgage);
        System.out.println("Mortgage: " + mortgage_currency_result);

        correctSolution();
    }


    public static void correctSolution() {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        // always avoid magic numbers in your code.
        // use constants or final variables to describe them.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Correct Solution");

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
