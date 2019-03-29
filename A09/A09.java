package a09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class A09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        String result;
        int number1, number2;
        List<Integer> list = new ArrayList();

        printIntroduction();

        System.out.print(">>> ");
        result = kbd.next();
        while (!(result == null)) {
            if (result.equalsIgnoreCase("HELP")) {
                System.out.println("\nValid commands are:\n"
                        + " - factorial #\n"
                        + "     The product of all numbers from 1 to #.\n"
                        + "     (The argument must not be negative.)\n\n"
                        + " - gcd # #\n"
                        + "     The greatest common divisor of the two numbers.\n"
                        + "     The biggest number that divides evenly into both "
                        + "of them.\n\n"
                        + " - sorted #...\n"
                        + "     Whether the numbers are in order from smallest "
                        + "to largest.\n"
                        + "     If not, then where the first out-of-order number "
                        + "is.\n\n"
                        + " - help\n"
                        + "     This help message.\n\n"
                        + " - quit\n"
                        + "     End the program.\n\n");
            } else if (result.equalsIgnoreCase("factorial")) {
                number1 = kbd.nextInt();
                kbd.nextLine();
                System.out.println(number1 + "! == " + getFactorial(number1));
            } else if (result.equalsIgnoreCase("gdc")) {
                number1 = kbd.nextInt();
                number2 = kbd.nextInt();
                kbd.nextLine();
                System.out.println("gcd(" + number1 + ", " + number2 + ") == " + greatestCommonDivisor(number1, number2));
            } else if (result.equalsIgnoreCase("sorted")) {
//                number1 = kbd.nextInt();
//                kbd.nextLine();
                while (kbd.hasNextInt()) {
//                    number2 = kbd.nextInt();                    
//                    kbd.nextLine();
//                    if (number1 <= number2) {
//                        System.out.println("That list is sorted.");
//                    } else {
//                        System.out.println("Out of order");
//                    }

                    list.add(kbd.nextInt());
                    kbd.nextLine();
                    int i = 0;
//                    for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i) <= list.get(i++)) {
                        System.out.println("That list is sorted.");
                    } else {
                        System.out.println("Out of order");
                    }
                    i++;
//                    }
                    break;

                }
            }

            System.out.print(">>> ");
            result = kbd.next();
        }
    }

    private static void printIntroduction() {
        System.out.println("Assignment 'A09', Due: 2019-03-29, CSCI: 1228\n"
                + "---------------------------------------------\n"
                + "by Aitezaz Siddiqi(A00431079)\n"
                + "---------------------------------------------\n"
                + "This program reads and answers requests from \nthe user. "
                + "Errors in the requests are handled\nusing exceptions without"
                + " ending the program.\n"
                + "---------------------------------------------\n");
    }

    private static int getFactorial(int number) {
        int result = 0;

        if (number == 0 || number == 1) {
            return 1;
        } else if (number < 0) {
            System.out.println("Undefined");
        } else {
            result = number * getFactorial(number - 1);
        }
        return result;
    }

    private static int greatestCommonDivisor(int number1, int number2) {
        int result;
        if (number2 == 0) {
            return number1;
        } else {
            result = greatestCommonDivisor(number2, number1 % number2);
        }

        return result;
    }

}
