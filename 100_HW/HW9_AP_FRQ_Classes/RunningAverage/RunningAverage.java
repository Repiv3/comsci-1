import java.util.*;

public class RunningAverage {
    /** The number of ratings included in the running average. */
    private int count;

    /** The average of the ratings that have been entered. */
    private double average;

    // There are no other instance variables.

    /** Creates a RunningAverage object.
    * Postcondition: count is initialized to 0 and average is
    * initialized to 0.0.
    */
    public RunningAverage() {
        count = 0;
        average = 0.0;
    }

    /** Updates the running average to reflect the entry of a new
    * rating, as described in part (a).
    */
    public void updateAverage(double newVal) {
        double num1 = count * average;
        double num2 = num1 + newVal;
        double num3 = num2 / (count + 1);
        average = num3;
        count++;
    }

    /** Processes num new ratings by considering them for inclusion
    * in the running average and updating the running average as
    * necessary. Returns an integer that represents the number of
    * invalid ratings, as described in part (b).
    * Precondition: num > 0
    */
    public int processNewRatings(int num) {
        int invalidRatings = 0;

        while (num > 0) {
            double randRating = getNewRating();
            if (randRating >= 0) {
                updateAverage(randRating);
            } else {
                invalidRatings++;
            }
            num--;
        }

        return invalidRatings;
    }

    /** Returns a single numeric rating. */
    public double getNewRating() {
        // Implementation not shown in the example
        return new Random().nextDouble() * 5; // Generates a random rating between 0 and 5
    }
}
