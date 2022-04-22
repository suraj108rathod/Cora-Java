package Practise1;

   public class Palindrome {
		
	   String s = "151";//index: 0,1,2
	   int l = s.length();//3
	   String r ="";//to store reverse string
	   
	     public void pal() {
	    	 
	    	 for(int i = l-1; i>=0; i--) { //i=3-1=2,1,0
	    		 
	    		 r =r+s.charAt(i);//151
	    	 }
	    	   System.out.println("r="+r);
	    	   
	    	   if(s.equals(r)) {
	    		   System.out.println("Number is palindrome");
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Number is not palindrome");
	    	   }
	     }   
	         public static void main(String[] args) {
				Palindrome obj = new Palindrome();
				obj.pal();
			}

   }
