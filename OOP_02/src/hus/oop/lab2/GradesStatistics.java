package hus.oop.lab2;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double  ave = 0;
        double[] grades = new double[n];
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextDouble();
            ave += grades[i];
        }
        System.out.println( ave/n);
        double min = grades[0];
        double max = grades[0];
        for (int i = 0; i < n; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        System.out.println( min);
        System.out.println( max);


    }
}
