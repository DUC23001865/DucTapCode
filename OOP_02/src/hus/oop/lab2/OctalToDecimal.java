package hus.oop.lab2;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.nextLine();
        if (!isOctal(octal)) {
            System.out.println("Not a valid octal number");

        }
        else {
            int decimal = 0;
            for (int i = 0; i < octal.length(); i++) {
                char ch = octal.charAt(i);
                int value = ch - '0';
                decimal += value * (int)Math.pow(8,octal.length()-1-i);

            }
            System.out.println(decimal);
        }


    }
    public static boolean isOctal(String octal) {
        for (char ch : octal.toCharArray()) {
            if (!('0' <= ch && ch <= '7')) {
                return false;
            }

        }
        return true;

    }
}
