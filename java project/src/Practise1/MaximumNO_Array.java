package Practise1;

public class MaximumNO_Array {
	public static void main(String[] args) {
		int arr[]= {2,8,9,7,6,6,4,3,10};
		int ref=arr[1];
		for(int j=1;j<=arr.length-1;j++) {
			if(ref<arr[j]) {
				ref=arr[j];
			}
		}
		System.out.println("Max number is: "+ref);
	}


	}


