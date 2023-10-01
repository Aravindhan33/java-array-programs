package arrayIntegers;

public class MergeArrayInZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,6,4,8,3};
		int[] b = {8,4,3};
		
		int[] c = new int[a.length+b.length];
		int p=0; int i=0;
		while(i<a.length && i< b.length ) {
			a[i] = c[p];
			p++;
			b[i]=c[p];
			p++;
			i++;
		}
		while(i<a.length) {
			c[p] = a[i];
			p++;
			i++;
		}
		while(i<b.length) {
			c[p] = b[i];
			p++;
			i++;
		}
		for(int k =0; k<c.length ; k++) {
			System.out.print(c[k]);
		}
	}

}
