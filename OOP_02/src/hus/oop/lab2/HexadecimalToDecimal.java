package hus.oop.lab2;

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số thập lục phân: ");
        String str = sc.nextLine();

        if (!isHexString(str)) {
            System.out.println("Not a hexadecimal");
        } else {
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

                result += value * (int) Math.pow(16, hex.length() - 1 - i);
            }

            System.out.println("Decimal: " + result);
        }
        sc.close();
    }

    // Phương thức kiểm tra xem chuỗi có phải là số hệ thập lục phân hợp lệ không
    public static boolean isHexString(String hexStr) {
        for (char ch : hexStr.toCharArray()) {
            if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'))) {
                return false;
            }
        }
        return true;
    }
}
