package Practise1;

public class DescendingNo {
	public static void main(String[]args) {
		int temp;
		int a[]= {3,2,1,4,7,6,5};
		System.out.println("Descending Order");
		
		for (int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length; j++) {	
			if(a[i]<a[j]) {//condition for descending
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
	 	}
	}
	for(int i : a) {
		System.out.println(i);
	}
}
}


