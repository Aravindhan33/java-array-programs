package arrayIntegers;

class CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {12,43,56,12,68,98,56};
		int big = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>big)
				big=a[i];
		}
		
		int[] b= new int[big+1];    // default values of array is 0,0,0,0,0,0,0,0,0,0,
		
		for(int i = 0; i<a.length;i++) {     
			b[a[i]]++;                       // 12 present so b[12] --> 1 ; 12 another time present so b[12] --> 2
		}
		for(int i =0; i<b.length;i++) {
			if(b[i]!=0)
				System.out.println(i+"--> "+ b[i] );
				
		}

	}

}
