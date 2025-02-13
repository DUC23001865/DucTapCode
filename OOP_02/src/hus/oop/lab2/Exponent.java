package hus.oop.lab2;

import java.util.Scanner;

public class Exponent {
    public static boolean hasEight(int number) {
        number = Math.abs(number); // Đảm bảo số dương để tránh vấn đề với số âm

        while (number > 0) {
            int digit = number % 10; // Lấy chữ số cuối cùng
            if (digit == 8) {
                return true; // Nếu có chữ số 8, trả về true
            }
            number /= 10; // Loại bỏ chữ số cuối cùng
        }

        return false; // Không tìm thấy chữ số 8
    }

    // Phương thức kiểm tra bằng cách nhập từ bàn phím
    public static void testHasEight() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (hasEight(number)) {
            System.out.println("The number " + number + " contains the digit 8.");
        } else {
            System.out.println("The number " + number + " does not contain the digit 8.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        testHasEight();
    }
}
