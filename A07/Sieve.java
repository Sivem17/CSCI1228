/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class Sieve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //A Scanner.
        Scanner kbd = new Scanner(System.in);

        //All variables and list.
        ArrayList<Integer> primes = new ArrayList<>();
        LinkedList<Integer> possiblePrimes = new LinkedList<>();
        int upperLimit, countLines = 0, firstElement;
        String answer, answer2;

        //Call to printIntroduction method.
        printIntroduction();

        //Call to getUpperLimit method.
        upperLimit = getUpperLimit(kbd);

//        //Call to checkForVerboseMode method.
//        checkForVerboseMode(kbd, countLines, possiblePrimes, upperLimit, primes);
        System.out.print("Shall I tell you how it's going? ");
        answer = kbd.nextLine().toUpperCase();

        //Call to createPossiblePrimeList method.
        createPossiblePrimeList(upperLimit, possiblePrimes);

        while (!(possiblePrimes.isEmpty())) {
            primes.add(possiblePrimes.get(0));

            //To remember the number.
            firstElement = possiblePrimes.get(0);

            if (answer.startsWith("Y")) {
                System.out.print("Shall I tell you in great detail? ");
                answer2 = kbd.nextLine().toUpperCase();
                displayPossiblePrimes(countLines, possiblePrimes);
            }

            removePossiblePrimeFromList(possiblePrimes, firstElement);
        }

    }

    private static void removePossiblePrimeFromList(LinkedList<Integer> possiblePrimes, int firstElement) {
        possiblePrimes.remove(0);
        for (int i = 0; i < possiblePrimes.size(); ++i) {
            if (possiblePrimes.get(i) % firstElement == 0) {
                possiblePrimes.remove(i);
            }
        }
    }

    private static void checkForVerboseMode(Scanner kbd, int countLines, LinkedList<Integer> myWords, int upperLimit, ArrayList<Integer> array) {
        String answer;
        String answer2;
        System.out.print("Shall I tell you how it's going? ");
        answer = kbd.nextLine().toUpperCase();
        if (answer.startsWith("Y")) {
            System.out.print("Shall I tell you in great detail? ");
            answer2 = kbd.nextLine().toUpperCase();

            displayPossiblePrimes(countLines, myWords);
            if (answer2.startsWith("Y")) {
//               System.out.println("Removing " + myWords.get(i) + " from possibles");
            }

        } else {
            System.out.println("Primes upto " + upperLimit + ":");
            displayPrimes(countLines, array);
        }
    }

    private static void displayPrimes(int countLines, ArrayList<Integer> array) {
        countLines = 0;
        for (int i = 0; i < array.size(); ++i) {
            System.out.printf("%6d ", array.get(i));
            countLines++;
            if (countLines == 10) {
                System.out.println();
                countLines = 0;
            }
        }
    }

    private static void displayPossiblePrimes(int countLines, LinkedList<Integer> myWords) {
        System.out.println("Possibles: ");
        countLines = 0;
        for (int i = 0; i < myWords.size(); ++i) {
            System.out.printf("%6d ", myWords.get(i));
            countLines++;
            if (countLines == 10) {
                System.out.println();
                countLines = 0;
            }
        }
        System.out.println();
        System.out.println("Found Prime: " + myWords.get(0));
    }

    private static void createPossiblePrimeList(int upperLimit, LinkedList<Integer> myWords) {
        for (int i = 2; i <= upperLimit; ++i) {
            myWords.add(i);
        }
    }

    private static int getUpperLimit(Scanner kbd) {
        int upperLimit;
        System.out.print("What's the biggest number I should check? ");
        upperLimit = kbd.nextInt();
        kbd.nextLine();
        return upperLimit;
    }

    private static void printIntroduction() {
        System.out.println("Sieve of Eratosthenes\n"
                + "---------------------\n\n"
                + "by Aitezaz Siddiqi (A00431079)\n\n"
                + "This program computes the prime numbers using a method "
                + "called the sieve of Eratosthenes.");
    }
}
