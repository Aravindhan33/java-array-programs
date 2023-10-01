import java.util.Scanner;

public class ReverseOfIntegerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] a = getArray(n);
        displayArray(a);
        reverseArray(a);

        sc.close();

    }

    static int[] getArray(int n) {
        System.out.println("enter the array elements ");
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        sc.close();
        return a;

    }

    static void displayArray(int[] a) {
        System.out.println("the entered array elements are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }

    }

    static void reverseArray(int[] a) {
        System.out.println();
        System.out.println("the Reversed Array is");
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
    }

}
