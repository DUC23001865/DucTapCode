package hus.oop.lab2;

public class Print {
    // Phương thức in mảng theo định dạng yêu cầu
    public static void print(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]); // In phần tử

            if (i < array.length - 1) { // Nếu chưa phải phần tử cuối, thêm dấu phẩy và khoảng trắng
                System.out.print(", ");
            }
        }

        System.out.println("]"); // Đóng dấu ngoặc vuông
    }

    // Phương thức kiểm tra với đầu vào từ bàn phím
    public static void testPrint() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Array content: ");
        print(array); // Gọi phương thức in mảng

        scanner.close();
    }

    public static void main(String[] args) {
        testPrint();
    }
}
