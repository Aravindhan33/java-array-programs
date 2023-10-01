import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] a = { 34, 24, 76, 36 };
        int[] b = new int[a.length - 1];
        System.out.println("enter the element you want to delete ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the index position ");
        int in = sc.nextInt();
        System.out.println("after deletion ");
        for (int i = 0; i < a.length; i++) {
            if (n != a[i]) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        System.out.println("after deletion using index position");
        for (int i = 0; i < a.length; i++) {
            if (in < 0 || in > a.length)
                System.out.println("invalid index");
            else {
                if (i < in)
                    b[i] = a[i];
                else
                    b[i] = a[i + 1];
            }
            System.out.println(b[i] + "");

        }

        sc.close();

    }
}
