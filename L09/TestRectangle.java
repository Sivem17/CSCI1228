package l09;

public class TestRectangle {

    public static void main(String[] args) {
        // create variables
        Rectangle r;
        double[] values = {1.5, -1.5, 0, 3};

        // test #1
        for (int i = 0; i < values.length; ++i) {
            try {
                r = new Rectangle(5, 7);
                r.setWidth(values[i]);
                System.out.println("Rectangle: " + r);
            } catch (RuntimeException e) {
                System.out.println("Exception: " + e);
            }
        }

        // test #2
        for (int i = 0; i < values.length; ++i) {
            try {
                r = new Rectangle(5, 7);
                r.setLength(values[i]);
                System.out.println("Rectangle: " + r);
            } catch (RuntimeException e) {
                System.out.println("Exception: " + e);
            }
        }

        // test #3
        for (int i = 1; i < values.length; ++i) {
            try {
                r = new Rectangle(values[i - 1], values[i]);
                System.out.println("Rectangle: " + r);
            } catch (RuntimeException e) {
                System.out.println("Exception: " + e);
            }
        }
    }

}
