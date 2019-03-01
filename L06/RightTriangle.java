/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l06a;

/**
 * A class of RightTriangle.
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class RightTriangle implements Measurable {

    //All double variables.
    private double base, height;

    /**
     * Create a RightTriangle with the given dimensions.
     *
     * @param reqBase The base of the new RightTriangle.
     * @param reqHeight The height of the new RightTriangle.
     */
    public RightTriangle(double reqBase, double reqHeight) {
        base = reqBase;
        height = reqHeight;
    }

    /**
     * Get this RightTriangle's base.
     *
     * @return The base of this RightTriangle.
     */
    public double getBase() {
        return base;
    }

    /**
     * Get this RightTriangle's height.
     *
     * @return The height of this RightTriangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Get this RightTriangle's perimeter.
     *
     * @return The perimeter of this RightTriangle.
     */
    @Override
    public double getPerimeter() {
        return base + height + (Math.sqrt(Math.pow(base, 2)
                + Math.pow(height, 2)));
    }

    /**
     * Get this RightTriangle's perimeter.
     *
     * @return The area of this RightTriangle.
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    /**
     * Create a String representation of this RightTriangle.
     *
     * @return A String showing this RightTriangle's dimensions
     */
    @Override
    public String toString() {
        return "RightTriangle (" + base + "x" + height + ")";
    }

}
