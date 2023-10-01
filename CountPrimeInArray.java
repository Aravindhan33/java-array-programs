public class CountPrimeInArray {
    public static void main(String[] args) {
        int[] a = { 14, 65, 33, 13, 97, 11 };
        int count = 0;
        System.out.println("the prime numbers are in the array ");
        for (int i = 0; i < a.length; i++) {
            int count1 = 0;
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0)
                    count1++;
            }
            if (count1 == 2) {
                count++;
                System.out.println(a[i]);
            }

        }
        System.out.println("total number of prime numbers are " + count);

    }

}
