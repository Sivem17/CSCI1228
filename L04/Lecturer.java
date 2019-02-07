package l04;

/**
 * A class that extends Person..
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class Lecturer extends Person {

    //All instance variables and constants.
    private double stipend;
    public static final double DEFAULT_STIPEND = 9144;

    /**
     * A constructor which accepts a name(from Person class) and a stipend
     * amount.
     *
     * @param name Name of the lecturer.
     * @param stipend Stipend of the lecturer.
     */
    public Lecturer(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    /**
     * Another constructor which only accepts a name(from Person class) and uses
     * the default stipend.
     *
     * @param name Name of the lecturer.
     */
    public Lecturer(String name) {
        this(name, DEFAULT_STIPEND);
    }

    /**
     * Prints the respective name and stipend of the lecturer.
     */
    public void writeOutput() {
        System.out.println("Name: " + getName());
        System.out.println("Stipend: " + getStipend());
    }

    /**
     * A setter which changes the stipend value of the lecturer.
     *
     * @param stipendAmount Stipend of the lecturer.
     */
    public void setStipend(double stipendAmount) {
        this.stipend = stipendAmount;
    }

    /**
     * A getter which returns the stipend of the lecturer.
     *
     * @return Stipend of the lecturer.
     */
    public double getStipend() {
        return this.stipend;
    }

}
