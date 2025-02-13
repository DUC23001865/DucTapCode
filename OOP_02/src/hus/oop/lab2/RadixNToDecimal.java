package hus.oop.lab2;

import java.util.Scanner;

public class RadixNToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radixN = sc.nextInt();
        String str = sc.next();
        if (isCheck(str)){
            String hex = str.toLowerCase();
            int result = 0;

            for (int i = 0; i < hex.length(); i++) {
                char c = hex.charAt(i);
                int value;

                if ('0' <= c && c <= '9') {
                    value = c - '0';
                } else {
                    value = c - 'a' + 10;
                }

                result += value * (int) Math.pow(radixN, hex.length() - 1 - i);

            }
            System.out.println(result);
        }


    }
    public static boolean isCheck(String str) {
        for (char c : str.toCharArray()) {
            if ( !((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) {
                return false;
            }
        }
        return true;
    }


}

