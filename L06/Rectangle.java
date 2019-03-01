/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l06a;

import java.util.Comparator;

/**
 * A class of rectangles.
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class Rectangle implements Measurable, Comparable<Rectangle> {

    //All Comparator variables.
    public static final Comparator<Rectangle> BY_WIDTH
            = (Rectangle one, Rectangle other) -> {
                return one.getWidth().compareTo(other.getWidth());
            };

    public static final Comparator<Rectangle> BY_HEIGHT
            = (Rectangle one, Rectangle other) -> {
                return one.getHeight().compareTo(other.getHeight());
            };
    /**
     * the width of this rectangle
     */
    private double myWidth;
    /**
     * the height of this rectangle
     */
    private double myHeight;

    /**
     * Create a rectangle with the given dimensions.
     *
     * @param width the width of the new rectangle
     * @param height the height of the new rectangle
     */
    public Rectangle(double width, double height) {
        myWidth = width;
        myHeight = height;
    }

    /**
     * Get this rectangle's height.
     *
     * @return the height of this rectangle
     */
    public Double getHeight() {
        return myHeight;
    }

    /**
     * Get this rectangle's width.
     *
     * @return the width of this rectangle
     */
    public Double getWidth() {
        return myWidth;
    }

    /**
     * Get this rectangle's perimeter.
     *
     * @return the perimeter of this rectangle
     */
    @Override
    public double getPerimeter() {
        return 2 * (myWidth + myHeight);
    }

    /**
     * Get this rectangle's area.
     *
     * @return the area of this rectangle
     */
    @Override
    public double getArea() {
        return myWidth * myHeight;
    }

    /**
     * Create a String representation of this Rectangle.
     *
     * @return a String showing this Rectangle's dimensions
     */
    @Override
    public String toString() {
        return "Rectangle (" + myWidth + "x" + myHeight + ")";
    }

    /**
     *
     * @param t A Rectangle object.
     * @return
     */
    @Override
    public int compareTo(Rectangle t) {
        return (int) Math.signum(this.getArea() - t.getArea());
    }

}
