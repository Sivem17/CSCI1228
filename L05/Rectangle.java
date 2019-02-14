package l05;

/**
 * A program to represent a simple Rectangle.
 *
 * @author Mark Young (A00000000)
 */
public class Rectangle {

    // ---------- Instance variables -------------------------------------- //
    //
    private int height;
    private int width;

    // ---------- Constructors -------------------------------------------- //
    //
    /**
     * Create a new Rectangle object.
     *
     * @param h its height
     * @param w its width
     */
    public Rectangle(int h, int w) {
        height = Math.max(1, h);
        width = Math.max(1, w);
    }

    // ---------- Getters ------------------------------------------------- //
    //
    /**
     * The height of this Rectangle.
     *
     * @return the height of this Rectangle
     */
    public int getHeight() {
        return height;
    }

    /**
     * The width of this Rectangle.
     *
     * @return the width of this Rectangle
     */
    public int getWidth() {
        return width;
    }

    /**
     * The area of this Rectangle.
     *
     * @return the area of this Rectangle
     */
    public int getArea() {
        return height * width;
    }

    /**
     * The perimeter of this Rectangle.
     *
     * @return the perimeter of this Rectangle
     */
    public int getPerimeter() {
        return 2 * (height + width);
    }

    // ---------- Setters ------------------------------------------------- //
    //
    /**
     * Change the height of this Rectangle.
     *
     * @param newHeight the new height of this Rectangle
     */
    public void setHeight(int newHeight) {
        if (newHeight > 0) {
            height = newHeight;
        }
    }

    /**
     * Change the width of this Rectangle.
     *
     * @param newWidth the new width of this Rectangle
     */
    public void setWidth(int newWidth) {
        if (newWidth > 0) {
            width = newWidth;
        }
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
     * An equals method.
     *
     * @param object1 object.
     * @return true.
     */
    @Override
    public boolean equals(Object object1) {
        Rectangle r = (Rectangle) object1;
        if (object1 == null) {
            return false;
        }
        if (!(object1 instanceof Rectangle)) {
            return false;
        }
        if (r.height == height && r.width == width) {
            return true;
        } else {
            return false;
        }
    }
    // ---------- Other public methods ------------------------------------ //
    //

    /**
     * Draw this Rectangle on the standard output.
     */
    public void draw() {
        // for each line of the rectangle
        for (int i = 0; i < height; ++i) {

            // draw an appropriate number of stars
            for (int j = 0; j < width; ++j) {
                System.out.print("* ");
            }

            // and then end the line
            System.out.println();
        }
    }

}
