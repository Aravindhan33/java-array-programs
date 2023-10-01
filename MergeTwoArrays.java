package arrayIntegers;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		
		int[] a= { 1,6,3,9};
		int[] b = {6,4,8,2};
		int[] c = new int[a.length+b.length];
		int p =0;
		
		for(int i = 0 ; i<a.length ;i++) {
			c[p] = a[i];
			p++;
		}
		for(int i = 0 ; i<b.length ;i++) {
			c[p] = b[i];
			p++;
		}
		for(int i =0;i<c.length;i++) {
			System.out.print(c[i]+",");
		}

	}

}
