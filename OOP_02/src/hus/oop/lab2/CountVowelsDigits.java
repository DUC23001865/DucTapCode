package hus.oop.lab2;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("Enter a String" + word);
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                vowels++;
            } else {
                consonants++;
            }
        }
        double vowelsRatio = (double) (vowels * 100 )/ word.length();
        double consonantsRatio = (double) (consonants * 100 )/ word.length();
        System.out.println("Number of vowels: " + vowels +  "(" + vowelsRatio + "%)");
        System.out.println("Number of consonants: " + consonants +  "(" + consonantsRatio + "%)");
    }

}
