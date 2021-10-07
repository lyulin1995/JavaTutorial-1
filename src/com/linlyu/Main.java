package com.linlyu;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        int myAge = 30;
        int herAge = myAge;  // use camelcase notation to name a variable
        System.out.println(herAge);


        // Primitive Types:
        // numbers, characters, booleans.
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        // Use _ to make number readable.
        // Put L at the end of the number to declare a long type.
        float price= 10.99F;
        // Put F at the end of the number to declare a float type.
        char letter = 'A';
        // We should always surround single characters with single quotes
        // and multiple characters or string with double quotes.
        boolean isEligible = false;
        // All these words coded in orange are reserved keywords in Java.


        // Reference Types:
        // data, mail messages.
        Date now = new Date();
        // We use "new" operator to allocate memory for this variable.
        // Variable "now" here is an instance of the data class.
        now.getTime();
        // Use . to access the members in this class.
        System.out.println(now);


        // Primitive Types vs Reference Types
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
        // y doesn't change since primitive types are copied by their value
        // and these values are completely independent of each other.
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        // point2 changes since the reference types are copied by the references (the address of Point).


    }
}
