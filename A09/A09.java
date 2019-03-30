
import java.util.Scanner;

/**
 * This program reads and answers the request from the user also it handles the
 * errors using exception but the program does not end
 *
 * @author s3650728
 */
public class A09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Introduce yourself
        printIntroduction();

        //reads user input.
        readUserInput();
    }

    /**
     * Printing out some messages to explain what is the program about with the
     * author name
     */
    private static void printIntroduction() {
        //The program name.
        System.out.println("Command Loop\n"
                + "---------------------\n");
        //Say the author name.
        System.out.println("by Andrew Boutres (A00428722)\n");

        //Describe the program
        System.out.println("This program computes commands using a method "
                + "called command loop\n");

    }

    /**
     * A method that reads the user input.
     */
    private static void readUserInput() {
        boolean quit = false;
        do {
            Scanner kbd = new Scanner(System.in);
            System.out.print(">>> ");
            String[] request = kbd.nextLine().split("\\s");
            String command = request[0];

            switch (command) {
                case "help":
                    giveInstructions();
                    break;
                case "factorial":
                    findFactorial(request);
                    break;
                case "sorted":
                    // sayIfSorted(request);
                    break;
                case "gcd":
                    findGcd(request, kbd);
                    break;
                case "quit":
                    quit = true;
                    System.out.println("\nGood-bye.");
                    break;

            }
        } while (!quit);
    }

    private static void giveInstructions() {
        System.out.println("\n\nValid commands are:\n"
                + " - factorial #\n"
                + "     The product of all numbers from 1 to #.\n"
                + "     (The argument must not be negative.)\n"
                + "\n"
                + " - gcd # #\n"
                + "     The greatest common divisor of the two numbers.\n"
                + "     The biggest number that divides evenly "
                + "into both of them.\n"
                + "\n"
                + " - sorted #...\n"
                + "     Whether the numbers are in order "
                + "from smallest to largest.\n"
                + "     If not, then where the first out-of-order number is.\n"
                + "\n"
                + " - help\n"
                + "     This help message.\n"
                + "\n"
                + " - quit\n"
                + "     End the program.\n\n");

    }

    /**
     * its a factorial command that gets the factorial
     *
     * @param s1
     */
    private static void findFactorial(String[] s1) {
        //declare variables
        int factorial = 1, number;
        number = Integer.parseInt(s1[1]);

        for (int j = 1; j <= number; j++) {
            factorial = factorial * j;
        }
        System.out.println("\n" + number + "! == " + factorial + "\n");
    }
    /**
     * A method that finds the great common divisor 
     * @param b
     * @param kbd 
     */
    private static void findGcd(String[] b, Scanner kbd) {
        
        
    }
    /**
     * 
     * @param num1
     * @param num2
     * @return 
     */
    private static int itCalculateGcd(int num1, int num2) {

        if (num2 == 0) {
            return num1;
        } else {
            return itCalculateGcd(num2, num1 % num2);
        }
//       gcd 

    }
}
