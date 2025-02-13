package hus.oop.lab1;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        double diameter = 2 * radius;
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Diameter is " + diameter);
    }
}
