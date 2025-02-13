package hus.oop.lab1;

/**
 * Trying if-else statement and modulus (%) operator.
 */
public class CheckOddEven { // Save as "hus.oop.lab1.CheckOddEven.java"
    public static void main(String[] args) { // Program entry point
        int number = 49; // Set the value of "number" here!
        System.out.println("The number is " + number);

        // if-else statement with modulus operator to check for even or odd
        if (number % 2 == 0) { // If number is divisible by 2 (even)
            System.out.println("The number is even.");
        } else { // If number is not divisible by 2 (odd)
            System.out.println("The number is odd.");
        }

        System.out.println("End of program.");
    }
}
