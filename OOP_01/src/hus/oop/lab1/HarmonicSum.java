package hus.oop.lab1;

/**
 * Compute the sum of harmonic series from left-to-right and right-to-left.
 */
public class HarmonicSum { // Save as "hus.oop.lab1.HarmonicSum.java"
    public static void main(String[] args) {
        // Define variables
        final int MAXDENOMINATOR = 5000; // Use a more meaningful name

        double sumL2R = 0.0; // Sum from left-to-right
        double sumR2L = 0.0; // Sum from right-to-left
        double absDiff; // Absolute difference between the two sums

        // For-loop for summing from left-to-right
        for (int denominator = 1; denominator <= MAXDENOMINATOR; ++denominator) {
            sumL2R += 1.0 / denominator; // Adding the reciprocal of denominator
        }

        System.out.println("The sum from left-to-right is: " + sumL2R);

        // For-loop for summing from right-to-left
        for (int denominator = MAXDENOMINATOR; denominator >= 1; --denominator) {
            sumR2L += 1.0 / denominator; // Adding the reciprocal of denominator
        }

        System.out.println("The sum from right-to-left is: " + sumR2L);

        // Find the absolute difference and display
        absDiff = Math.abs(sumL2R - sumR2L); // Use Math.abs to calculate the absolute difference
        System.out.println("The absolute difference is: " + absDiff);

        // Compare sums and display which one is larger (although they should be very close)
        if (sumL2R > sumR2L) {
            System.out.println("The sum from left-to-right is larger.");
        } else if (sumL2R < sumR2L) {
            System.out.println("The sum from right-to-left is larger.");
        } else {
            System.out.println("The sums are equal.");
        }
    }
}
