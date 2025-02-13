package hus.oop.lab1;

public class ComputerPI {
    public static void main(String[] args) {
        double kq;
        int max = 1000;
        double sum = 0.0;
        for (int i = 1;i<=max;i=i+4) {
        sum = sum + 1.0/i ;
        }

        for (int i = 3;i<=max;i=i+4) {
            sum = sum - 1.0/i ;
        }

        kq = 4 * sum;
        System.out.println("Pi" + kq);
    }
}
