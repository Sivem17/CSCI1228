package l02;

import java.util.Arrays;

/**
 * A program which takes in 10 ratings & reviews for a title and prints them
 * out.
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class GetRatings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creates an array of Rating.
        Rating[] rating = new Rating[10];

        //Loop to access the array, read and store the value inside the array.
        for (int i = 0; i < rating.length; ++i) {
            Rating r = Rating.readRating("Two errors in in this title");
            rating[i] = r;

        }
        //Prints out the values inside array.
        System.out.println(Arrays.toString(rating));
    }

}
