package a02;

import java.util.Scanner;

/**
 *
 * @author Aitezaz Siddiqi
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
            printPause(kbd);
            System.out.print("How many sides does the polygon have? ");
            numSides = kbd.nextInt();
            kbd.nextLine();
        }
        System.out.println("\nSo long, and thanks for all the Math!");
    }
    public static void printReport(RegularPolygon p) {        
        System.out.print("Your polygon: \n");
        System.out.print("Number of sides: " + p.getNumOfSides() + "\n"
                + "Length of each side: " + p.getLengthOfSides() + "\n"
                + "Perimeter length: " + p.getPerimeter() + "\n"
                + "Polygon area: " + p.getArea());
    }
    private static void printPause(Scanner kbd) {
        System.out.println();
        System.out.print("Press enter...");
        kbd1.nextLine();
        System.out.println();
    }
}
