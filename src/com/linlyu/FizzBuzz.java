package com.linlyu;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        mySolution();
    }

    public static void mySolution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        Byte number = scanner.nextByte();
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0) {
            System.out.println("Fizz");
        }
        else if (number % 3 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }
        // the order condition matters.
        // We should put the most specific condition on the top;
        // and the most generic ones on the bottom.
    }
}
