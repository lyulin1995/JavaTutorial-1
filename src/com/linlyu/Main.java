package com.linlyu;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

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


        // Primitive Types vs Reference Types:
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


        // Arrays:
        int[] numbers = new int[5];
        // Arrays is reference type, so we should use new. 5 is the size of the array.
        numbers[0] = 1;
        numbers[1] = 2;
        // Use index to access items.
        System.out.println(numbers); // not going to work
        // return [I@2f2c9b19, since this is calculated based on the address in memory.
        System.out.println(Arrays.toString(numbers));
        int[] numbers2 = { 2, 3, 5, 1, 4 };
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        // In java, Arrays have fixed size. Once we create them, we cannot add or remove additional items.
        System.out.println(Arrays.toString(numbers2));


        // Multi-dimensional Arrays:
        int[][] numbers3 = new int[2][3];
        numbers3[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers3));
        // Use deepToString for multi-dimensional Arrays.
        int[][] numbers4 = { {1, 2, 3}, { 4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers4));


        // Constants:
        final float PI = 3.14F;
        // Use "final", java compiler will treat PI as a constant. We cannot change its value later on.
        // By convention, we use all capital letters to name constants.


        // Arithmetic Expressions:
        int result = 10 / 3;
        System.out.println(result);
        // In Java, the division of two whole numbers is a whole number.
        double result2 = (double) 10 / (double) 3;
        System.out.println(result2);
        // "/" is arithmetic operator; and numbers here are called operands.
        int w = 1;
        w++;  // or "++w"
        System.out.println(w);
        // "++" here is increment operator.
        int a = 1;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        // Here a would be 2 and b would be 1.
        // Since first the value of a will get copied to b, so b would be 1;
        // then a will be incremented by 1.
        int a2 = 1;
        int b2 = ++a2;
        System.out.println(a2);
        System.out.println(b2);
        // If we use prefix, both "b2" and "a1" are 2.
        // Since first a1 will be incremented by 1, so it will be 1;
        // then it will be copied to b2.
        int a3 = 1;
        a3 += 2;  // reduce the value of a3 by 2: a3 -= 2;
        System.out.println(a3);
        // increase the value of a3 by 2.
        // for multiply and divide: a3 *= 2; or a3 /= 2;


        // Order of Operations: (); * /; + -.


        // Casting:
        // Implicit casting: automatic conversion
        short c = 1;
        int d = c + 2;
        System.out.println(d);
        // Whenever we have a value and that value can be converted to a data type that is bigger casting
        // or happens implicitly or automatically.
        // byte > short > int > long > float > double
        // Explicit casting:
        double c2 = 2.1;
        int d2 = (int)c2 + 2;
        System.out.println(d2);
        // Explicit casting can only happen between compatible types.
        // If you want to convert a string to int/short... type:
        String c3 = "5";
        int d3 = Integer.parseInt(c3) + 4;
        System.out.println(d3);  // also for short/float/double...


        // The Math Class:
        int result3 = Math.round(1.1F);  // round a float number to a whole number
        System.out.println(result3);
        int result4 = (int) Math.ceil(1.1F);
        // ceil: return the smallest integer that is greater than or equal to this number.
        System.out.println(result4);
        int result5 = (int) Math.floor(1.1F);
        // floor: return the largest integer that is smaller or equal to this number.
        System.out.println(result5);
        int result6 = Math.max(1, 15);
        System.out.println(result6);
        double result7 = Math.random();  // floating-point number between 0 and 1.
        System.out.println(result7);
        double result8 = Math.random() * 100; // we want number between 0 and 100,
        System.out.println(result8);
        int result9 = (int) Math.round(Math.random() * 100);
        System.out.println(result9);
        int result10 = (int) (Math.random() * 100);
        // We should add (), otherwise it will always be 0 since the int of Math.random is 0.
        System.out.println(result10);


        // Formatting Numbers:
        // NumberFormat class is an abstract class, which means it cannot create instance.
        // NumberFormat currency = new NumberFormat(); not going to work
        NumberFormat currency =  NumberFormat.getCurrencyInstance();
        String result11 =  currency.format(1234567.891);
        System.out.println(result11);
        // Output: ???1,234,567.89
        NumberFormat percentInstance =  NumberFormat.getPercentInstance();
        String result12 =  percentInstance.format(0.1);
        System.out.println(result12);
        // Output: 10%
        // Method chaining:
        // NumberFormat.getPercentInstance() returns a NumberFormat object.
        String result13 = NumberFormat.getPercentInstance().format(0.3);
        System.out.println(result13);


        // Reading Input:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");  // ln: starting a new line
        Byte ageByte = scanner.nextByte();  // reading a Byte data
        System.out.println("You are " + ageByte);
        // All the method starting with next.
        // Java will automatically convert the ageByte from Byte to String Type. -> implicit casting
        System.out.print("Name: ");
        String name = scanner.next(); // read a string data
        System.out.println("You are " + name);
        // Only returns Lin when type Lin Lyu
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("New name: ");
        String name1 = scanner1.nextLine();
        System.out.println("New name is " + name1);
        // But it will store and display spaces.
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("New name 2: ");
        String name2 = scanner2.nextLine().trim();
        System.out.println("New name 2 is " + name2);
        // Use trim method it will not store the spaces at the beginning or at the end.


    }
}
