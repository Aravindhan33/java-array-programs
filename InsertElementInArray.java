import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        int[] a = { 23, 54, 76, 89, 13, 53 };
        System.out.println("Before insertion");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the element to be inserted:");
        int ele = sc.nextInt();
        System.out.println("enter the index you want to insert ");
        int in = sc.nextInt();

        int[] b = getInsertedArray(a, ele, in);
        if (b == null) {
            System.out.println("insertion failed! ");
        } else
            System.out.println("After inserting ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        sc.close();
    }

    private static int[] getInsertedArray(int[] a, int ele, int in) {
        if (in > a.length || in < 0)
            return null;
        int[] x = new int[a.length + 1];
        x[in] = ele;
        for (int i = 0; i < a.length; i++) {
            if (i < in)
                x[i] = a[i];
            else
                x[i + 1] = a[i];
        }
        return x;

    }
}
