package hus.oop.lab1;

/**
 * Compute the sum and average of running integers from a lowerbound
 * to an upperbound using loop.
 */
public class SumAverageRunningInt { // Save as "hus.oop.lab1.SumAverageRunningInt.java"
    public static void main(String[] args) {
        // Define variables
        int sum = 0; // The accumulated sum, initialized to 0
        double average; // average in double

        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100; // The upper bound for the sum

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
            sum += number; // Same as "sum = sum + number"
        }

        // Compute average in double. Beware that int / int produces int!
        average = sum / (double)(UPPERBOUND - LOWERBOUND + 1); // Cast to double to avoid integer division

        // Print sum and average
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
