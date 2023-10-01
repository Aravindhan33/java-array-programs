class arrayInteger {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = { 2, 5, 4, 7, 1, 8 };
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}