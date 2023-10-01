public class SearchSpecifiedElementInArray {
    public static void main(String[] args) {
        int[] a = { 23, 54, 67, 12, 98, 45 };
        int res = getIndexOfInt(a, 99);
        if (res == -1) {
            System.out.println("element is not present ");
        }
        System.out.println(res);

    }

    private static int getIndexOfInt(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n)
                return i;
        }
        return -1;
    }
}
