package hus.oop.lab1;

public class ExtractDigits {
    public static void main(String[] args) {
        int n = 15423;
        while (n>0){
            int digits = n%10;
            System.out.print(digits + " ");
            n = n/10;
        }
    }
}
