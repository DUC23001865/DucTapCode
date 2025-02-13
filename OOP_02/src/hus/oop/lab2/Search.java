package hus.oop.lab2;

public class Search {

        // Phương thức tìm chỉ số của key trong mảng, trả về -1 nếu không tìm thấy
        public static int search(int[] array, int key) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == key) {
                    return i; // Trả về chỉ số nếu tìm thấy phần tử
                }
            }
            return -1; // Trả về -1 nếu không tìm thấy
        }

        // Phương thức kiểm tra với đầu vào từ bàn phím
        public static void testSearch() {
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

            int index = search(array, key);
            if (index != -1) {
                System.out.println("The number " + key + " is found at index " + index + ".");
            } else {
                System.out.println("The number " + key + " is not found in the array.");
            }

            scanner.close();
        }

        public static void main(String[] args) {
            testSearch();
        }
    }


