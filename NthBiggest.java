import java.util.Scanner;

public class NthBiggest {
    public static void main(String[] args) {
        int[] a = { 23, 6, 43, 78, 26, 54 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n ");
        int n = sc.nextInt();

        sc.close();

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] > a[i])
                    count++;
            }
            if (count == n - 1)
                System.out.println(a[i]);
        }

    }
}
