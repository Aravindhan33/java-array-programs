public class SecondBiggest {
    public static void main(String[] args) {
        int a[] = { 43, 56, 12, 98, 77 };
        int fb = a[0], sb = a[1], temp = 0;
        for (int i = 2; i < a.length; i++) {
            if (a[i] > fb) {
                temp = fb;
                fb = a[i];
                sb = temp;
            }
            if (a[i] > sb && a[i] < fb)
                sb = a[i];
        }
        System.out.println("the second bigest element is " + sb);

    }

}
