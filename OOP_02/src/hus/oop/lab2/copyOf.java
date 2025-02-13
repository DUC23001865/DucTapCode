package hus.oop.lab2;

public class copyOf {
    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length]; // Tạo mảng mới có cùng độ dài
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i]; // Sao chép từng phần tử
        }
        return copy; // Trả về mảng sao chép
    }

    // Phương thức kiểm tra sao chép mảng với đầu vào từ bàn phím
    public static void testCopyOf() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] copiedArray = copyOf(array);

        System.out.print("Original array: ");
        printArray(array);
        System.out.print("Copied array: ");
        printArray(copiedArray);

        scanner.close();
    }

    // Phương thức in mảng ra màn hình
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        testCopyOf();
    }
}
