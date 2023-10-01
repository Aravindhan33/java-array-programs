import java.util.Scanner;

public class InsertArrayInAnotherArrayFromIndex {
    public static void main(String[] args) {
        int[] a = { 12, 26, 96, 76 };
        int[] b = { 56, 23, 94, 16, 56 };

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index ");
        int in = sc.nextInt();
        int[] res = getNewArray(a, b, in);
        System.out.println("the updated array is ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();

    }

    private static int[] getNewArray(int[] a, int[] b, int in) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < b.length; i++) {
            c[in + i] = b[i];
        }
        for (int j = 0; j < a.length; j++) {
            if (j < in)
                c[j] = a[j];
            else
                c[b.length + j] = a[j];

        }
        return c;
    }

}
