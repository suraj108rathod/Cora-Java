package Practise1;

import java.util.Arrays;

public class allZeroRight {

	public static void main(String[] args) {
		int s[]= {2,0,3,4,0,0,4};
		Arrays.sort(s);
		//for(int i:s) {
		//	System.out.println(i);
		//}
		for(int j=s.length-1;j>=0;j--) {
			System.out.print(s[j]);
		}
	}



	}


