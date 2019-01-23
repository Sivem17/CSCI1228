/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l02;

import java.util.Arrays;

/**
 * A class to hold the title and lines of a poem. DO NOT REVISE THIS CLASS!
 *
 * @author Mark Young (A00000000)
 */
public class Poem {

    // ---------- Class Constants ----------------------------------------- //
    /**
     * The maximum number of lines allowed in our poem.
     */
    public static final int MAX_LINES = 20;

    // ---------- Instance Variables -------------------------------------- //
    private String title;
    private String[] lines;
    private int numLines;

    // ---------- Constructor --------------------------------------------- //
    /**
     * Create an empty poem with the given title.
     *
     * @param title the title of the poem.
     */
    public Poem(String title) {
        this.title = title;
        lines = new String[MAX_LINES];  // TODO: initialize the array
        numLines = 0;                   // TODO: initialize number of lines
    }

    // ---------- Public Methods ------------------------------------------ //
    /**
     * Add the given line to the end of the poem. Fail SILENTLY if there's no
     * room to add the line.
     *
     * @param line the line to add to this poem.
     */
    public void addLine(String line) {
        if (numLines < MAX_LINES) {     // TODO: check if there's space for another line
            for (int i = 0; i < MAX_LINES; ++i) {
                lines[i] = line;        // TODO: add the line to the array
                numLines++;             // TODO: update the line count
            }
        }
    }

    /**
     * Print out the poem, with underlined title.
     */
    public void print() {
        // print title
        System.out.println();
        printUnderlined(title);
        System.out.println();
        
//        System.out.println(Arrays.toString(lines));
        for (int i = 0; i < numLines; ++i) {
            System.out.println(lines[i]);      // TODO: print each line of the poem
        }
    }
    // ---------- Private Methods ----------------------------------------- //

    /**
     * Print the given string, then underline it.
     *
     * @param title the string to be printed
     */
    private void printUnderlined(String title) {
        System.out.println(title);
        for (int i = 0; i < title.length(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}
