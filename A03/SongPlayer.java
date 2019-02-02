package a03;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class SongPlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        Song[] song = new Song[20];
        String songTitle, songLength;

        int numSongs = 0;

        printIntroduction();

        for (int i = 0; i < song.length; ++i) {

            System.out.print("Enter song title: ");
            songTitle = kbd.nextLine();
            if (songTitle.isEmpty()) {
                break;
            }
            System.out.print("Enter song length (e.g. 3:07): ");
            songLength = kbd.nextLine();
            System.out.println("The song " + songTitle + " (" + songLength + ") has been added.");
            song[i] = new Song(songTitle, songLength);
            numSongs++;
        }

        int[] shuffledOrder = makeShuffleOrder(numSongs);
        for (int i = 0; i < numSongs; ++i) {
            song[shuffledOrder[i]].play();
        }

    }

    /**
     * Prints the introduction.
     */
    private static void printIntroduction() {

        System.out.println("Song Player\n"
                + "-----------\n\n"
                + "Aitezaz Siddiqi (A00431079)\n\n"
                + "This Player can hold up to 20 songs, and plays them in a "
                + "random order.\n\n"
                + "Enter the song titles and lengths below. "
                + "Leave the title blank to end early.\n");
    }

    /**
     * A method which shuffles the order.
     *
     * @param howMany Number of Songs
     * @return
     */
    private static int[] makeShuffleOrder(int howMany) {

        int temp;
        int[] songs = new int[howMany];

        for (int i = 0; i < songs.length; ++i) {
            songs[i] = i;
        }
        System.out.println(Arrays.toString(songs));

        for (int i = 0; i < songs.length; ++i) {
            int swapLoc = (int) (howMany * Math.random());
            temp = songs[i];
            songs[i] = songs[swapLoc];
            songs[swapLoc] = temp;
        }
        return songs;
    }

}
