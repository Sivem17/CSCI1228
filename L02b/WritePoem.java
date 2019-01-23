/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l02;

/**
 * A program to print out the first few lines of "Old Tom Bombadil",
 * a poem by J.R.R. Tolkien.
 *
 * @author Mark Young (A00000000)
 */
public class WritePoem {

    public static void main(String[] args) {
        // create the poem object
        Poem bombadil = new Poem("Old Tom Bombadil");

        // add the lines
        bombadil.addLine("Old Tom Bombadil was a merry fellow!");
        bombadil.addLine("    Bright blue his jacket was, "
            + "and his boots were yellow.");
        bombadil.addLine("Green was his girdle, "
            + "and his breeches all of leather.");
        bombadil.addLine("    He wore in his tall hat a swan wing feather.");
        bombadil.addLine("He lived up Underhill, where the Withywindle");
        bombadil.addLine("    Ran from a grassy well down into the dingle.");

        // print it out
        bombadil.print();
    }

}

