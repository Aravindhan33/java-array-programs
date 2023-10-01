package arrayIntegers;

public class MinDiffInArray {

	public static void main(String[] args) {
		int [] a = {23,41,6,78,23,44,36};
		int x = 32;
		int max=Integer.MAX_VALUE;
		int ele=a[0];
		for(int i = 0;i<a.length;i++) {
			int diff=a[i]-x;
			if(diff<0)
				diff=diff*-1;
			if(diff<max) {
				max=diff;
			ele=a[i];
			}
		}
		System.out.println(ele);

	}

}
