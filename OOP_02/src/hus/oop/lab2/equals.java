package hus.oop.lab2;

public class equals {
    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false; // Nếu độ dài khác nhau, hai mảng không thể giống nhau
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Nếu có bất kỳ phần tử nào khác nhau, trả về false
            }
        }

        return true; // Nếu tất cả phần tử giống nhau, trả về true
    }

    // Phương thức kiểm tra với đầu vào từ bàn phím
    public static void testEquals() {
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

        if (equals(array1, array2)) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        testEquals();
    }
}
