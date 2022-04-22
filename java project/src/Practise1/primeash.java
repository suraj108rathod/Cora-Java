package Practise1;

import java.util.Scanner;

public class primeash {
	 
     public static void main(String[] args) {
    //	int a[]= {12,56,7,46,97,46,4,76,71,83};
    //	for (int j=0; j<a.length; j++) {		Array
   // int	x=a[j];
    
    	 int n=7;
	 int temp=0;
	for(int i=2; i<=n/2; i++) {
		if(n%i==0) {
			temp=1;
			break;
		}
	}
	if(temp==0)
	System.out.println(n+": is prime no.");
	else
		System.out.println(n+" : is not prime no.");
}
}

