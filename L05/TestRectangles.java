/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l05;

import java.util.Scanner;

/**
 * A program to test the Rectangle (and Square) class(es).
 *
 * @author Mark Young (A00000000)
 */
public class TestRectangles {

    private static final Scanner KBD = new Scanner(System.in);

    public static void main(String[] args) {
        // standard Rectangles
        Rectangle r1, r2, r3, r4;

        // Create them
        r1 = new Rectangle(3, 5);
        r2 = new Rectangle(25, 2);
        r3 = new Rectangle(5, 3);
        r4 = new Rectangle(3, 5);

        // talk about them
        sayAbout(r1);
        sayAbout(r2);
        sayAbout(r3);
        sayAbout(r4);

        // compare them
        testEquals(r1, r2);
        testEquals(r1, r3);
        testEquals(r1, r4);
        pause();

        // revise one
        r2.setHeight(5);
        sayAbout(r2);

        // Activate the following code once you have Square declared
        Square s1, s2;
        Rectangle r5;

        // create them
        s1 = new Square(5);
        s2 = new Square(2);
        r5 = new Rectangle(5, 5);

        // talk about them
        sayAbout(s1);
        sayAbout(s2);
        sayAbout(r5);

        // compare them
        testEquals(s1, s2);
        testEquals(s1, r1);
        testEquals(s1, r5);
        pause();

        // revise them
        s1.setHeight(10);
        s2.setWidth(4);
        r5.setWidth(10);
        sayAbout(s1);
        sayAbout(s2);
        sayAbout(r5);
    }

    /**
     * Say some stuff about the given Rectangle.
     *
     * @param r the Rectangle to opine on.
     */
    private static void sayAbout(Rectangle r) {
        System.out.println("My argument is " + r);
        System.out.println(" - its height is " + r.getHeight());
        System.out.println(" - its width is " + r.getWidth());
        System.out.println(" - its area is " + r.getArea());
        System.out.println(" - its perimeter is " + r.getPerimeter());
        System.out.println();
        System.out.println("And here it is:");
        r.draw();
        pause();
    }

    /**
     * Compare two Rectangles for equality (same height and width).
     *
     * @param r1 the Rectangle to ask
     * @param r2 the Rectangle to ask about
     */
    private static void testEquals(Rectangle r1, Rectangle r2) {
        System.out.println(r1 + " is "
                + (r1.equals(r2) ? "" : "not ")
                + "equals to " + r2 + ".");
    }

    /**
     * Prompt the user and wait for them to press the enter key.
     */
    private static void pause() {
        System.out.println();
        System.out.print("...press enter...");
        KBD.nextLine();
        System.out.println();
    }
}
