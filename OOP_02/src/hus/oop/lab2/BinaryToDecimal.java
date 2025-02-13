package hus.oop.lab2;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int decimal = 0;
        if (binaryToDecimal(binary)) {
            for (int i = 0; i < binary.length(); i++) {
                if (binary.charAt(i) == '0') {

                } else {
                    decimal = decimal + (int) Math.pow(2,binary.length()-i-1);
                }

            }
            System.out.println(decimal);

        } else {
            System.out.println("No");
        }


    }
    public static boolean binaryToDecimal(String binary) {
        for (char c : binary.toCharArray()) {
            if (c != '1' && c != '0' ){
                return false;
            }
        }
        return true;
    }
}
