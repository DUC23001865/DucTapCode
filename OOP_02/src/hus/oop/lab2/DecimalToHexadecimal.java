package hus.oop.lab2;
import java.util.Scanner;
public class DecimalToHexadecimal {
    public static String decimalToHexadecimal(int positiveInteger) {
        if (positiveInteger < 0) {
            throw new IllegalArgumentException("Number must be positive.");
        }
        if (positiveInteger == 0) return "0"; // Trường hợp đặc biệt

        StringBuilder hexStr = new StringBuilder();
        char[] hexDigits = "0123456789ABCDEF".toCharArray();

        while (positiveInteger > 0) {
            int remainder = positiveInteger % 16;
            hexStr.insert(0, hexDigits[remainder]); // Thêm vào đầu chuỗi
            positiveInteger /= 16;
        }

        return hexStr.toString();
    }

    // Phương thức kiểm tra với đầu vào từ người dùng
    public static void testDecimalToHexadecimal() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive decimal number: ");
        int decimalNumber = scanner.nextInt();

        if (decimalNumber < 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            String hexStr = decimalToHexadecimal(decimalNumber);
            System.out.println("The equivalent hexadecimal number is: " + hexStr);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        testDecimalToHexadecimal();
    }
}
