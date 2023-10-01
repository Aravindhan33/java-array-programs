import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[5];
        double sum = 0;
        System.out.println("enter the elements ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
            sum = sum + a[i];
        }
        System.out.println("the average is " + sum / a.length);
        sc.close();
    }
}
