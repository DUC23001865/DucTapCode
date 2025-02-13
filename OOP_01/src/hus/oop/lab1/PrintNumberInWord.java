package hus.oop.lab1;

/**
 * Trying nested-if and switch-case statements.
 */
public class PrintNumberInWord { // Save as "hus.oop.lab1.PrintNumberInWord.java"
    public static void main(String[] args) {
        int number = 5; // Set the value of "number" here!

        // Using nested-if
        if (number == 1) { // Use == for comparison
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Invalid number");
        }

        // Using switch-case-default
        switch (number) {
            case 1:
                System.out.println("One");
                break; // Don't forget the "break" after each case!
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
