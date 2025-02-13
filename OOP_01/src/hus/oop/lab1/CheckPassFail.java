package hus.oop.lab1;

/**
 * Trying if-else statement.
 */
public class CheckPassFail { // Save as "hus.oop.lab1.CheckPassFail.java"
    public static void main(String[] args) { // Program entry point
        int mark = 49; // Set the value of "mark" here!
        System.out.println("The mark is " + mark);

        // if-else statement
        if (mark >= 50) { // Check if mark is greater than or equal to 50
            System.out.println("You have passed!");
        } else {
            System.out.println("You have failed.");
        }

        System.out.println("End of program.");
    }
}
