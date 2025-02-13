package hus.oop.lab2;

import java.util.Scanner;

public class reverse {
    Scanner sc = new Scanner(System.in);
    public static void reverse(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // Phương thức kiểm tra với đầu vào từ người dùng
    public static void testReverse() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + arrayToString(array));

        reverse(array);

        System.out.println("Reversed array: " + arrayToString(array));

        scanner.close();
    }

    // Phương thức chuyển mảng thành chuỗi để in ra màn hình
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        testReverse();
    }
}
