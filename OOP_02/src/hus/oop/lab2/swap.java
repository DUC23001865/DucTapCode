package hus.oop.lab2;

public class swap {
    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false; // Nếu độ dài khác nhau, không thể hoán đổi
        }

        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        return true; // Hoán đổi thành công
    }

    // Phương thức kiểm tra hoán đổi với đầu vào từ bàn phím
    public static void testSwap() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the number of elements for the first array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        System.out.println("Enter " + n1 + " elements for the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements for the second array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];

        System.out.println("Enter " + n2 + " elements for the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        System.out.println("Before swapping:");
        System.out.print("First array: ");
        printArray(array1);
        System.out.print("Second array: ");
        printArray(array2);

        if (swap(array1, array2)) {
            System.out.println("Swapped successfully.");
        } else {
            System.out.println("Swap failed. Arrays must have the same length.");
        }

        System.out.println("After swapping:");
        System.out.print("First array: ");
        printArray(array1);
        System.out.print("Second array: ");
        printArray(array2);

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
        testSwap();
    }
}
