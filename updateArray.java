public class updateArray {
    public static void main(String[] args) {
        int a[] = { 34, 65, 13, 98, 43 };
        System.out.println("the updated array is  ");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (a[i] * 1.15);
            System.out.print(a[i] + " ");

        }
    }
}
