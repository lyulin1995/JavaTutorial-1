package com.linlyu;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

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


        // Strings:
        String message = new String("Hello World" + "!!");
        // Strings are reference types in Java, so we use "new" to initialize a string variable.
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        // To check if the string ends with !!, will return a boolean value.
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        // Return the index of the first occurrence of the character or the string that we pass here.
        System.out.println(message.indexOf("sky"));
        // If the message doesn't contain certain characters or words or sentences, it returns -1.
        System.out.println(message.replace("!", "*"));
        // target and replacement are parameters, "!" and "*" are arguments.
        // Parameters are the holes that we define in our methods.
        // Arguments are the actual values that we pass to these methods.
        System.out.println(message);
        // .replace() doesn't modify the origin string, it returns a new string.
        // In Java, strings are immutable.
        System.out.println(message.toLowerCase());
        String message2 = new String("   Hello World" + "!!  ");
        System.out.println(message2);
        System.out.println(message2.trim());
        // Use trim to get rid of unnecessary spaces at the beginning or at the end of a string.


        // Escape Sequences:
        String message3 = "Hello \"Mosh\"";
        System.out.println(message3);
        // c:\Windows\...
        String message4 = "c:\\Windows\\...";
        System.out.println(message4);
        String message5 = "c:\nWindows\\...";
        System.out.println(message5);
        String message6 = "c:\tWindows\\...";
        System.out.println(message6);










    }
}
