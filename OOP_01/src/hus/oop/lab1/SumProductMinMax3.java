package hus.oop.lab1;

import java.util.Scanner;

public class SumProductMinMax3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        int product = num1 * num2 * num3;
        int testMin = Math.min(num1, num2);
        int min = Math.min(testMin, num3);
        int testMax = Math.max(num1, num2);
        int max = Math.max(testMax, num3);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(sum);
        System.out.println(product);
        System.out.println(min);
        System.out.println(max);
    }
}
