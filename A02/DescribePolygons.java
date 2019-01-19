/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        printIntroduction();
        numOfSides(kbd);
    }

    public static void printIntroduction() {
        System.out.println("A00431079 -- Siddiqi, Aitezaz\n"
                + "CSCI1228 -- Winter 2019\n"
                + "A02 -- due 2019-01-25\n\n"
                + "Regular Polygons\n"
                + "----------------\n\n"
                + "This program reads the information for regular polygons "
                + "and reports their \nperimeter and area");
    }

    public static int numOfSides(Scanner kbd1) {
        int numSides;
        System.out.println("How many sides does the polygon have? ");
        numSides = kbd1.nextInt();
        while (numSides < 0) {
            System.out.println("How many sides does the polygon have? ");
            numSides = kbd1.nextInt();
        }
        return numSides;
    }

}
