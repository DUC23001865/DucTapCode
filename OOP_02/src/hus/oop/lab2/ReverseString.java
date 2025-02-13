package hus.oop.lab2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String s = sc.nextLine();
        String ch = " ";
        System.out.print("Enter a string: " + s );
        for (int i = s.length() - 1; i >= 0; i--) {
            ch = ch + s.charAt(i);
        }
        System.out.println("The reversed string is: " + ch);
    }
}
