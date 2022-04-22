package Practise1;

public class Factorial {
	    int n = 7;
	      public void fact() {
	    	  for(int i=n-1;i>0;i--) {//4!=4*3*2*1     //i=3,2,1
	    		  
	    		  n = n*i;//4*3=12*2=24*1=24
	    	  }
	    	  System.out.println("Factorial of given no is = "+n);
	    	  
	       }
	        public static void main(String[] args) {
				Factorial obj = new Factorial();
				obj.fact();
			}

}
