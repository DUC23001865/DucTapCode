package hus.oop.lab1;

public class Fibonacci {
    public static void main(String[] args) {
        int n=3;
        int f1 =1;
        int f2 =1;
        int max = 20;
        int sum = f1 + f2 ;
        double avg;
        int kq = 2;
        System.out.println("The fist" + max + "hus.oop.lab1.Fibonacci number is ");
        System.out.print(f1 + " ");
        System.out.print(f2 + " ");
        while (n<=max){
            kq = sum + kq;
            n++;
            System.out.print(sum + " ");
            f1 = f2;
            f2 = sum;
            sum = f1 + f2 ;
        }
        System.out.println();
        avg = kq/max;
        System.out.println("The average of fibonacci number is " + avg);
    }
}
