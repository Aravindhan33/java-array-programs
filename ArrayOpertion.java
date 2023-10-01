package arrayIntegers;

public class ArrayOpertion {

	public int secBiggest(int[] a) {
		int fBig= a[0], sBig=a[1];

		for(int i = 0;i<a.length ; i++) {
			if(a[i]>fBig) {
				a[i]= fBig;
				sBig=fBig;
			}
			else if (a[i]>sBig && a[i]!=a[i]) {
				sBig = a[i];
			}
		}
		return sBig;

	}

	public int nThBiggest(int[] a, int ele) {
		for(int i =0; i<a.length ; i++) {
			int count =0;
			for(int j=1; j<a.length ; j++) {
				if(a[i]<a[j])
					count++;
			}
			if(count==ele-1)
				return a[i];
		}
		System.out.println(ele+"nd  bigest element is not there ");
		System.exit(0);
		return 0;
	}

	public void commonElements(int[] a, int[] b) {
		System.out.println("the commom elements are ");
		for (int i= 0; i<a.length; i++) {
			for(int j=0 ; j<b.length; j++) {
				if(a[i]==b[j])
					System.out.println(a[i]);

			} 
		}	

	}

	public void specifiedElements(int[] a, int n) {
		int count=0;
		for(int i =0 ;i<a.length ; i++) {

			if(n==a[i])
				count++;
		}
		System.out.println("the number of time given number repeated is " + count);
	}

	public void occurencePrint(int[] a) {
		System.out.println("the occurence elements are");
		int count=0;
		for(int i=0 ; i<a.length ; i++) {
			for(int j =i+1 ; j<a.length ;j++) {
				if ( a[i]==a[j]) 
					count++;
					System.out.println(a[j]);

			}

		}

	}

	public int nThSmallest(int[] a, int n) {  //{23,34,56,75,89};
		for(int i = 0; i<a.length ;i++) {
			int count=0;
			for(int j=1 ; j<a.length ; j++) {
				if(a[i]>a[j])
					count++;
			} if(count==n-1)
				return a[i];

		}
		System.out.println(n+"nd  smallest element is not there ");
		System.exit(0);
		return 0;
	}





}