package hus.oop.lab2;

import java.util.Scanner;

public class CheckHexString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isHex(str)){
            System.out.println(str + " is a hexadecimal number");
        } else {
            System.out.println(str + " is not a hexadecimal number");
        }
    }


    public static boolean isHex(String str) {
        for (char ch : str.toCharArray()) {
            if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f'))) {
                return false;
            }
        }
        return true;

    }
}
