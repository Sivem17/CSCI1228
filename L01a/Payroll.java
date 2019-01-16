package l01a;

import java.util.Scanner;

/**
 * This program uses the calculatePay method from the PayCalculator class to
 * figure out how much pay someone should be given based on their wage rate and
 * hours worked.
 *
 * @author Mark Young (A00000000)
 */
public class Payroll {

    public static void main(String[] args) {
        // create variables
        Scanner kbd = new Scanner(System.in);
        double payRate, hoursWorked;

        // explain yourself
        System.out.println("\n\n"
                + "Payroll Program\n"
                + "---------------\n\n"
                + "This program calculates the pay for our employees "
                + "based on their rate of\npay "
                + "and the number of hours they worked. "
                + "A person who works over "
                + PayCalculator.REGULAR_HOURS
                + " hours\nper week "
                + "earns time-and-a-half for the extra hours.\n\n");

        // read taxable incomes until a non-positive value is read
        System.out.print("Enter your pay rate (per hour): $");
        payRate = kbd.nextDouble();
        kbd.nextLine();
        while (payRate > 0.0) {
            System.out.print("Enter how many hours you worked this week: ");
            hoursWorked = kbd.nextDouble();
            kbd.nextLine();
            System.out.printf("\n"
                    + "The pay for someone who worked %4.2f hours "
                    + "at $%4.2f per hour is $%,4.2f.\n\n",
                    hoursWorked,
                    payRate,
                    PayCalculator.calculatePay(payRate, hoursWorked));
            System.out.print("Enter your pay rate (per hour): $");
            payRate = kbd.nextDouble();
            kbd.nextLine();
        }

        // say goodbye
        System.out.println("\n\nThanks for using our calculator!\n\n");
    }

}
