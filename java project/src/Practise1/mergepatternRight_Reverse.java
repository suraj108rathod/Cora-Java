package Practise1;

public class mergepatternRight_Reverse {
	public static void main(String[] args) {
		
	
	for(int i=1;i<=4;i++) {
		
		for(int j=1;j<=i;j++) {
			
			System.out.print("*");
		}
		System.out.println();
	}
	  for(int i=1;i<=4;i++) {
		  
		  for(int j=3;j>=i;j--) {  // j is the change value j=4;reverse to 3
			
			  System.out.print("*");
		  }
		  System.out.println();
	  }

}
}
