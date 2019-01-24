package l02;

import java.util.Scanner;

/**
 * Holds a 0-10 rating and one-line review for a book/movie/game/.... DO NOT
 * MODIFY THIS FILE
 *
 * @author Mark Young -- A00000000
 * @author Aitezaz Siddiqi (A00431079)
 */
public class Rating {

    // ---------- Class Constants ----------------------------------------- //
    /**
     * The maximum allowable rating
     */
    public static final int MAX_RATING = 10;
    /**
     * The minimum allowable rating
     */
    public static final int MIN_RATING = 0;

    // ---------- Instance Variables -------------------------------------- //
    public final int RATING;
    public final String REVIEW;

    // ---------- Class Variables ----------------------------------------- //
    private static Scanner kbd = new Scanner(System.in);

    // ---------- Constructors -------------------------------------------- //
    public Rating(int rated, String reviewed) {
        // assign rating to be in range
        RATING = inRange(MIN_RATING, MAX_RATING, rated);

        // review can be anything
        REVIEW = reviewed;
    }

    // ---------- Instance Methods --------------------------------------- //
    @Override
    public String toString() {
        return RATING + " -- " + REVIEW;
    }

    // ---------- Class Methods ------------------------------------------ //
    /**
     * Request a rating and review from the user.
     *
     * @param itemName name of the work to be rated/reviewed
     * @return a Rating object for the work named
     */
    public static Rating readRating(String itemName) {
        System.out.print("Rate " + itemName + " on a scale from "
                + MIN_RATING + " to " + MAX_RATING + ": ");
        int rated = kbd.nextInt();
        kbd.nextLine();
        while (!validRating(rated)) {
            System.out.print("Please enter a rating between "
                    + MIN_RATING + " and " + MAX_RATING + ": ");
            rated = kbd.nextInt();
            kbd.nextLine();
        }
        System.out.println("Enter a ONE-LINE review below.");
        String reviewed = kbd.nextLine();

        return new Rating(rated, reviewed);
    }

    /**
     * Whether the given rating in the appropriate range.
     *
     * @param rating the supposed rating
     * @return whether it's in the range of allowed ratings
     */
    public static boolean validRating(int rating) {
        return MIN_RATING <= rating && rating <= MAX_RATING;
    }

    // ---------- Private Methods ---------------------------------------- //
    /**
     * Restrict the given rating to the appropriate range.
     *
     * @param rating the supposed rating
     * @return rating itself, if it's in range; low or high if rating is below
     * or above (respectively) the range bounds.
     */
    public static int inRange(int low, int high, int rating) {
        return Math.max(low, Math.min(rating, high));
    }

}
