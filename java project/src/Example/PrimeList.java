package Example;

  public class PrimeList {
	  public static void main(String[] args) {
		  for(int n=1;n<=100;n++) {
			  int s=0;
			  for(int i=2;i<=n-1;i++) {
				  if(n%i==0) {
					  s=s+1;
				  }
			  }
			    if(s==0) {
			    	System.out.println(n);
			    }
		  }
		
	}

  }
