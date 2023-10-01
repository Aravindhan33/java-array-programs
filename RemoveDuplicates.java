package arrayIntegers;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int [] a= {23,54,65,87,23,54,43,65,23};

		for(int i =0; i<a.length ; i++) {
			for( int j=i+1 ; j<a.length ; j++) {
				if(a[i]==a[j])
					a[j]=0;
			}
		}
		for(int i=0;i<a.length ; i++) {
			if(a[i]!=0) {
				
				System.out.printf(a[i]+"\t");
				
			}
		}

	}
}


