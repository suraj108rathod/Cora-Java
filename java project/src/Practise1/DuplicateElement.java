package Practise1;

public class DuplicateElement {
	public static void main(String[]args) {
		
			int arr[]= {3,4,5,3,7,8,5,4};
			
			for(int i=0; i<arr.length; i++) {
				
				for(int j=i+1; j<arr.length; j++) {
				
					if(arr[i]==arr[j]) {
					
						System.out.println(arr[i]);
						
	
				  }
				}
			}
		}
	}


