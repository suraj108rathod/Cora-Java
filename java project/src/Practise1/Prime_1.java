package Practise1;

public class Prime_1 {
	public static void main(String[] args) {
		int a=10, temo=0;
		int d=a/2;
		if(a == 0 || a == 1 ) {
			System.out.println("This is not prime no");
		}
		for(int j=2; j<d; j++) 
		{
			if(a%j ==0)
			{

				System.out.println("This is not prime no "+a);
				temo=1;
			}
		}
		  if(temo ==0)
		  {
			  System.out.println("This is the prime no");
		  }
		
	}

}
