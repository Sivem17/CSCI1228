package l01b;

/**
 * A class to hold some very basic information about a student.
 *
 * @author Mark Young (A00000000)
 * @author Aitezaz Siddiqi (A00431079)
 * @version 2.0 (2014-11-03)
 */
public class Student {

    /**
     * The student's A-Number
     */
    public final String A_NUMBER;
    /**
     * The student's name
     */
    private String name;
    /**
     * The student's grade (as a percentage)
     */
    private int pctGrade;
    /**
     * The student's email
     */
    private String email;

    // Class information -- common to all Students //
    /**
     * The number for the next Student created
     */
    private static int nextANumber = 1;

    /**
     * Maximum possible percentage grade
     */
    public static final int MAX_GRADE = 100;
    /**
     * Minimum possible percentage grade
     */
    public static final int MIN_GRADE = 0;

    /**
     * Create a Student object.
     *
     * @param name the requested name
     * @param pctGrade the requested percentage grade (must be 0..100)
     */
    public Student(String name, int pctGrade) {
        // assign next A-Number to this Student
        this.A_NUMBER = String.format("A%08d", nextANumber);
        ++nextANumber;

        // set personal data
        this.name = name;
        if (isValidGrade(pctGrade)) {
            this.pctGrade = pctGrade;
        } else {
            this.pctGrade = 0;
        }
        this.email = "(none)";
    }

    /**
     * BONUS Constructor! Create a Student object with an initial grade of 0%.
     *
     * @param n the requested name
     */
    public Student(String n) {
        // get the OTHER constructor to do it:
        //  *it* needs both a name and a number,
        //  so we give it the name we got (n)
        //  and the number 0 (Students typically start with no grades)
        this(n, 0);
    }

    /**
     * Get the value of A_NUMBER
     *
     * @return the value of A_NUMBER
     */
    public String getANumber() {
        return this.A_NUMBER;
    }

    /**
     * Get the value of pctGrade
     *
     * @return the value of pctGrade
     */
    public int getPctGrade() {
        return this.pctGrade;
    }

    /**
     * Set the value of pctGrade
     *
     * @param pctGrade new value of pctGrade (must be 0..100)
     */
    public void setPctGrade(int pctGrade) {
        if (isValidGrade(pctGrade)) {
            this.pctGrade = pctGrade;
        }
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return this.name;
    }

    /**
     * get letter grade for this student
     *
     * @return the letter grade equivalent to this student's percentage grade
     * @since 2.0
     */
    public String getLetterGrade() {
        return Student.letterGradeFor(this.pctGrade);
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Change both name and grade.
     *
     * @param n requested new name
     * @param g requested new grade (must be 0..100)
     */
    public void set(String n, int g) {
        this.setName(n);
        this.setPctGrade(g);
    }

    /**
     * Print a brief summary of the student's data.
     */
    public void printStudentRecord() {
        System.out.println("Number: " + this.A_NUMBER);
        System.out.println("Name:   " + this.name);
        System.out.println("Grade:  " + this.pctGrade);
        System.out.println("Letter: " + this.getLetterGrade());
    }

    /**
     * Create a String to represent this Student. This version uses their name
     * and A-number.
     *
     * @return a String representing this Student
     */
    @Override
    public String toString() {
        return this.name + " (" + this.A_NUMBER + ")";
    }

    /**
     * Return whether a given grade is in the valid range.
     *
     * @param g the grade to check for validity
     * @return whether g is in the correct range.
     * @since 2.0
     */
    public static boolean isValidGrade(int g) {
        return (MIN_GRADE <= g && g <= MAX_GRADE);
    }

    /**
     * Return the letter grade corresponding to the given grade.
     *
     * @param g the percentage grade to be converted to a letter grade.
     * @return the letter grade corresponding to g.
     * @since 2.0
     */
    public static String letterGradeFor(int g) {
        if (g < 50) {
            return "F";
        } else if (g < 60) {
            return "D";
        } else if (g < 70) {
            return "C";
        } else if (g < 80) {
            return "B";
        } else {
            return "A";
        }
    }

    /**
     * Change the value of email.
     *
     * @param e the new value of email.
     */
    public void setEmail(String e) {
        if (e.contains("@")) {
            this.email = e;
        }
    }

    /**
     * Get the value of email.
     *
     * @return the value of email.
     */
    public String getEmail() {
        return this.email;
    }

}
