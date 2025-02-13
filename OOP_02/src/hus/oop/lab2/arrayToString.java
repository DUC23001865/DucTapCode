package hus.oop.lab2;

public class arrayToString {
    // Phương thức chuyển mảng thành chuỗi theo định dạng yêu cầu
    public static String arrayToString(int[] array) {
        if (array.length == 0) {
            return "[]"; // Nếu mảng rỗng, trả về chuỗi "[]"
        }

        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {
            result.append(array[i]); // Thêm phần tử vào chuỗi

            if (i < array.length - 1) { // Nếu chưa phải phần tử cuối, thêm dấu phẩy và khoảng trắng
                result.append(", ");
            }
        }

        result.append("]"); // Đóng dấu ngoặc vuông
        return result.toString();
    }

    // Phương thức kiểm tra với đầu vào từ bàn phím
    public static void testArrayToString() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        String result = arrayToString(array);
        System.out.println("Array as string: " + result);

        scanner.close();
    }

    public static void main(String[] args) {
        testArrayToString();
    }
}
