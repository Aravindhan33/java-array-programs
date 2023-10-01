public class BiggestAndSmallestFromArray {
    public static void main(String[] args) {
        int[] a = { 23, 65, 14, 97, 54, 26, 90 };
        int bn = a[0], sn = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > bn)
                bn = a[i];
            else if (a[i] < sn)
                sn = a[i];
        }
        System.out.println("the biggest element is " + bn);
        System.out.println("the smallest element is " + sn);
    }

}
