package hus.oop.lab2;

import java.util.Scanner;

public class CaesarsCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(encrypt(input));
    }
    public static String encrypt(String plainText) {

        StringBuilder result = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append((char) ((c - 'A' + 3) % 26 + 'A'));
            }
            else if (Character.isLowerCase(c)) {
                result.append((char) ((c - 'a' + 3) % 26 + 'A'));
            }
            else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
