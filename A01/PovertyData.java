/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class PovertyData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        double[] incomeData;
        double minimumIncome;

        printIntroduction();
        incomeData = readIncomeData(kbd);
        minimumIncome = readMinimumIncome(kbd);
        printPause(kbd);
        printReport(incomeData, minimumIncome);

    }

    public static void printIntroduction() {
        System.out.println("A00431079 -- Siddiqi, Aitezaz\n"
                + "CSCI 1228 -- Winter 2019\n"
                + "A01 -- due 2019-01-18\n\n"
                + "Poverty Rate Program\n"
                + "--------------------\n\n"
                + "This program reads data on family incomes and produces a "
                + "report on poverty\n"
                + "rates among the families.\n");
    }

    public static double[] readIncomeData(Scanner kbd1) {

        int numFamilies;
        double familyIncome;

        System.out.print("How many families are there in this country? ");
        numFamilies = kbd1.nextInt();
        kbd1.nextLine();
        while (numFamilies < 2) {
            System.out.println("There must be at least 2 families.");
            System.out.print("How many families are there in this country? ");
            numFamilies = kbd1.nextInt();
            kbd1.nextLine();
        }
        System.out.println();

        double[] array = new double[numFamilies];
        for (int i = 1; i <= numFamilies; ++i) {
            System.out.print("What is the income for family #" + i + "? ");
            familyIncome = kbd1.nextDouble();
            kbd1.nextLine();
            while (familyIncome < 0) {
                System.out.println("The income must be non-negative.");
                System.out.print("What is the income for family #"
                        + i + "? ");
                familyIncome = kbd1.nextDouble();
                kbd1.nextLine();
            }
        }
        System.out.println();
        return array;
    }

    public static double readMinimumIncome(Scanner kbd2) {

        double minIncome;
        System.out.print("What is the minimum income required to "
                + "support a family? ");
        minIncome = kbd2.nextDouble();
        kbd2.nextLine();
        while (minIncome <= 0) {
            System.out.println("The income must be positive.");
            System.out.print("What is the minimum income required to "
                    + "support a family? ");
            minIncome = kbd2.nextDouble();
            kbd2.nextLine();
        }
        return minIncome;
    }

    public static void printPause(Scanner kbd3) {

        System.out.println();
        System.out.print("Press Enter...");
        kbd3.nextLine();
        System.out.println();
    }

    public static void printReport(double[] array, double basicIncome) {
        System.out.println("Report\n"
                + "------\n"
                + "Average Income:        $" + getAverage(array) + "\n"
                + "Basic Needs Income:    $" + basicIncome + "\n"
                + "Absolute Poverty Rate:  " + getPovertyRate(array, basicIncome));

        System.out.println("Report\n"
                + "------\n"
                + "Median Income:         $" + getMedian(array) + "\n"
                + "Relative Needs Income: $" + getRelativeNeedsIncome(array) + "\n"
                + "Relative Poverty Rate:  " + getPovertyRate(array, getRelativeNeedsIncome(array)));
    }

    public static double getPovertyRate(double[] array, double income) {

        int familyInPoverty = 0;
        double result;

        for (int i = 0; i < array.length; ++i) {
            if (array[i] < income) {
                familyInPoverty++;
            }
        }
        result = familyInPoverty / array.length;

        return result;
    }

    public static double getRelativeNeedsIncome(double[] array) {
        return 0.6 * getMedian(array);
    }

    public static double getAverage(double[] i) {
        double sum = 0, average;

        for (double j : i) {
            sum += j;
        }
        average = sum / i.length;
        return average;
    }

    public static double getMedian(double[] i) {
        double[] j = Arrays.copyOf(i, i.length);
        Arrays.sort(j);
        if (j.length % 2 == 0) {
            return (j[j.length / 2] + j[(j.length / 2) - 1]) / (double) 2;
        } else {
            return j[j.length / 2];
        }
    }
}
