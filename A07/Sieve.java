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
        Scanner kbd = new Scanner(System.in);

        LinkedList<Integer> myWords = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();
        int upperLimit, countLines = 0;

        printIntroduction();
        upperLimit = getUpperLimit(kbd);
        checkForMode(kbd, upperLimit,  countLines,  array);
        createListOfPossiblePrimes(upperLimit, myWords);

        countLines = createListOfPrimes(myWords, countLines, array);

        System.out.println();
//        displayPrimes(upperLimit, countLines, array);

    }

    private static int createListOfPrimes(LinkedList<Integer> myWords, int countLines, ArrayList<Integer> array) {
        int lines;
        while (!(myWords.isEmpty())) {
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
            lines = myWords.get(0);
            array.add(myWords.get(0));
            myWords.remove(0);
            for (int i = 0; i < myWords.size(); ++i) {
                if (myWords.get(i) % lines == 0) {
                    myWords.remove(i);
                }
            }
        }
        return countLines;
    }

    private static void displayPrimes(int upperLimit, int counter, ArrayList<Integer> array) {
        System.out.println("Primes upto " + upperLimit + ":");
        for (int i = 0; i < array.size(); ++i) {
            System.out.printf("%6d ", array.get(i));
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }

    private static void checkForMode(Scanner kbd,int upperLimit, int countLines, ArrayList<Integer> array) {
        String answer;
        String answer2;
        System.out.print("Shall I tell you how it's going? ");
        answer = kbd.nextLine().toUpperCase();
        if (answer.startsWith("Y")) {

            System.out.print("Shall I tell you in great detail? ");
            answer2 = kbd.nextLine().toUpperCase();

            if (answer2.startsWith("Y")) {
            }

        } else {
            displayPrimes(upperLimit, countLines, array);
        }
    }

    private static void createListOfPossiblePrimes(int upperLimit, LinkedList<Integer> myWords) {
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
                + "called the sieve of \nEratosthenes.\n");
    }
}
