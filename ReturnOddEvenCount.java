public class ReturnOddEvenCount {
    public static void main(String[] args) {
        int[] a = { 56, 67, 12, 98, 67, 32 };
        int[] res = getEvenOddCount(a);
        System.out.println("the even number count is " + res[0] + res[1]);

    }

    private static int[] getEvenOddCount(int[] a) {
        int ec = 0, oc = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                ec++;
            else
                oc++;
        }
        int[] c = { oc, ec };
        return c;
    }

}
