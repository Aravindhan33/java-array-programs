package arrayIntegers;

public class NearestNumberInArray {

	public static void main(String[] args) {
		
		int[] a= {12,16,14,56,47,34,27,8,56};
		int x=15;
		int max= Integer.MAX_VALUE;
		int ele=a[0];
		for(int i =0;i<a.length;i++) {
			int diff=a[i]-x;
			if(diff<0)
				diff=diff*-1;   //3
			if(diff<max) {      
				max= diff;    //3
				ele=a[i];     //16
			}
		}
		System.out.println("the nearest value is "+ele);
		

	}

}
