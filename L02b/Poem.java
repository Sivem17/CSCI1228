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
 * @author Aitezaz Siddiqi (A00431079)
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
        // TODO: initialize the array
        lines = new String[MAX_LINES];
        // TODO: initialize number of lines
        numLines = 0;
    }

    // ---------- Public Methods ------------------------------------------ //
    /**
     * Add the given line to the end of the poem. Fail SILENTLY if there's no
     * room to add the line.
     *
     * @param line the line to add to this poem.
     */
    public void addLine(String line) {
        // TODO: check if there's space for another line
        if (numLines < MAX_LINES) {
            lines[numLines] = line;
            // TODO: update the line count
            if (numLines + 1 < MAX_LINES) {
                numLines++;
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

        for (int j = 0; j < numLines; ++j) {
            // TODO: print each line of the poem
            System.out.println(lines[j]);
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
