package com.linlyu;

public class ControlFlow {
    public static void main(String[] args) {
        comparisonOperations();
        logicalOperators();
        ifStatements();
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
}
