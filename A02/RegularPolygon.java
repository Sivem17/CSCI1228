package a02;

/**
 *
 * @author Aitezaz Siddiqi
 */
public class RegularPolygon {

    public final int numOfSides;
    public final double lengthOfSides;

    RegularPolygon(int numSides, double lengthSides) {
        if (numSides < 0) {
            numOfSides = 0;
        } else {
            numOfSides = numSides;
        }
        if (lengthSides < 0) {
            lengthOfSides = 0;
        } else {
            lengthOfSides = lengthSides;
        }
    }

    public final int getNumOfSides() {
        return numOfSides;
    }

    public final double getLengthOfSides() {
        return lengthOfSides;
    }

    public final double getPerimeter() {
        return numOfSides * lengthOfSides;
    }

    public final double getArea() {
        return ((double) numOfSides * Math.pow(lengthOfSides, 2)
                / (4.00 * (double) Math.tan(Math.PI / numOfSides)));
    }

}
