package hus.oop.lab2;

import java.util.Scanner;

public class HexadecimalToBinary {
    public static String hexadecimalToBinary(String hexStr) {
        Scanner sc = new Scanner(hexStr);
        StringBuilder binaryStr = new StringBuilder();

        // Bảng ánh xạ giá trị hex sang nhị phân
        String[] hexToBinMap = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };

        hexStr = hexStr.toUpperCase(); // Chuyển về chữ hoa để dễ xử lý

        for (char c : hexStr.toCharArray()) {
            if (c >= '0' && c <= '9') {
                binaryStr.append(hexToBinMap[c - '0']);
            } else if (c >= 'A' && c <= 'F') {
                binaryStr.append(hexToBinMap[c - 'A' + 10]);
            } else {
                return "Invalid hexadecimal input"; // Nếu có ký tự không hợp lệ
            }
        }
        return binaryStr.toString();
    }

    // Phương thức kiểm tra với đầu vào từ người dùng
    public static void testHexadecimalToBinary() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hexadecimal string: ");
        String hexStr = scanner.nextLine();

        String binaryStr = hexadecimalToBinary(hexStr);

        System.out.println("The equivalent binary string is: " + binaryStr);

        scanner.close();
    }

    public static void main(String[] args) {
        testHexadecimalToBinary();
    }
}
