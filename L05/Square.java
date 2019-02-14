package l05;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class Square extends Rectangle {

    //variable
    public int length;

    /**
     * A constructor.
     *
     * @param i length
     */
    public Square(int i) {
        super(i, i);
    }

    /**
     * A method to make a string.
     *
     * @return a string
     */
    @Override
    public String toString() {
        return " " + getHeight() + "x" + getWidth() + " Rectangle";
    }

    /**
     * Change the height of this Square.
     *
     * @param i height
     */
    @Override
    public void setHeight(int i) {
        super.setHeight(i);
        super.setWidth(i);
    }

    /**
     * Change the width of this Square.
     *
     * @param i width
     */
    @Override
    public void setWidth(int i) {
        super.setHeight(i);
        super.setWidth(i);
    }

}
