public class SortingIntArray {
    public static void main(String[] args) {
        int a[] = { 23, 76, 45, 92, 17 };
        int temp = 0;
        System.out.println("after sorting ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
