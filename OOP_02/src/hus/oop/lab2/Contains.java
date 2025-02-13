package hus.oop.lab2;

public class Contains {

        // Phương thức kiểm tra xem mảng có chứa giá trị key hay không
        public static boolean contains(int[] array, int key) {
            for (int num : array) {
                if (num == key) {
                    return true; // Nếu tìm thấy key, trả về true
                }
            }
            return false; // Nếu không tìm thấy, trả về false
        }

        // Phương thức kiểm tra với đầu vào từ bàn phím
        public static void testContains() {
            java.util.Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            int[] array = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter the number to search: ");
            int key = scanner.nextInt();

            if (contains(array, key)) {
                System.out.println("The array contains " + key + ".");
            } else {
                System.out.println("The array does not contain " + key + ".");
            }

            scanner.close();
        }

        public static void main(String[] args) {
            testContains();
        }

}
