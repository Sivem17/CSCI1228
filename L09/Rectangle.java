package l09;

/**
 * A class that represents a rectangle.
 *
 * @author Mark Young (A00000000)
 * @author Aitezaz Siddiqi (A00431079)
 */
public class Rectangle {

    /**
     * Rectangles have length and width
     */
    private double length, width;

    /**
     * Create a rectangle of the given dimensions
     */
    public Rectangle(double l, double w) throws NegativeDimensionException {
        length = l;
        width = w;
        if (length < 0) {
            throw new NegativeDimensionException();
        }
        if (width < 0) {
            throw new NegativeDimensionException();
        }

    }

    /**
     * Return the length of this Rectangle.
     */
    public double getLength() {
        return length;
    }

    /**
     * Return the width of this Rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Change the length of this Rectangle.
     */
    public void setLength(double newLength) throws NegativeDimensionException {
        try {
            length = newLength;
        } catch (NegativeDimensionException e) {
            System.out.println("Exception: NegativeDimensionException: length " + newLength);
        }
    }

    /**
     * Change the width of this Rectangle.
     */
    public void setWidth(double newWidth) throws NegativeDimensionException {
        try {
            width = newWidth;
        } catch (NegativeDimensionException e) {
            System.out.println("Exception: NegativeDimensionException: length " + newWidth);
        }
    }

    /**
     * Return the perimeter of this Rectangle.
     */
    public String toString() {
        return String.format("(%.1f x %.1f)", length, width);
    }

}
