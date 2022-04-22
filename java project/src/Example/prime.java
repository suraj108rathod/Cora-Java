package Example;

   public class prime {
	   public static void main(String[] args) {
		   int n=7; int s=0;
		   for(int i=2;i<=n-1;i++) {
			   if(n%i==0) {
				   s=s+1;
			   }
		   }
		      if(s==0) {
		    	  System.out.println(n+"is prime no");
		      }
		      else {
		    	  System.out.println(n+"is not prime no");
		      }
	   }

}
