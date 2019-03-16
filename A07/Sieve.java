CSCI 1228 Submission Viewer

Version β -- Winter 2017

Student ID:

Submission to view:

A00431079's submissions for A07
Sieve.java

package a07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This assignment manipulates Lists in order to find all the primes up to a
 * number provided by the user.It optionally reports the steps of the algorithm
 * as it goes along.
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class Sieve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //A scanner variable.
        Scanner kbd = new Scanner(System.in);

        //All variables and lists.
        ArrayList<Integer> primes = new ArrayList<>();
        LinkedList<Integer> possiblePrimes = new LinkedList<>();
        int upperLimit, countLines = 0, firstElement;
        String firstAnswer, secondAnswer;

        //Call the printIntroduction method.
        printIntroduction();

        //Call the getUpperLimit method.
        upperLimit = getUpperLimit(kbd);

        firstAnswer = checkForMode(kbd);
        secondAnswer = answerTwo(firstAnswer, kbd);

        //Call createPossiblePrimeList to create possible list.
        createPossiblePrimeList(upperLimit, possiblePrimes);

        //While the list of possibly-prime numbers is not empty. 
        while (!(possiblePrimes.isEmpty())) {

            //Add to the prime list.
            primes.add(possiblePrimes.get(0));
            //Remember the prime.
            firstElement = possiblePrimes.get(0);

            //Checks the user respond.
            if (firstAnswer.startsWith("Y")) {

                //Displays the possible primes.
                displayPossiblePrimes(countLines, possiblePrimes);

                //Checks the user respond again.
                if (secondAnswer.startsWith("Y")) {

                    //Displays what number is being removed.
                    for (int i = 0; i < possiblePrimes.size(); ++i) {
                        if (possiblePrimes.get(i) % firstElement == 0) {
                            System.out.println("Removing " + possiblePrimes.
                                    get(i) + " from possibles");
                        }
                    }

                }
            }

            //Calls the removePossiblePrimesFromList.
            removePossiblePrimes(possiblePrimes, firstElement);
        }

        //Displays the prime upto upper limit.
        System.out.println("Primes upto " + upperLimit + ":");
        displayPrimes(countLines, primes);

    }

    /**
     * A method which removes possible primes from the possiblePrime list.
     *
     * @param possiblePrimes List of possible primes.
     * @param firstElement The first number in the possible prime list.
     */
    private static void removePossiblePrimes(LinkedList<Integer> possiblePrimes,
            int firstElement) {
        possiblePrimes.remove(0);
        for (int i = 0; i < possiblePrimes.size(); ++i) {
            if (possiblePrimes.get(i) % firstElement == 0) {
                possiblePrimes.remove(i);
            }
        }
    }

    /**
     * A method which checks for the mode depending on the user respond.
     *
     * @param kbd A scanner.
     * @return the user response.
     */
    private static String checkForMode(Scanner kbd) {
        String answer;
        System.out.print("Shall I tell you how it's going? ");
        answer = kbd.nextLine().toUpperCase();
        return answer;
    }

    /**
     * A method which checks for the user response if the user responded
     * affirmatively in the first question.
     *
     * @param answer the user response to the first question.
     * @param kbd A scanner.
     * @return the user response.
     */
    private static String answerTwo(String answer, Scanner kbd) {
        String answer2 = null;
        if (answer.startsWith("Y")) {
            System.out.print("Shall I tell you in great detail? ");
            answer2 = kbd.nextLine().toUpperCase();
        }
        return answer2;
    }

    /**
     * A method which prints the prime list.
     *
     * @param countLines line number.
     * @param primeList primes list.
     */
    private static void displayPrimes(int countLines,
            ArrayList<Integer> primeList) {
        countLines = 0;
        for (int i = 0; i < primeList.size(); ++i) {
            System.out.printf("%6d ", primeList.get(i));
            countLines++;
            if (countLines == 10) {
                System.out.println();
                countLines = 0;
            }
        }
    }

    /**
     * A method which prints the possible prime list.
     *
     * @param countLines line number.
     * @param possiblePrimeList possible prime list.
     */
    private static void displayPossiblePrimes(int countLines,
            LinkedList<Integer> possiblePrimeList) {
        System.out.println("Possibles: ");
        countLines = 0;
        for (int i = 0; i < possiblePrimeList.size(); ++i) {
            System.out.printf("%6d ", possiblePrimeList.get(i));
            countLines++;
            if (countLines == 10) {
                System.out.println();
                countLines = 0;
            }
        }
        System.out.println();
        System.out.println("Found Prime: " + possiblePrimeList.get(0));
    }

    /**
     * A method which creates the possible prime list.
     *
     * @param upperLimit the upper limit.
     * @param possiblePrimeList possible prime list.
     */
    private static void createPossiblePrimeList(int upperLimit,
            LinkedList<Integer> possiblePrimeList) {
        for (int i = 2; i <= upperLimit; ++i) {
            possiblePrimeList.add(i);
        }
    }

    /**
     * A method which gets the upper limit from the user.
     *
     * @param kbd A scanner.
     * @return the upper limit.
     */
    private static int getUpperLimit(Scanner kbd) {
        int upperLimit;
        System.out.print("What's the biggest number I should check? ");
        upperLimit = kbd.nextInt();
        kbd.nextLine();
        return upperLimit;
    }

    /**
     * A method which prints the introduction.
     */
    private static void printIntroduction() {
        System.out.println("Sieve of Eratosthenes\n"
                + "---------------------\n\n"
                + "by Aitezaz Siddiqi (A00431079)\n\n"
                + "This program computes the prime numbers using a method "
                + "called the sieve of Eratosthenes.");
    }
}

Return to outline page / A07 / pass-in page
