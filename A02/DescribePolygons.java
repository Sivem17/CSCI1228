package a02;

import java.util.Scanner;

/**
 *
 * @author Aitezaz Siddiqi(A00431079)
 */
public class DescribePolygons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        RegularPolygon p;
        int numSides;
        double lengthSides;

        printIntroduction();
        System.out.println("A00431079 -- Siddiqi, Aitezaz\n"
                + "CSCI1228 -- Winter 2019\n"
                + "A02 -- due 2019-01-25\n\n"
                + "Regular Polygons\n"
                + "----------------\n\n"
                + "This program reads the information for regular polygons "
                + "and reports their \nperimeter and area.");

        System.out.print("How many sides does the polygon have? ");
        numSides = kbd.nextInt();
        kbd.nextLine();

        while (numSides > 0) {
            System.out.print("How long is each side of the polygon? ");
            lengthSides = kbd.nextDouble();
            kbd.nextLine();

            while (lengthSides < 0) {
                System.out.println("You can't have negative length sides!");
                System.out.println("How long is each side of the polygon? ");
                lengthSides = kbd.nextDouble();
                kbd.nextLine();
            }

            p = new RegularPolygon(numSides, lengthSides);

            printReport(p);

            System.out.println();
            System.out.print("How many sides does the polygon have? ");
            numSides = kbd.nextInt();
            kbd.nextLine();
        }

        System.out.println("\nSo long, and thanks for all the Math!");
    }

    public static void printIntroduction() {

        System.out.println("A00431079 -- Siddiqi, Aitezaz\n"
                + "CSCI1228 -- Winter 2019\n"
                + "A02 -- due 2019-01-25\n\n"
                + "Regular Polygons\n"
                + "----------------\n\n"
                + "This program reads the information for regular polygons "
                + "and reports their \nperimeter and area.");
    }

    public static void printReport(RegularPolygon p) {
        
        System.out.print("Your polygon: \n");
        System.out.print("\tNumber of sides: " + p.getNumOfSides() + "\n"
                + "\tLength of each side: " + p.getLengthOfSides() + "\n"
                + "\tPerimeter length: " + p.getPerimeter() + "\n"
                + "\tPolygon area: " + p.getArea());
        System.out.println();

    }
}
