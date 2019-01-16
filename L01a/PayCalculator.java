package l01a;

/**
 * PayCalculator class figures out how much pay someone should be given based on
 * their wage rate and hours worked.
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
class PayCalculator {

    //INITIALIZE INSTANT VARIABLES
    public static final int REGULAR_HOURS = 40;

    /**
     * The method calculates and return the pay, based on the pay rate and hours
     * of work given to it.For overtime they get paid at time-and-a-half.
     *
     * @param payRate The pay rate per hour of working.
     * @param hoursWorked Number of hours someone worked.
     * @return the pay
     */
    public static double calculatePay(double payRate, double hoursWorked) {
        if (hoursWorked > REGULAR_HOURS) {
            return ((REGULAR_HOURS * payRate)
                    + ((hoursWorked - REGULAR_HOURS) * payRate * 1.5));
        } else {
            return (hoursWorked * payRate);
        }
    }

}
