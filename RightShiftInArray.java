 package arrayIntegers;

public class RightShiftInArray {

	public static void main(String[] args) {
		int[] a= {1 , 3, 6, 7, 9};
		int[] b = new int[a.length];

		/*for(int i=a.length-1 ;i<a.length ; i++ ) {
			a[i]=b[0];
		}
		for(int i=0;i<a.length-1 ;i++) {
			a[i]=b[i+1];
		}*/

		for(int i = 0; i<a.length ; i++) {

				if(i==a.length-1)
					b[0]=a[a.length-1];
				else
					b[i+1]=a[i];
				
			}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]);
		}
	}

}
