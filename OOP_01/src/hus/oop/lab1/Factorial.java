package hus.oop.lab1;

/**
 * Print factorial of n.
 */
public class Factorial {
    public static void main(String[] args) { // Set an initial breakpoint at this statement
        int n = 20;  // Number for which we want the factorial
        long  factorial = 1; // Initialize factorial variable to 1

        // n! = 1 * 2 * 3 ... * n
        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            factorial = factorial * i; // Multiply factorial by i in each iteration
        }

        System.out.println("The hus.oop.lab1.Factorial of " + n + " is " + factorial); // Print the result
    }
}
