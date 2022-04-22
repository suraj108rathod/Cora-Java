package Array;

import java.util.Arrays;

public class Ascending_Descdending {

	public static void main(String[] args) {
		 String a[]= {"R,J,S,N"};
		 Arrays.sort(a);
		 for(int i=0;i<a.length-1;i++) {
			 System.out.println(a[i]);
		 }
		 for(int i=0;i>a.length-1;i--) {
			 System.out.println(a[i]);
		 }
		

	}

}
