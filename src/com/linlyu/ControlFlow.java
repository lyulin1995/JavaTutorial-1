package com.linlyu;

import java.util.Locale;
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
//        comparisonOperations();
//        logicalOperators();
//        ifStatements();
//        forLoops();
//        whileLoops();
//        whileLoops2();
        forEachLoops();
    }

    public static void comparisonOperations() {
        int x = 1;
        int y = 1;
        System.out.println(x == y);
        // != inequality
        // > < >= <=
    }

    public static void logicalOperators() {
        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30;
        // && and operator
        System.out.println(isWarm);
        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord ;
        // || or operator
        // ! not operator
        System.out.println(isEligible);
    }

    public static void ifStatements() {
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }
        else if (temp > 20) {
            System.out.println("Beautiful day");
        }
        else {
            System.out.println("Cold day");
        }

        // Simplify the if code:
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
    }

    public static void theTernaryOperator() {
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
        // ? : are Ternary Operators, it has three pieces:
        // First we have the condition: income > 100_000;
        // if the condition is True, the variable className will be assigned "First";
        // Otherwise it will be assigned "Economy".
    }

    public static void switchStatement() {
        String role = "admin";
//        if (role == "admin")
//            System.out.println("You are an admin.");
//        else if (role == "moderator")
//            System.out.println("You are a moderator.");
//        else
//            System.out.println("You are a guest.");

        switch (role) {
            case "admin":
                System.out.println("You are an admin.");
                break;
            case "moderator":
                System.out.println("You are a moderator.");
                break;
            default:
                System.out.println("You are a guest.");
                // don't need "break" statement since we are at the end of the block.
                // It will automatically jump out of this block.

        }
    }

    public static void forLoops() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World " + i);
        } // when you know how many times you want to execute statements, using for loops.
    }

    public static void whileLoops() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            // can not use != since it will compare address. For strings, using .equal
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (!input.equals("quit"))
                System.out.println(input);
        }
        // using while loops when we don't know exactly how many times you want to repeat something.
        // First check the condition, then execute the statement.

        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
        // First execute the statement, then check the condition.

        // the break; statement terminates a loop,
        // and the continue; statement moves control to the beginning of a loop.
    }

    public static void whileLoops2 () {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
    }

    public static void forEachLoops () {
        String[] fruits = {"Apple", "Mango", "Orange"};
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);
    }

}
