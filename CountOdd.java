public class CountOdd {
    public static void main(String[] args) {
        int[] a = { 65, 87, 24, 56, 14, 36, 98, 45 };
        System.out.println("The number of odd numbers is " + countOdd(a));
    }

    static int countOdd(int[] a) {
        int oc = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                oc++;

        }
        return oc;
    }
}
