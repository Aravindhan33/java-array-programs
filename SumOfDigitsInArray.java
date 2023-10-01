public class SumOfDigitsInArray {
    public static void main(String[] args) {
        int[] a = { 23, 45, 12 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            while (a[i] != 0) {
                int d = a[i] % 10;
                sum = sum + d;
                a[i] = a[i] / 10;
            }
        }
        System.out.println("the sum of digis is " + sum);
    }

}
