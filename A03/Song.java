/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a03;

import java.util.Scanner;

/**
 * A class to hold very basic information about a song
 *
 * @author Mark Young (A00000000)
 * @version 1.0
 */
public class Song {

    // ---------- Instance Variables -------------------------------------- //
    private String title;
    private int totalSeconds;
    private String time;

    // ---------- Constructors -------------------------------------------- //
    /**
     * Create a song from its title and running time
     *
     * @param t the title of the song
     * @param l song's run time (<i>mm</i>:<i>ss</i> -- for example: "3:07")
     */
    public Song(String t, String l) {
        java.util.Scanner reader = new Scanner(l);
        reader.useDelimiter(":");
        int mins = reader.nextInt();
        int secs = reader.nextInt();

        setFields(t, mins, secs);
    }

    // ---------- Public Methods ------------------------------------------ //
    /**
     * The length of this Song, in seconds.
     *
     * @return the running time of the song (in seconds)
     */
    public int getLengthInSeconds() {
        return totalSeconds;
    }

    /**
     * "Play" the song
     */
    public void play() {
        System.out.print("\nNow Playing: " + title);
        for (int i = 0; i < totalSeconds; i++) {
            if (i % 25 == 0) {
                System.out.println();
            }
            System.out.print("na ");
            try {
                Thread.sleep((int) (100 * Math.random()));
            } catch (Exception e) {
            }
        }
        System.out.println();
    }

    /**
     * Return a string representation of the song, including its title and run
     * time.
     *
     * @return a String for the song: "<i>title</i> (<i>run-time</i>)"
     */
    public String toString() {
        return title + " (" + time + ")";
    }

    // ---------- Private Methods ----------------------------------------- //
    /**
     * Set the all the instance variables in this object. Called by the
     * constructor.
     *
     * @param t title of song
     * @param minutes the running time (minutes part -- the 3 of 3:07)
     * @param seconds the running time's excess seconds (the 7 of 3:07)
     */
    private void setFields(String t, int minutes, int seconds) {
        title = t;
        totalSeconds = 60 * minutes + seconds;
        time = minutes + ":" + (seconds < 10 ? "0" : "") + seconds;
    }

}
