package org.example;
import java.util.*; // or import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // SWITCH CASE
        /** switch (expression)
         case value1:
         //Code Block
         break;
         case value2:
         //Code Block
         break;
         case value3:
         //Code Block
         break;
         default:
         //Code Block
         **/

        System.out.println("Enter a number: 1-7");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        String name = "John";
        String name2 = "Kyle";

        if (name.equals(name2)) {
            System.out.println("Names match");
        }

        max(1.0, 2.0);
        max(1, 2);
        max(1.2, 2);

        /**
        Math.abs(x) // Absolute Value
        Math.max(a,b) // Larger number
        Math.min(a,b) // Smaller Number
        Math.sqrt(x) // Square Root
        Math.pow(a, b) // a raised to the power of b
         **/


        double twoToThePowerFive = Math.pow(2,5);

        System.out.println(max(2.0, 3.0));

    }

    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else return num2;
    }

    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else return num2;
    }
}
