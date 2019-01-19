package a01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class PovertyData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int numFamilies;
        double[] incomeData;
        double minimumIncome;

        printIntroduction();
        numFamilies = getNumberOfFamilies();
        incomeData = getIncomeData( numFamilies);
        minimumIncome = getMinimumIncome();
        printPause();
        printReport(incomeData, minimumIncome);

    }
    private static void printIntroduction() {
        //Prints the required introduction
        System.out.println("A00431079 -- Siddiqi, Aitezaz\n"
                + "CSCI 1228 -- Winter 2019\n"
                + "A01 -- due 2019-01-18\n\n"
                + "Poverty Rate Program\n"
                + "--------------------\n\n"
                + "This program reads data on family incomes and produces a "
                + "report on poverty\n"
                + "rates among the families.\n");
    }
    private static int getNumberOfFamilies() {

        
        Scanner kbd1 = new Scanner(System.in);
        int numFamilies;

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
        return numFamilies;
    }
    private static double[] getIncomeData( int numFamilies) {
        
        Scanner kbd2 = new Scanner(System.in);
        double[] array = new double[numFamilies];
        for (int i = 0, j = 1; i < numFamilies; ++i, ++j) {
            System.out.print("What is the income for family #" + j + "? ");
            array[i] = kbd2.nextDouble();
            kbd2.nextLine();
            //While loop for taking in valid input.
            while (array[i] < 0) {
                System.out.println("The income must be non-negative.");
                System.out.print("What is the income for family #"
                        + j + "? ");
                array[i] = kbd2.nextDouble();
                kbd2.nextLine();
            }
        }
        System.out.println();
        return array;
    }
    private static double getMinimumIncome() {
        
        Scanner kbd3 = new Scanner(System.in);
        double minIncome;
        System.out.print("What is the minimum income required to "
                + "support a family? ");
        minIncome = kbd3.nextDouble();
        kbd3.nextLine();
        while (minIncome <= 0) {
            System.out.println("The income must be positive.");
            System.out.print("What is the minimum income required to "
                    + "support a family? ");
            minIncome = kbd3.nextDouble();
            kbd3.nextLine();
        }
        return minIncome;
    }
    private static void printPause() {
        
        Scanner kbd3 = new Scanner(System.in);
        System.out.println();
        System.out.print("Press Enter...");
        kbd3.nextLine();
        System.out.println();
    }
    private static void printReport(double[] array, double basicIncome) {
        System.out.println("Report\n"
                + "------\n"
                + "Average Income:        $" + getAverage(array) + "\n"
                + "Basic Needs Income:    $" + basicIncome + "\n"
                + "Absolute Poverty Rate:  "
                + getPovertyRate(array, basicIncome));

        System.out.println("Report\n"
                + "------\n"
                + "Median Income:         $" + getMedian(array) + "\n"
                + "Relative Needs Income: $" + getRelativeNeedsIncome(array)
                + "\n" + "Relative Poverty Rate:  "
                + getPovertyRate(array, getRelativeNeedsIncome(array)) + "%");
    }
    private static double getPovertyRate(double[] array, double income) {
        double familyInPoverty = 0;

        for (int i = 0; i < array.length; ++i) {
            if (array[i] < income) {
                familyInPoverty++;
            }
        }
        return (familyInPoverty / array.length) * 100;
    }
    private static double getRelativeNeedsIncome(double[] array) {
        return 0.6 * getMedian(array);
    }
    private static double getAverage(double[] i) {
        double sum = 0, average;

        for (int j = 0; j < i.length; j++) {
            sum = sum + i[j];
        }
        average = sum / i.length;
        return average;
    }
    private static double getMedian(double[] i) {
        double[] j = Arrays.copyOf(i, i.length);
        Arrays.sort(j);
        if (j.length % 2 == 0) {
            return (j[j.length / 2] + j[(j.length / 2) - 1]) / (double) 2;
        } else {
            return j[j.length / 2];
        }
    }
}
