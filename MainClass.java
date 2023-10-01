package arrayIntegers;



class MainClass {

	public static void main(String[] args) {
		
	int a[] = {23,34,56,75,89};
	int[] b = {34,54,12,77,89};
	
	ArrayOpertion ao = new ArrayOpertion();
	
	
	//int secBig = ao.secBiggest(a);
	//System.out.println("the second Biggest number is " + secBig);
	
	//int nThBig = ao.nThBiggest(a,3);
	//System.out.println("the n th biggest element is " + nThBig);
	
	//int nThSmall= ao.nThSmallest(a,2);
	//System.out.println("the n th smallest element is " + nThSmall);
	
	ao.commonElements(a,b);
	
	ao.specifiedElements(a,23);
	
	ao.occurencePrint(a);
	

	}

}
