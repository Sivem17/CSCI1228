package l09;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to read several numbers into an array -- dealing with errors along
 * the way.
 *
 * @author yasushi akiyama
 * @author Aitezaz Siddiqi (A00431079)
 * @version 1.00 2014/2/25
 */
public class ReadNumbers {

    private static final int SIZE = 5;

    public static void main(String[] args) {
        // create variables
        Scanner k = new Scanner(System.in);
        int a[] = new int[SIZE];
        int n;

        // read number
        System.out.println("Enter integers below: ");

        for (int i = 0; i < SIZE; i++) {
            try {
                System.out.print("a[" + i + "] = ");
                n = k.nextInt();
                k.nextLine();
                a[i] = n;
            } catch (InputMismatchException e) {
                System.out.print("The value was invalid.");
                a[i] = -100;
                k.nextLine();
                System.out.println(" -100 is assigned to a[" + i + "]");
            }
        }

        // report numbers
        System.out.print("\nYou entered: ");
        System.out.println(java.util.Arrays.toString(a));
    }
}
